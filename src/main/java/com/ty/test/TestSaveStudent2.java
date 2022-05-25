package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Cource;
import com.ty.dto.Student;

public class TestSaveStudent2 {


	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		
		Cource cource1 = entityManager.find(Cource.class,2) ;
		
		
		Cource cource2 = entityManager.find(Cource.class,3) ;
		
		
		List<Cource> cources = new ArrayList<Cource>() ;
		cources.add(cource1) ;
		cources.add(cource2) ;
		
		Student student = new Student() ;
		student.setName("Mia");
		student.setAge(25);
		student.setCources(cources);
		
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
	}
}
