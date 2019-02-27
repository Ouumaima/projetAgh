package controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import services.EmployeeService;
import bean.Employee;

@Component
@Path("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		System.out.println("omaima");
	    return employeeService.getAll();
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void CreateEmployee(Employee e) {
		employeeService.save(e);
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{employeeId}")
	public void updateEmployee(@PathParam("employeeId") int employeeId, Employee e) {
		employeeService.updateEmployee(employeeId, e);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{employeeId}")
	public Employee getEmployeeById(@PathParam("employeeId") int employeeId) {
		return employeeService.getById(employeeId);
	}
	
	@DELETE 
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(@PathParam("id") int id) {
		employeeService.deleteById(id);
	}

}
