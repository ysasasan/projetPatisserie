package ajc.fr.thales.projetPatisserie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajc.fr.thales.projetPatisserie.model.Utilisateur;
import ajc.fr.thales.projetPatisserie.repository.utilisateurRepository;

@Service
public class utilisateurService {
	
	@Autowired
	utilisateurRepository repo;
	
	public List<Utilisateur> findAll() {
		return repo.findAll();
	}
	
//	public Optional<Client> getById(Long id) {
//		return repo.findById(id);
//	}
//
//	public Client createClient(Client c) {
//		Client client = new Client(c);
//		return repo.save(client);
//	}
//	
//	public Client registerUserAsClient(Map<Utilisateur, Client> UtilisateurClient) {
//		
//		System.out.println(UtilisateurClient);
//		
//		//authServ.createUserBasicAuth(u);
//		//return repo.save(c);
//		
//		return null;
//	}
//
//	
//	public Client updateClient(Client c) throws EmptyIdException {
//		Client client = this.checkClient(c);
//		return repo.save(client);
//	}
//
//
//	private Client checkClient(Client c) throws EmptyIdException {
//		if (Objects.isNull(c.getId()) || !this.getById(c.getId()).isPresent()) {
//			throw new EmptyIdException("Il manque un id sur le client");
//		}
//		return c;
//	}
//	
//	public void deleteClient(Long id) {
//		repo.deleteById(id);
//	}

}
