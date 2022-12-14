package ajc.fr.thales.projetPatisserie.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;



@Entity
@SequenceGenerator(name = "patisserie_gen", sequenceName = "patisserie_seq", initialValue=1,allocationSize=1)
public class Patisserie {
	
	@Id
	@GeneratedValue(generator="patisserie_gen")
	private Long id;
	
	private String nom;
	private String description;
	private String image;
	private String categorie;
	private Integer prix;
	private String infos;
	private Integer qteStock;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public String getInfos() {
		return infos;
	}
	public Integer getQteStock() {
		return qteStock;
	}
	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}
	public void setInfos(String infos) {
		this.infos = infos;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Patisserie(String nom, String description, String image, String categorie, Integer prix,
			String infos, Integer qteStock) {
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.categorie = categorie;
		this.prix = prix;
		this.infos = infos;
		this.qteStock = qteStock;
	}
	public Patisserie() {
	}
	
	
	@Override
	public String toString() {
		return "Patisserie [id=" + id + ", nom=" + nom + ", description=" + description + ", image=" + image
				+ ", categorie=" + categorie + ", prix=" + prix + ", infos=" + infos + ", qteStock=" + qteStock
				+ ", version=" + version + "]";
	}
	
	

}
