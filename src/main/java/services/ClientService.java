package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Client;
import dao.ClientDao;

@Service
public class ClientService {

	@Autowired
	private ClientDao client ;
	

	public List<Client> getAll(){
		 return client.findAll();
	}
	
	public Client getById(int id){
		 return client.findById(id);
	}
		
	
	public void save(Client c){
		client.add(c);
	}
	
	public void deleteById(int id){
		 client.removeById(id);
	}
	
	public void updateClient(int id, Client c){
		client.updateClient(id, c);
	}
}
