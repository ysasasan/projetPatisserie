package ajc.fr.thales.projetPatisserie.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajc.fr.thales.projetPatisserie.model.CommandePatisserie;
import ajc.fr.thales.projetPatisserie.repository.CommandePatisserieRepository;

@Service
public class CommandePatisserieService {
	
	@Autowired
	CommandePatisserieRepository repoCmdPat;
	
	public CommandePatisserie createCommandePatisserie(CommandePatisserie cp) {
		return repoCmdPat.save(cp);
	}

	public void deleteByCmdPatbyCmdId(Long id) {
		repoCmdPat.deleteByCmdPatbyCmdId(id);
	}

}
