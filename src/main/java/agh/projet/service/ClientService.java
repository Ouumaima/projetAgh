package agh.projet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agh.projet.bean.ClientBean;
import agh.projet.dao.ClientDao;

@Service
public class ClientService {

	@Autowired
	private ClientDao client ;
	

	public ArrayList<ClientBean> findAll(){
		 return client.getClient();
	}
	
	public ArrayList<ClientBean> findById(int id){
		 return client.getClientById(id);
	}
		
	public ArrayList<ClientBean> findByFirstName(String firstName){
		 return client.getClientByName(firstName);
	}
	public void save(ClientBean c){
		client.save(c);
	}
}
