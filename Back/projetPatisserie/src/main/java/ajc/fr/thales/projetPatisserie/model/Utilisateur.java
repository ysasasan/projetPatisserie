package ajc.fr.thales.projetPatisserie.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@SequenceGenerator(name="user_gen",sequenceName="user_seq",initialValue=100,allocationSize=1)
public class Utilisateur {
	
	@Id
	@GeneratedValue(generator="user_gen")
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String mdp;
	private String numeroRue;
	private Integer rue;
	private String ville;
	private String cp;
	private String telephone;
	private String role;
	
	@Version
	private Integer version;
	
	
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
	public Integer getRue() {
		return rue;
	}
	public void setRue(Integer rue) {
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
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Utilisateur(String nom, String prenom, String email, String mdp, String numeroRue, Integer rue, String ville,
			String cp, String telephone, String role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.ville = ville;
		this.cp = cp;
		this.telephone = telephone;
		this.role = role;
	}
	
	public Utilisateur() {
	}
	
	
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mdp=" + mdp
				+ ", numeroRue=" + numeroRue + ", rue=" + rue + ", ville=" + ville + ", cp=" + cp + ", telephone="
				+ telephone + ", role=" + role + ", version=" + version + "]";
	}
	
}
