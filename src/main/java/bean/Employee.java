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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result
				+ ((currentPostion == null) ? 0 : currentPostion.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((technologies == null) ? 0 : technologies.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (currentPostion == null) {
			if (other.currentPostion != null)
				return false;
		} else if (!currentPostion.equals(other.currentPostion))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (technologies == null) {
			if (other.technologies != null)
				return false;
		} else if (!technologies.equals(other.technologies))
			return false;
		return true;
	}
	
	
}
