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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime
				* result
				+ ((complementAdresse == null) ? 0 : complementAdresse
						.hashCode());
		result = prime * result + id;
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
		if (complementAdresse == null) {
			if (other.complementAdresse != null)
				return false;
		} else if (!complementAdresse.equals(other.complementAdresse))
			return false;
		if (id != other.id)
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

}
