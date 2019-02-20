package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	
	@Id @GeneratedValue
	@Column(name="employee_id")
	private int id;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Date birthDate;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "EMPLOYEE_CLIENT", 
			   joinColumns = { @JoinColumn(name = "employee_id") }, 
			   inverseJoinColumns = { @JoinColumn(name = "client_id") })
	private List<Client> clients;
	
	@Column
	private ArrayList<String> technologies; 
	@Column
	private String currentPostion;

	public Employee() {
		super();
	}
	
	public Employee(int id, String firstName, String lastName,List<Client> clients,String currentPostion) {
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
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
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
