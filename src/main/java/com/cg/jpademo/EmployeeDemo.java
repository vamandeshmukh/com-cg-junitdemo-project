package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sridhar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		tr.begin();

		Employee emp1 = new Employee(101, "Sonu", 10.6);
		em.persist(emp1); // insert

// 		em.remove(emp1); // delete
//		em.merge(emp1); // update
		Employee emp2 = em.find(Employee.class, 505); // select
		System.out.println(emp2.toString());
		tr.commit();

		System.out.println("End");

	}

}