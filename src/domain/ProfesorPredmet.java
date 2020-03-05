package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ProfesorPredmet", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"PROFESOR_ID","PREDMET_ID"})
		})
public class ProfesorPredmet implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "PROFESOR_ID",referencedColumnName = "ID")
	private Profesor profesor;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "PREDMET_ID",referencedColumnName = "ID")
	private Predmet predmet;

	public ProfesorPredmet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorPredmet(Profesor profesor, Predmet predmet) {
		super();
		this.profesor = profesor;
		this.predmet = predmet;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((predmet == null) ? 0 : predmet.hashCode());
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
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
		ProfesorPredmet other = (ProfesorPredmet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (predmet == null) {
			if (other.predmet != null)
				return false;
		} else if (!predmet.equals(other.predmet))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProfesorPredmet [id=" + id + ", profesor=" + profesor + ", predmet=" + predmet + "]";
	}
	
	
}
