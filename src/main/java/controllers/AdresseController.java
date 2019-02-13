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

import services.AdresseService;
import bean.Adresse;

@Component
@Path("/adresse")
public class AdresseController {

	@Autowired(required = true)
	private AdresseService adresseService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Adresse> getAdresses() {
		return adresseService.getAll();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void CreateAdresse(Adresse adr) {
		System.out.println("Post work !!!");
		System.out.println("hhhh"+ adr.getAdresse());
		adresseService.save(adr);

	}
	
	@DELETE 
	@Path("/{adr}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("adr") String adr) {
		System.out.println("deleteById !!!");
		adresseService.deleteByAdresse(adr);
	}
}
