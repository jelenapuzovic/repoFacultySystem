package domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PREDMET")
public class Predmet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String naziv;
	private int brESPB;
	private int semestar;
	private StudijskiProgram studijskiProgram;
	
	@OneToMany(mappedBy = "predmet", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<ProfesorPredmet> profesorPredmeti;

	public Predmet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Predmet(Long id, String naziv, int brESPB, int semestar, StudijskiProgram studijskiProgram) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.brESPB = brESPB;
		this.semestar = semestar;
		this.studijskiProgram = studijskiProgram;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getBrESPB() {
		return brESPB;
	}

	public void setBrESPB(int brESPB) {
		this.brESPB = brESPB;
	}

	public int getSemestar() {
		return semestar;
	}

	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}

	

	public Set<ProfesorPredmet> getProfesorPredmeti() {
		return profesorPredmeti;
	}


	public void setProfesorPredmeti(Set<ProfesorPredmet> profesorPredmeti) {
		this.profesorPredmeti = profesorPredmeti;
	}


	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", brESPB=" + brESPB + ", semestar=" + semestar
				+ ", profesorPredmeti=" + profesorPredmeti + "]";
	}


	
	
	
}
