package ajc.fr.thales.projetPatisserie.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name="commande_gen", sequenceName="commande_seq", initialValue=100, allocationSize=1)
public class Commande {
	
	@Id
	@GeneratedValue(generator = "commande_gen")
	private Long id;

	private Boolean confirme;
	private LocalDateTime dateCreation;
	
	@Version
	private Integer version;


	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	@JsonIgnoreProperties({ "commandes"})
	private Utilisateur utilisateur;

	@OneToMany(mappedBy = "commande")
	@JsonIgnoreProperties({"commandes, commande"})
	private List<CommandePatisserie> patisseries;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getConfirme() {
		return confirme;
	}

	public void setConfirme(Boolean confirme) {
		this.confirme = confirme;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<CommandePatisserie> getPatisseries() {
		return patisseries;
	}

	public void setPatisseries(List<CommandePatisserie> patisseries) {
		this.patisseries = patisseries;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", confirme=" + confirme + ", dateCreation=" + dateCreation + ", version="
				+ version + ", utilisateur=" + utilisateur + ", patisseries=" + patisseries + "]";
	}

	public Commande(Boolean confirme, LocalDateTime dateCreation, Utilisateur utilisateur,
			List<CommandePatisserie> patisseries) {
		this.confirme = confirme;
		this.dateCreation = dateCreation;
		this.utilisateur = utilisateur;
		this.patisseries = patisseries;
	}

	public Commande() {
	}
	
	
	

}
