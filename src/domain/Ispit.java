package domain;

import java.util.Date;

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
@Table(name = "Ispit", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"STUDENT_ID","ProfesorPredmet_ID"})
		})
public class Ispit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",referencedColumnName = "ID")
	private Student student;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ProfesorPredmet_ID",referencedColumnName = "ID")
	private ProfesorPredmet profesorPredmet;
	
	private Date datumPolaganja;

	public Ispit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ispit(Student student, ProfesorPredmet profesorPredmet, Date datumPolaganja) {
		super();
		this.student = student;
		this.profesorPredmet = profesorPredmet;
		this.datumPolaganja = datumPolaganja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ProfesorPredmet getProfesorPredmet() {
		return profesorPredmet;
	}

	public void setProfesorPredmet(ProfesorPredmet profesorPredmet) {
		this.profesorPredmet = profesorPredmet;
	}
	
	

	public Date getDatumPolaganja() {
		return datumPolaganja;
	}

	public void setDatumPolaganja(Date datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((profesorPredmet == null) ? 0 : profesorPredmet.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		Ispit other = (Ispit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (profesorPredmet == null) {
			if (other.profesorPredmet != null)
				return false;
		} else if (!profesorPredmet.equals(other.profesorPredmet))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ispit [id=" + id + ", student=" + student + ", profesorPredmet=" + profesorPredmet + "]";
	}
	
	

}
