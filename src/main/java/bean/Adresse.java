package bean;

public class Adresse {
	
	private String adresse; 
	private String complementAdresse;
	private String ville;
	private String codePostal;

	public Adresse() {
		super();
	}
	
	public Adresse(String adresse, String complementAdress, String ville,
			String codePostal) {
		this.adresse = adresse;
		this.complementAdresse = complementAdress;
		this.ville = ville;
		this.codePostal = codePostal;
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
