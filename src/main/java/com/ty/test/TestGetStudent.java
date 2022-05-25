package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import com.ty.dto.Cource;
import com.ty.dto.Student;

public class TestGetStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Student student = entityManager.find(Student.class, 2) ;
		
		if(student != null) {
			System.out.println("name  : "+student.getName());
			System.out.println("age   : "+student.getAge());
			
			for( Cource cource : student.getCources()) {
				System.out.println("cource id        : "+cource.getId());
				System.out.println("cource name      : "+cource.getName());
				System.out.println("cource duration  : "+cource.getDuration() + " year");
			}
		}
	}
}
