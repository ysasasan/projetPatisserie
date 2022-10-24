package ajc.fr.thales.projetPatisserie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ajc.fr.thales.projetPatisserie.model.Utilisateur;

public interface utilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
