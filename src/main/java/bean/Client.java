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
	
}
