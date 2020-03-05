package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	private Long id;
	private String ime;

	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String ime) {
		super();
		this.id = id;
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [ime=" + ime + "]";
	}

	
	
	
}
