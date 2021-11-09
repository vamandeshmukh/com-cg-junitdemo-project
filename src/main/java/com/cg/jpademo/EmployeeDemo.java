package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpademo.model.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sridhar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		tr.begin();

//		Employee emp1 = new Employee(101, "Sonu", 10.6);
		Employee emp2 = new Employee(102, "Monu", 18.5);
//		Employee emp3 = new Employee(103, "Tonu", 15.2);
//		em.persist(emp1); // insert
//		em.persist(emp2);
//		em.persist(emp3);
//		em.detach(emp2);

//		emp2.setFirstName("Aaa");
//		em.merge(emp2); // update
//		System.out.println(emp2.toString());
//		Employee emp5 = em.find(Employee.class, emp2);

		em.remove(emp2); // delete

		Employee emp4 = em.find(Employee.class, 101); // select
		System.out.println(emp4.toString());
		tr.commit();

		System.out.println("End");

	}

}