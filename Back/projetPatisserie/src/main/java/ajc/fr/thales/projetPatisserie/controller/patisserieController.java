package ajc.fr.thales.projetPatisserie.controller;


import java.util.List;
import java.util.Objects;

import javax.management.relation.RelationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ajc.fr.thales.projetPatisserie.model.Patisserie;
import ajc.fr.thales.projetPatisserie.repository.patisserieRepository;
import ajc.fr.thales.projetPatisserie.service.patisserieService;

@RestController
@RequestMapping("/patisserie")
@CrossOrigin
public class patisserieController {
	
	@Autowired
	patisserieRepository pr;
	
	@Autowired
	patisserieService ps;
	
	@GetMapping("")
	public List<Patisserie> getAll(){
		return pr.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Patisserie getById(@PathVariable Long id) {
		return ps.getById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
				"Le contact avec l'id [" + id + "] n'existe pas"));
	}
	
	
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Patisserie createPatisserie(@RequestBody Patisserie p) {
		if(Objects.isNull(p.getId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id is null");
		}
		return pr.save(p);
				
	}
	
	@PutMapping("")
	public Patisserie modifyPatisserie(@RequestBody Patisserie p) {
		try {
			return ps.updatePatisserie(p);
		} catch (IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}

	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deletePatisserie(@PathVariable Long id) throws RelationException {
		if(!ps.getById(id).isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "id ["+id+"] does not exist");
		}
		try {
			ps.deleteClientbyId(id);
		} catch (RelationException e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
}
