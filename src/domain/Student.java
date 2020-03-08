package domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student extends Korisnik{

	private String ime;
	private String prezime;
	private String brIndeksa;
	private LocalDate datumRodj;
	private StudijskiProgram studijskiProgram;
	
	@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Ispit> ispiti;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, KorisnickaUloga korisnickaUloga, String username, String password) {
		super(id, korisnickaUloga, username, password);
		// TODO Auto-generated constructor stub
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

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public LocalDate getDatumRodj() {
		return datumRodj;
	}

	public void setDatumRodj(LocalDate datumRodj) {
		this.datumRodj = datumRodj;
	}

	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}

	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}

	public List<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(List<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brIndeksa=" + brIndeksa + ", datumRodj=" + datumRodj
				+ ", studijskiProgram=" + studijskiProgram + "]";
	}

	
	
	
}
