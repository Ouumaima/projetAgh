package dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import bean.Adresse;

@Repository
public class AdresseDao {
	
private ArrayList<Adresse> listAdresse = new ArrayList<Adresse>();
	
	
	public void add(Adresse adresse) {
		listAdresse.add(adresse);
    }
	
	public void remove(Adresse adresse) {
		listAdresse.remove(adresse);
    }
	
	public ArrayList<Adresse> findAll() {
		return listAdresse;
    }
	
	public void removeByAdresse(String adr){
		for (Adresse a : listAdresse )
			if (a.getAdresse().equals(adr)){
				listAdresse.remove(a);
			}
	}

}
