package agh.projet.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import agh.projet.bean.AdressBean;

@Repository
public class AdresseDao {
	
	private ArrayList<AdressBean> listAdresse = new ArrayList<AdressBean>();
	
	
	public void save(AdressBean adresse) {
		listAdresse.add(adresse);
    }
	
	public void delete(AdressBean adresse) {
		listAdresse.remove(adresse);
    }

}
