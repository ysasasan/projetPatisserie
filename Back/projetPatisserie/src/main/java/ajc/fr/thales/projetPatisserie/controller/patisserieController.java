package ajc.fr.thales.projetPatisserie.controller;

<<<<<<< HEAD
public class PatisserieController {
=======

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ajc.fr.thales.projetPatisserie.model.Patisserie;
import ajc.fr.thales.projetPatisserie.repository.patisserieRepository;

@RestController
@RequestMapping("/patisserie")
@CrossOrigin
public class patisserieController {
	
	@Autowired
	patisserieRepository pr;
	
	@GetMapping("")
	public List<Patisserie> getAll(){
		return pr.findAll();
		
	}
	
	@GetMapping("/{id}")
	
	
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Patisserie createPatisserie(@RequestBody Patisserie p) {
		return pr.save(p);
				
	}
>>>>>>> c441f95 (CR patisserie)

}
