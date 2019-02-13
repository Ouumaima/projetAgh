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

import bean.Employee;
import services.EmployeeService;

@Component
@Path("/employee")
public class EmployeeController {

	@Autowired(required = true)
	private EmployeeService employeeService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Employee> getEmployees() {
		return employeeService.getAll();
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void CreateEmployee(Employee e) {
		System.out.println("Post work !!!");
		System.out.println("hhhh"+ e.getFirstName());
		employeeService.save(e);

	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{employeeId}")
	public ArrayList<Employee> getEmployeeById(@PathParam("employeeId") int employeeId) {
		return employeeService.getById(employeeId);
	}
	
	@DELETE 
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("id") int id) {
		System.out.println(".deleteById !!!");
		employeeService.deleteById(id);
	}

}
