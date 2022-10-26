package ajc.fr.thales.projetPatisserie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ajc.fr.thales.projetPatisserie.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
	Optional<Utilisateur> findByEmailAndMdp(String email, String mdp);

}
