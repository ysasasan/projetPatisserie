package ajc.fr.thales.projetPatisserie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ajc.fr.thales.projetPatisserie.model.CommandePatisserie;
import ajc.fr.thales.projetPatisserie.model.embeddedId.CommandePatisserieId;

public interface CommandePatisserieRepository extends JpaRepository<CommandePatisserie,CommandePatisserieId>  {
	
	@Query(value = "DELETE FROM `db-patisserie`.commande_patisserie WHERE id_commande=:idCommande", nativeQuery = true)
	void deleteCommande(@Param("idCommande") Long idCommande);
}
