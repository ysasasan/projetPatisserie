package ajc.fr.thales.projetPatisserie.service;

import java.util.Objects;
import java.util.Optional;
import javax.management.relation.RelationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajc.fr.thales.projetPatisserie.model.Patisserie;
import ajc.fr.thales.projetPatisserie.repository.PatisserieRepository;


@Service
public class PatisserieService {

	@Autowired
	PatisserieRepository pr;
	
	
	public Optional<Patisserie> getById(Long id) {
		return pr.findById(id);
	}
	
	public Patisserie updatePatisserie(Patisserie p) throws Exception {
		if (Objects.isNull(p)) {
			throw new IllegalArgumentException("patisserie could not be null");
		}
		if(Objects.isNull(p.getId())) {
			throw new Exception("no id");
		}
		return pr.save(p);
	}
	
	public void deleteClientbyId(Long id) throws RelationException {
		try {
			pr.deleteById(id);
		} catch (Exception e) {
			throw new RelationException("id ["+id+"] does not exist yet");
		}
	}
	
}
