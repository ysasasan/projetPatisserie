package ajc.fr.thales.projetPatisserie.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ajc.fr.thales.projetPatisserie.model.Patisserie;

public interface patisserieRepository extends JpaRepository<Patisserie, Long>{
	

}
