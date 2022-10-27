package ajc.fr.thales.projetPatisserie.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

import ajc.fr.thales.projetPatisserie.model.Commande;
import ajc.fr.thales.projetPatisserie.model.exception.EmptyIdException;
import ajc.fr.thales.projetPatisserie.model.exception.RelationException;
import ajc.fr.thales.projetPatisserie.service.CommandeService;

@RestController
@RequestMapping("/au-bonheur-des-gourmands")
@CrossOrigin(origins ="*")
public class CommandeController {
	
	@Autowired
	CommandeService service;
	
	@CrossOrigin
	@GetMapping("/commandes")
	public List<Commande> getProduits() {
		return service.findAll();
	}

	@CrossOrigin
	@GetMapping("/commande/{id}")
	public Optional<Commande> getById(@PathVariable Long id) {
		if (Objects.isNull(id))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return service.getById(id);
	}

	@CrossOrigin
	@PostMapping("/commande/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Commande createCommande(@RequestBody Commande c) throws RelationException {
		
		if (Objects.nonNull(c.getId()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Commande existante");
		
		if(Objects.isNull(c.getPatisseries()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Commande sans patisseries");
		
		if(Objects.isNull(c.getUtilisateur()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Commande sans utilisateur");
		
		if(Objects.isNull(c.getUtilisateur().getId()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Commande de utilisateur sans id");
		
		return service.create(c);
	}

	@CrossOrigin
	@PutMapping("commande/")
	public Commande updateCommande(@RequestBody Commande c) throws EmptyIdException {
		if (Objects.isNull(c.getId()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		return service.modifyCommande(c);

	}
	
	@PutMapping("commande/{id}/confirm")
	@CrossOrigin
	public Commande confirmCommandes(@PathVariable Long id) throws Exception {
		if (Objects.isNull(id))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		
		return service.confirmCommandes(id);

	}


	@DeleteMapping("/commande/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	@CrossOrigin
	public void deleteCommande(@PathVariable Long id) {
		if (Objects.isNull(id))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Id de commande non renseigné");
		service.delete(id);
	}
	
	
	@GetMapping("commandes/not-confirmed")
	@CrossOrigin
	public List<Commande> getCommandesNotConfirmed() {
	return service.getCommandesNotConfirmed();
	}

}
