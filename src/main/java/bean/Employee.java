package bean;

import java.util.ArrayList;
import java.util.Date;


public class Employee {
	
	public Employee() {
		super();
	}
	private int id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private ArrayList<Client> clients;
	private ArrayList<String> technologies; 
	private String currentPostion;

	
	public Employee(int id, String firstName, String lastName, ArrayList<Client> clients,String currentPostion) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.clients = clients;
		this.currentPostion = currentPostion;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public String getCurrentPostion() {
		return currentPostion;
	}
	public void setCurrentPostion(String currentPostion) {
		this.currentPostion = currentPostion;
	}
}
