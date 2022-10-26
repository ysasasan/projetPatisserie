package ajc.fr.thales.projetPatisserie.model.embeddedId;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CommandePatisserieId  implements Serializable {
	
	private static final long serialVersionUID = 2919730574209976463L;
	
	@Column(name="id_patisserie")
	private Long idPatisserie;
	
	@Column(name="id_commande")
	private Long idCommande;

	public Long getIdPatisserie() {
		return idPatisserie;
	}

	public void setIdPatisserie(Long idPatisserie) {
		this.idPatisserie = idPatisserie;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public CommandePatisserieId(Long idPatisserie, Long idCommande) {
		this.idPatisserie = idPatisserie;
		this.idCommande = idCommande;
	}

	public CommandePatisserieId() {
	}

	@Override
	public String toString() {
		return "CommandePatisserieId [idPatisserie=" + idPatisserie + ", idCommande=" + idCommande + "]";
	}
	

}
