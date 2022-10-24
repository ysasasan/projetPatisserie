package ajc.fr.thales.projetPatisserie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ajc.fr.thales.projetPatisserie.model.Utilisateur;
import ajc.fr.thales.projetPatisserie.repository.utilisateurRepository;
import ajc.fr.thales.projetPatisserie.service.utilisateurService;

@RestController
@RequestMapping("/au-bonheur-des-gourmands")
@CrossOrigin
public class utilisateurController {
	
	@Autowired
	utilisateurService service;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getAllUtilisateurs() {
		return service.findAll();
	}
//
//	@GetMapping("/{id}")
//	public Optional<Client> getById(@PathVariable Long id) {
//		if(Objects.isNull(id))
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//		return service.getById(id);
//	}
//	
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Client createClient(@RequestBody Client c) {
//		if(Objects.nonNull(c.getId()))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//		return service.createClient(c);
//	}
//	
//	@PostMapping("/register")
//	@ResponseStatus(HttpStatus.CREATED)
//	public void registerUserAsClient(@RequestBody Utilisateur u, Client c) {
//		
//		System.err.println("---------");
//		System.out.println(u);
//		System.out.println(c);
//		
////		if(Objects.nonNull(c.getId()))
////			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
////		return service.createClient(c);
//		
//		
//		
//		//u.setMdp(pe.encode(u.getMdp()));
//		//userRepo.save(u);
//		
//		//return null;
//	}
//	
//	@PutMapping
//	public Client updateClient(@RequestBody Client c) throws EmptyIdException {
//		if(Objects.isNull(c.getId()))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//		return service.updateClient(c);
//	}
//	
//	@DeleteMapping("/{id}")
//	public void deleteClient(@PathVariable Long id) {
//		if(Objects.isNull(id))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//		service.deleteClient(id);
//	}
	

}
