package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDemo {

	private static EntityManagerFactory factory;
	private static EntityManager entityManager;

	static {
		factory = Persistence.createEntityManagerFactory("abcd");
		System.out.println("persistance.xml accessed.");
	}

	public static EntityManager getEntityManager() {
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		System.out.println("entityManager object created.");
		return entityManager;
	}

}