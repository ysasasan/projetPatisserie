package ajc.fr.thales.projetPatisserie.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ajc.fr.thales.projetPatisserie.model.Patisserie;

public interface PatisserieRepository extends JpaRepository<Patisserie, Long>{
	
}