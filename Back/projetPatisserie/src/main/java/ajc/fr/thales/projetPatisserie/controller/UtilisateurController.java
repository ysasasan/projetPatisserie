package ajc.fr.thales.projetPatisserie.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import ajc.fr.thales.projetPatisserie.model.Utilisateur;
import ajc.fr.thales.projetPatisserie.model.exception.EmptyIdException;
import ajc.fr.thales.projetPatisserie.service.UtilisateurService;

@RestController
@RequestMapping("/au-bonheur-des-gourmands")
@CrossOrigin
public class UtilisateurController {
	
	@Autowired
	UtilisateurService service;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getAllUtilisateurs() {
		return service.findAll();
	}
	
	@GetMapping("/utilisateur/{email}/{mdp}")
	public Utilisateur getByMailPass(@PathVariable String email, @PathVariable String mdp) {
		if(Objects.isNull(email))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Email non renseigné");
		if(Objects.isNull(mdp))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mot de passe non renseigné");
		return service.getByMailPass(email, mdp);
	}
	

	@GetMapping("/utilisateur/connexion")
	public Utilisateur getByHeaderIds(@RequestHeader String email, @RequestHeader String mdp) {
		if(Objects.isNull(email))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Email non renseigné");
		if(Objects.isNull(mdp))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mot de passe non renseigné");
		return service.getByMailPass(email, mdp);
	}
	
	@GetMapping("/utilisateur/{id}")
	public Optional<Utilisateur> getById(@PathVariable Long id) {
		if(Objects.isNull(id))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		return service.getById(id);
	}
	
//	@GetMapping("/utilisateur/{email}/{mdp}")
//	public Optional<Utilisateur> getByHeaderIds(@PathVariable Long id) {
//		if(Objects.isNull(id))
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//		return service.getById(id);
//	}
	
	@PostMapping("/utilisateur/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Utilisateur createUser(@RequestBody Utilisateur u) {
		if(Objects.nonNull(u.getId()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		return service.createUser(u);
	}
	
//	@PostMapping("/register")
//	@ResponseStatus(HttpStatus.CREATED)
//	public void registerUserAsClient(@RequestBody Utilisateur u, Client c) {
//		
//		System.err.println("---------");
//		System.out.println(u);
//		System.out.println(c);
		
//		if(Objects.nonNull(c.getId()))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//		return service.createClient(c);
	
		
		//u.setMdp(pe.encode(u.getMdp()));
		//userRepo.save(u);
		
		//return null;
//	}
	
	@PutMapping("/utilisateur")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur u) throws EmptyIdException {
		if(Objects.isNull(u.getId()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		return service.updateUser(u);
	}
	
	@DeleteMapping("/utilisateur/{id}")
	public void deleteUtilisateur(@PathVariable Long id) {
		if(Objects.isNull(id))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		service.deleteUser(id);
	}
	

}
