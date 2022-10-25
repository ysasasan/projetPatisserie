package ajc.fr.thales.projetPatisserie.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;



import ajc.fr.thales.projetPatisserie.model.Utilisateur;
import ajc.fr.thales.projetPatisserie.model.exception.EmptyIdException;
import ajc.fr.thales.projetPatisserie.repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	@Autowired
	UtilisateurRepository repo;
	
	public List<Utilisateur> findAll() {
		return repo.findAll();
	}
	
	public Optional<Utilisateur> getById(Long id) {
		return repo.findById(id);
	}

	public Utilisateur createUser(Utilisateur u) {
		Utilisateur user = new Utilisateur(u);
		return repo.save(user);
	}
	
//	public Client registerUserAsClient(Map<Utilisateur, Client> UtilisateurClient) {
//		
//		System.out.println(UtilisateurClient);
//		
//		//authServ.createUserBasicAuth(u);
//		//return repo.save(c);
//		
//		return null;
//	}

	
	public Utilisateur updateUser(Utilisateur u) throws EmptyIdException {
		Utilisateur user = this.checkUser(u);
		Optional userToModify = repo.findById(user.getId());
		if(Objects.isNull(userToModify))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "L'utilisateur avec cet id n'existe pas");
		Utilisateur verifiedUser = (Utilisateur) userToModify.get();
		verifiedUser.setNom(user.getNom());
		verifiedUser.setPrenom(user.getPrenom());
		verifiedUser.setEmail(user.getEmail());
		verifiedUser.setMdp(user.getMdp());
		verifiedUser.setNumeroRue(user.getNumeroRue());
		verifiedUser.setRue(user.getRue());
		verifiedUser.setCp(user.getCp());
		verifiedUser.setVille(user.getVille());
		verifiedUser.setTelephone(user.getTelephone());
		verifiedUser.setRole(user.getRole());
		return repo.save(verifiedUser);
	}


	private Utilisateur checkUser(Utilisateur u) throws EmptyIdException {
		if (Objects.isNull(u.getId()) || !this.getById(u.getId()).isPresent()) {
			throw new EmptyIdException("Il manque un id sur le client");
		}
		return u;
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}

}
