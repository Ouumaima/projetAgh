package services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Client;
import dao.ClientDao;

@Service
public class ClientService {

	@Autowired
	private ClientDao client ;
	

	public ArrayList<Client> getAll(){
		 return client.findAll();
	}
	
	public ArrayList<Client> getById(int id){
		 return client.findById(id);
	}
		
	public ArrayList<Client> getByName(String name){
		 return client.findByName(name);
	}
	public void save(Client c){
		client.add(c);
	}
	
	public void deleteById(int id){
		 client.removeById(id);
	}
}
