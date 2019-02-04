package agh.projet.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeBean {
	
	
	private int id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private ArrayList<ClientBean> clients;
	private List<String> technologies; 
	private String currentPostion;
	
	public EmployeeBean(int id, String firstName, String lastName,Date birthDate, ArrayList<ClientBean> clients, String currentPostion) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
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
	public List<ClientBean> getClients() {
		return clients;
	}
	public void setClients(ArrayList<ClientBean> clients) {
		this.clients = clients;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public String getCurrentPostion() {
		return currentPostion;
	}
	public void setCurrentPostion(String currentPostion) {
		this.currentPostion = currentPostion;
	}

}

