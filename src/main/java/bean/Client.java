package bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name = "CLIENT")
public class Client {

	@Id @GeneratedValue
	@Column(name="client_id")
	private int id;
	@Column
	private int code;
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
	private Adresse adresse;
	
	@ManyToMany(mappedBy = "clients")
    private List<Employee> employees ;

	public Client() {
		super();
	}
	public Client(int id, int code, String name, Adresse adresse) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.adresse = adresse;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adresse getAdresse() {
		return this.adresse;
	}
	public void setAdress(Adresse adresse) {
		this.adresse = adresse;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + code;
		result = prime * result
				+ ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (code != other.code)
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
