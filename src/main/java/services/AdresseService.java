package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Adresse;
import bean.Client;
import dao.AdresseDao;

@Service
public class AdresseService {
	
		@Autowired
		private AdresseDao adresse;
		
		public void save(Adresse a) {
			adresse.add(a);
	    }
		
		public void remove(int id) {
			adresse.deleteById(id);
	    }
		
		public List<Adresse> getAll(){
			 return adresse.findAll();
		}
		
		public Adresse getById(int id){
			 return adresse.findById(id);
		}
		
		public void update(int id, Adresse adr){
			adresse.updateAdresse(id, adr);
		}

}
