package ajc.fr.thales.projetPatisserie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ajc.fr.thales.projetPatisserie.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
