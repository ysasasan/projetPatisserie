package ajc.fr.thales.projetPatisserie.model;

import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@SequenceGenerator(name = "utilisateur_gen", sequenceName = "utilisateur_seq", initialValue = 100, allocationSize = 1)
public class Utilisateur {

	@Id
	@GeneratedValue(generator = "utilisateur_gen")
	private Long id;
	private String nom;
	private String prenom;
	private String societe;
	private String email;
	private String mdp;
	private String numeroRue;
	private String rue;
	private String ville;
	private String cp;
	private String telephone;
	
	@ElementCollection(targetClass=Role.class)
	@Enumerated(EnumType.ORDINAL)
	private List<Role> roles;

	@Version
	private Integer version;

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnoreProperties({ "utilisateur" })
	private List<Commande> commandes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Utilisateur() {
	}


	public Utilisateur(String nom, String prenom, String societe, String email, String mdp, String numeroRue, String rue, String ville,
			String cp, String telephone, List<Role> roles) {
		this.nom = nom;
		this.prenom = prenom;
		this.societe = societe;
		this.email = email;
		this.mdp = mdp;
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.ville = ville;
		this.cp = cp;
		this.telephone = telephone;
		this.roles = roles;
	}
	
	public Utilisateur(Utilisateur u) {
		this.nom = u.nom;
		this.prenom = u.prenom;
		this.societe = u.societe;
		this.email = u.email;
		this.mdp = u.mdp;
		this.numeroRue = u.numeroRue;
		this.rue = u.rue;
		this.ville = u.ville;
		this.cp = u.cp;
		this.telephone = u.telephone;
		this.roles = u.roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", societe=" + societe + ", email="
				+ email + ", mdp=" + mdp + ", numeroRue=" + numeroRue + ", rue=" + rue + ", ville=" + ville + ", cp="
				+ cp + ", telephone=" + telephone + ", roles=" + roles + ", version=" + version + ", commandes="
				+ commandes + "]";
	}
	

}
