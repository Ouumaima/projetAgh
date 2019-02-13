package controllers;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import services.ClientService;
import bean.Client;

@Component
@Path("/client")
public class ClientController {
	@Autowired(required = true)
	private ClientService clientService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Client> getClients() {
		return clientService.getAll();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void CreateClient(Client c) {
		System.out.println("Post work !!!");
		System.out.println("hhhh"+ c.getName());
		clientService.save(c);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{clientId}")
	public ArrayList<Client> getEmployeeById(@PathParam("clientId") int clientId) {
		return clientService.getById(clientId);
	}
	
	@DELETE 
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("id") int id) {
		System.out.println("deleteById !!!");
		clientService.deleteById(id);
	}
}