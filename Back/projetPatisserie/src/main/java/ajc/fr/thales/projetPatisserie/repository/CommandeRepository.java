package ajc.fr.thales.projetPatisserie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ajc.fr.thales.projetPatisserie.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
	
	@Query(value = "SELECT * FROM commande WHERE confirme = false", nativeQuery = true)
	List<Commande> findByConfirmeFalse();

}
