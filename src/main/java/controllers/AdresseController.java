package controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
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

	private AdresseService adresseService;
	
	public AdresseController(AdresseService adresseService) {
		this.adresseService = adresseService;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Adresse> getAdresses() {
		return adresseService.getAll();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{adresseId}")
	public Adresse getAdresseById(@PathParam("adresseId") int adressId) {
		return adresseService.getById(adressId);
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{adresseId}")
	public void updateAdresse(@PathParam("adresseId") int adressId, Adresse adr) {
		 adresseService.update(adressId, adr);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void CreateAdresse(Adresse adr) {
		adresseService.save(adr);

	}
	
	@DELETE 
	@Path("/{adr}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("adr") int id) {
		adresseService.remove(id);
	}
	
	
}
