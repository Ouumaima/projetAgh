package agh.projet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agh.projet.bean.AdressBean;
import agh.projet.dao.AdresseDao;

@Service
public class AdresseService {
	
	@Autowired
	private AdresseDao adresse;
	
	public void save(AdressBean a) {
		adresse.save(a);
    }
	
	public void remove(AdressBean a) {
		adresse.delete(a);
    }

}
