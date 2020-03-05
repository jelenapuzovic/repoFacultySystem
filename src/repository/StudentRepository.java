package repository;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import domain.Student;

public class StudentRepository {
	private final EntityManagerFactory emf;

	public StudentRepository() {
		emf = Persistence.createEntityManagerFactory("JPAFacultySystem");
	}
	
	public void save(Student student) {
		EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
		
		em.merge(student);
		System.out.println("Student merged!");
		em.getTransaction().commit();

		em.close();
	}
	

	
	

}
