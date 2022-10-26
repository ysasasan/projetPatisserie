package ajc.fr.thales.projetPatisserie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajc.fr.thales.projetPatisserie.model.Commande;
import ajc.fr.thales.projetPatisserie.model.CommandePatisserie;
import ajc.fr.thales.projetPatisserie.repository.CommandePatisserieRepository;

@Service
public class CommandePatisserieService {
	
	@Autowired
	CommandePatisserieRepository repoCmdPat;
	
	public CommandePatisserie createCommandePatisserie(CommandePatisserie cp) {
		return repoCmdPat.save(cp);
	}
	
	public void deleteByCommandeId(Long id) {
		repoCmdPat.deleteCommande(id);
	}

}
