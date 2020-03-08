package domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESOR")
public class Profesor extends Korisnik {

	private Zvanje zvanje;
	private String ime;
	private String prezime;
	private Date datumZasnivanjaRadnogOdnosa;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department department;
	
	@OneToMany(mappedBy = "profesor", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<ProfesorPredmet> profesorPredmeti;

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(Long id, KorisnickaUloga korisnickaUloga, String username, String password) {
		super(id, korisnickaUloga, username, password);
		// TODO Auto-generated constructor stub
	}

	

	public Profesor(Zvanje zvanje, String ime, String prezime, Date datumZasnivanjaRadnogOdnosa,
			Set<ProfesorPredmet> profesorPredmeti) {
		super();
		this.zvanje = zvanje;
		this.ime = ime;
		this.prezime = prezime;
		this.datumZasnivanjaRadnogOdnosa = datumZasnivanjaRadnogOdnosa;
		this.profesorPredmeti = profesorPredmeti;
	}

	public Zvanje getZvanje() {
		return zvanje;
	}

	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatumZasnivanjaRadnogOdnosa() {
		return datumZasnivanjaRadnogOdnosa;
	}

	public void setDatumZasnivanjaRadnogOdnosa(Date datumZasnivanjaRadnogOdnosa) {
		this.datumZasnivanjaRadnogOdnosa = datumZasnivanjaRadnogOdnosa;
	}

	

	public Set<ProfesorPredmet> getProfesorPredmeti() {
		return profesorPredmeti;
	}

	public void setProfesorPredmeti(Set<ProfesorPredmet> profesorPredmeti) {
		this.profesorPredmeti = profesorPredmeti;
	}

	@Override
	public String toString() {
		return "Profesor [zvanje=" + zvanje + ", ime=" + ime + ", prezime=" + prezime + ", datumZasnivanjaRadnogOdnosa="
				+ datumZasnivanjaRadnogOdnosa + ", profesorPredmeti=" + profesorPredmeti + "]";
	}

	
	
	
}
