package services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Adresse;
 import dao.AdresseDao;

@Service
public class AdresseService {
	
		@Autowired
		private AdresseDao adresse;
		
		public void save(Adresse a) {
			adresse.add(a);
	    }
		
		public void remove(Adresse a) {
			adresse.remove(a);
	    }
		
		public ArrayList<Adresse> getAll(){
			 return adresse.findAll();
		}

		public void deleteByAdresse(String adr){
			adresse.removeByAdresse(adr);
		}
}
