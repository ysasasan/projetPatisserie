package ajc.fr.thales.projetPatisserie.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import ajc.fr.thales.projetPatisserie.model.Commande;
import ajc.fr.thales.projetPatisserie.model.CommandePatisserie;
import ajc.fr.thales.projetPatisserie.model.Patisserie;
import ajc.fr.thales.projetPatisserie.model.Utilisateur;
import ajc.fr.thales.projetPatisserie.model.embeddedId.CommandePatisserieId;
import ajc.fr.thales.projetPatisserie.model.exception.EmptyIdException;
import ajc.fr.thales.projetPatisserie.repository.CommandeRepository;
import ajc.fr.thales.projetPatisserie.repository.PatisserieRepository;

@Service
public class CommandeService {
	
	@Autowired
	CommandeRepository repoCmd;

	@Autowired
	UtilisateurService userService;

	@Autowired
	PatisserieService patisserieService;

	@Autowired
	CommandePatisserieService cmdPatService;

	public List<Commande> findAll() {
		return repoCmd.findAll();
	}

	public Optional<Commande> getById(Long id) {
		return repoCmd.findById(id);
	}

	public Commande create(Commande commande) {

		Commande cmdBdd = new Commande();
		
		Optional<Utilisateur> user = userService.getById(commande.getUtilisateur().getId());
		if(Objects.isNull(user))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cet utilisateur est inexistant");
		
		cmdBdd.setUtilisateur(user.get());
		cmdBdd.setConfirme(false);
		cmdBdd.setDateCreation(LocalDateTime.now());
		cmdBdd.setPatisseries(commande.getPatisseries());

		// On initialise une commande vide en BD pour lui créer un Id et on le récupère
		// pour rentrer les autres infos
		Commande initializedCmd = repoCmd.save(cmdBdd);

		for (CommandePatisserie cp : commande.getPatisseries()) {

			if (Objects.isNull(cp.getPatisserie()))
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CommandePatisserie sans patisserie");

			// Insertion du produit de commandeProduit dans la base
			if (Objects.isNull(cp.getPatisserie().getId()))
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
						"CommandePatisserie pour une patisserie non référencée");
			
			Patisserie p = patisserieService.getById(cp.getPatisserie().getId()).get();
			
			System.out.println(p.getNom());

			// Création d'une instance commandeProduit associée à chaque produit
			CommandePatisserieId cpId = new CommandePatisserieId(cp.getPatisserie().getId(), initializedCmd.getId());
			CommandePatisserie cpBdd = new CommandePatisserie(cpId, initializedCmd, p, cp.getQuantite());

			// Insertion d'une instance commandeProduit dans la base
			cmdPatService.createCommandePatisserie(cpBdd);

		}
		
		Optional<Commande> validCmd = repoCmd.findById(initializedCmd.getId());
		
		System.out.println(validCmd.get().getPatisseries().toString());
		
		
		if(Objects.isNull(validCmd))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"La commande n'a pas pu être créée");

		return validCmd.get();

	}

//	public Commande modifyCommande(Commande c) throws EmptyIdException {
//		return repoCmd.save(c);
//	}

	public void deleteCommande(Long id) {
		Optional<Commande> cmd = repoCmd.findById(id);
		if(Objects.isNull(cmd))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Commande inexistante");
		
		cmdPatService.deleteByCommandeId(id);
		repoCmd.deleteById(id);
	}

//	public List<Commande> getCommandesNotConfirmed() {
//		return repoCmd.findByConfirmeFalse();
//	}
//
//	public Commande confirmCommandes(Long id, Principal p) throws EmptyIdException {
//		checkUser(id, p);
//		Commande cmd = checkCommandeById(id);
//
//		for (CommandeProduit cp : cmd.getProduits()) {
//			Produit produitBdd = produitService.getById(cp.getProduit().getId()).get();
//			Integer cpStock = produitBdd.getQteStock();
//			Integer restAfterCmd = cpStock - cp.getQte();
//			if (restAfterCmd <= 0)
//				throw new ResponseStatusException(HttpStatus.CONFLICT,
//						"Pas assez de stock sur " + produitBdd.getLibelle());
//
//			produitBdd.setQteStock(restAfterCmd);
//			produitService.modifyProduit(produitBdd);
//		}
//
//		cmd.setConfirme(true);
//		return repoCmd.save(cmd);
//
//	}
	
//	private void checkUser(Long id, Principal p) throws EmptyIdException {
//		Optional<Commande> cmd = repoCmd.findById(id);
//		
//		String identifiantClient = cmd.get().getClient().getUtilisateur().getIdentifiant();
//		String identifiantUtilisateur = p.getName();
//		
//		if(Objects.isNull(cmd))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le client n'existe pas");
//		
//		if(Objects.isNull(cmd.get().getClient().getUtilisateur()))
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le client n'a pas de compte utilisateur");
//		
//		if (!identifiantClient.equals(identifiantUtilisateur))
//			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Le client et l'utilisateur sont différents");
//
//	}


//	private Commande checkCommandeById(Long id) throws EmptyIdException {
//		Optional<Commande> cmd = repoCmd.findById(id);
//		if (Objects.isNull(cmd))
//			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
//		return cmd.get();
//	}
	
}
