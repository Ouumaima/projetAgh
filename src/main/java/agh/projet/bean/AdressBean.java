package agh.projet.bean;

public class AdressBean {
	
	private String adress; 
	private String ComplementAdress;
	private String ville;
	private String codePostal;
	
	public AdressBean(String adress, String complementAdress, String ville,
			String codePostal) {
		super();
		this.adress = adress;
		ComplementAdress = complementAdress;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getComplementAdress() {
		return ComplementAdress;
	}
	public void setComplementAdress(String complementAdress) {
		ComplementAdress = complementAdress;
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
