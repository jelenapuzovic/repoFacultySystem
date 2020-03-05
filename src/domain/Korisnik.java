package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="KORISNIK")
public abstract class Korisnik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private KorisnickaUloga korisnickaUloga;
	private String username;
	private String password;
	
	public Korisnik() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Korisnik(Long id, KorisnickaUloga korisnickaUloga, String username, String password) {
		super();
		this.id = id;
		this.korisnickaUloga = korisnickaUloga;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KorisnickaUloga getKorisnickaUloga() {
		return korisnickaUloga;
	}

	public void setKorisnickaUloga(KorisnickaUloga korisnickaUloga) {
		this.korisnickaUloga = korisnickaUloga;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", korisnickaUloga=" + korisnickaUloga + ", username=" + username + ", password="
				+ password + "]";
	}

	
	
	
	
	
}
