package com.revature.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.revature.models.User;

public class TestJDBC {

	private static EntityManagerFactory ENTITI_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Project1");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getUser(1);
		System.out.println("\n*********************\n");
		getUsers();
		ENTITI_MANAGER_FACTORY.close();
	}

	public static void getUser(int id) {

		EntityManager em = ENTITI_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT c FROM User c WHERE c.userId = :userID";

		TypedQuery<User> tq = em.createQuery(query, User.class);
		tq.setParameter("userID", id);

		User user = null;
		try {
			user = tq.getSingleResult();
			System.out.println(user.getUsername());
		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void getUsers() {

		EntityManager em = ENTITI_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT u FROM User u";
		TypedQuery<User> tq = em.createQuery(query, User.class);

		List<User> users;
		try {

			users = tq.getResultList();
			users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));

		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}

	}

}
