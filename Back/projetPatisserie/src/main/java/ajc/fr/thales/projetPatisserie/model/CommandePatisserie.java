package ajc.fr.thales.projetPatisserie.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ajc.fr.thales.projetPatisserie.model.embeddedId.CommandePatisserieId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommandePatisserie {
	
	@EmbeddedId
	@JsonIgnore
	CommandePatisserieId id;
	
	@ManyToOne
	@MapsId("idCommande")
	@JoinColumn(name ="id_commande")
	@JsonIgnoreProperties("patisseries")
	private Commande commande;

	@ManyToOne
	@MapsId("idPatisserie")
	@JoinColumn(name = "id_patisserie")
	@JsonIgnoreProperties({"commandes","patisseries.commande"})
	private Patisserie patisserie;

	private Integer quantite;
	
	
	public void generateId() {
		this.id = new CommandePatisserieId(this.patisserie.getId(),this.commande.getId());
	}


	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Patisserie getPatisserie() {
		return patisserie;
	}

	public void setPatisserie(Patisserie patisserie) {
		this.patisserie = patisserie;
	}

	@Override
	public String toString() {
		return "CommandePatisserie [id=" + id + ", commande=" + commande + ", patisserie=" + patisserie + ", quantite="
				+ quantite + "]";
	}

	public CommandePatisserie(CommandePatisserieId id, Commande commande, Patisserie patisserie, Integer quantite) {
		this.id = id;
		this.commande = commande;
		this.patisserie = patisserie;
		this.quantite = quantite;
	}

	public CommandePatisserie() {
	}
	

}
