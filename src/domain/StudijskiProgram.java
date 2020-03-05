package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDIJSKI_PROGRAM")
public class StudijskiProgram {

	@Id
	private Long id;
	private String ime;
	
	@OneToMany
	private List<Predmet> predmeti;
	
	@OneToMany
	private List<Student> studenti;
	
	public StudijskiProgram() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudijskiProgram(Long id, String ime) {
		super();
		this.id = id;
		this.ime = ime;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	@Override
	public String toString() {
		return "StudijskiProgram [id=" + id + ", ime=" + ime + "]";
	}
	
	
	
}
