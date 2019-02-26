package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADRESSE")
public class Adresse {
	
	@Id @GeneratedValue
	@Column(name="adresse_id")
	private int id;
	@Column
	private String adresse; 
	@Column
	private String complementAdresse;
	@Column
	private String ville;
	@Column
	private String codePostal;

	public Adresse() {
		super();
	}
	
	public Adresse(int id,String adresse, String complementAdress, String ville,
			String codePostal) {
		this.id = id;
		this.adresse = adresse;
		this.complementAdresse = complementAdress;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getComplementAdresse() {
		return this.complementAdresse;
	}
	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

}
