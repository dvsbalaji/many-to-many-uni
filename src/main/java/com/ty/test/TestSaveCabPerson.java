package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Cab;
import com.ty.dto.Person;

public class TestSaveCabPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Person person =  new Person() ;
		person.setName("bunny");
		person.setEmail("bunny@mail.com");
		person.setAge(25);
		
		Person person1 =  new Person() ;
		person1.setName("nuthan");
		person1.setEmail("nuthan@mail.com");
		person1.setAge(32);
		
		Person person2 =  new Person() ;
		person2.setName("chetan");
		person2.setEmail("chetan@mail.com");
		person2.setAge(30);
		
		List<Person> persons = new ArrayList<Person>() ;
		persons.add(person) ;
		persons.add(person1) ;
		persons.add(person2) ;
		
		Cab cab = new Cab() ;
		cab.setDriverName("sins");
		cab.setCost(15);
		cab.setPersons(persons);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(cab);
		entityTransaction.commit();
		
		
		
	}
}
