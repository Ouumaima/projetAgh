package agh.projet.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import agh.projet.bean.ClientBean;

@Repository
public class ClientDao {

	private ArrayList<ClientBean> listClient = new ArrayList<ClientBean>();
	
	public ArrayList<ClientBean> getClient() {
		return  listClient;
	}
	
	public void save(ClientBean client) {
		listClient.add(client);
    }
	
	public void delete(ClientBean client) {
		listClient.remove(client);
    }
	
	public ArrayList<ClientBean> getClientById(int id) {
		ArrayList<ClientBean> result = new ArrayList<ClientBean>();
		for (ClientBean c : listClient)
			if (c.getId() == id  )
				result.add(c);
		return  result;
	}
	
	public ArrayList<ClientBean> getClientByName(String name) {
		ArrayList<ClientBean> result = new ArrayList<ClientBean>();
		for (ClientBean c : listClient)
			if (c.getName().equals(name)  )
				result.add(c);
		return  result;
	}
}
