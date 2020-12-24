package com.revature.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory ENTITI_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Project1");

	public static EntityManager getEntityManager() {

		return ENTITI_MANAGER_FACTORY.createEntityManager();

	}

}
