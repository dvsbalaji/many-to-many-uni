package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Cab;
import com.ty.dto.Person;

public class TestGetCabPersons {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cab cab = entityManager.find(Cab.class, 1);
		if (cab != null) {
			System.out.println("driver name   : " + cab.getDriverName());
			System.out.println("price per km  : " + cab.getCost());
			for (Person person : cab.getPersons()) {
				System.out.println("passinger name  : "+person.getName());
				System.out.println("passinger age   : "+person.getAge());
				System.out.println("passinger mail  : "+person.getEmail());
			}
		}

	}
}
