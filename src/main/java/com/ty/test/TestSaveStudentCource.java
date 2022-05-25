package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Cource;
import com.ty.dto.Student;

public class TestSaveStudentCource {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		Cource cource = new Cource() ;
		cource.setName("java");
		cource.setDuration(2) ;
		
		Cource cource1 = new Cource() ;
		cource1.setName("HTML");
		cource1.setDuration(1) ;
		
		Cource cource2 = new Cource() ;
		cource2.setName("CSS");
		cource2.setDuration(1) ;
		
		List<Cource> cources = new ArrayList<Cource>() ;
		cources.add(cource) ;
		cources.add(cource1) ;
		cources.add(cource2) ;
		
		Student student = new Student() ;
		student.setName("sunny");
		student.setAge(23);
		student.setCources(cources);
		
		Student student1 = new Student() ;
		student1.setName("Mia");
		student1.setAge(25);
		student1.setCources(cources);
		
		
		entityTransaction.begin();
		entityManager.persist(cource);
		entityManager.persist(cource1);
		entityManager.persist(cource2);
		entityManager.persist(student);
		entityTransaction.commit();
		
	}
}
