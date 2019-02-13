package dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import bean.Client;

@Repository
public class ClientDao {

private ArrayList<Client> listClient = new ArrayList<Client>();
	
	public ArrayList<Client> findAll() {
		return  listClient;
	}
	
	public void add(Client client) {
		listClient.add(client);
    }
	
	public void remove(Client client) {
		listClient.remove(client);
    }
	
	public void removeById(int id) {
		for (Client c : listClient)
			if (c.getId() == id )
				listClient.remove(c);
    }
	
	public ArrayList<Client> findById(int id) {
		ArrayList<Client> result = new ArrayList<Client>();
		for (Client c : listClient)
			if (c.getId() == id  )
				result.add(c);
		return  result;
	}
	
	public ArrayList<Client> findByName(String name) {
		ArrayList<Client> result = new ArrayList<Client>();
		for (Client c : listClient)
			if (c.getName().equals(name)  )
				result.add(c);
		return  result;
	}
	
}
