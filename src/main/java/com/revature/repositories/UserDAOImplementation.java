package com.revature.repositories;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.revature.models.User;
import com.revature.utils.ConnectionFactory;

public class UserDAOImplementation implements UserDAO {

	private EntityManager em;

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		em = ConnectionFactory.getEntityManager();

		String query = "SELECT c FROM User c WHERE c.username = :username";

		TypedQuery<User> tq = em.createQuery(query, User.class);
		tq.setParameter("username", username);

		User user = null;
		try {
			user = tq.getSingleResult();

		} catch (NoResultException ex) {
			ex.printStackTrace();
			return null;

		} finally {
			em.close();
		}
		return user;
	}

}
