package com.revature.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import com.revature.models.Reimbursement;
import com.revature.utils.ConnectionFactory;

public class ReimbursementDAOImplementation implements ReimbursementDAO {

	private EntityManager em;

	@Override
	public List<Reimbursement> getAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement getReimbursementById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		em = ConnectionFactory.getEntityManager();

		EntityTransaction et = null;

		try {

			et = em.getTransaction();
			et.begin();
			em.persist(reimbursement);
			et.commit();

			return true;
		} catch (NoResultException ex) {

			if (et != null) {
				et.rollback();
			}

			return false;
		} finally {
			em.close();
		}

	}

	@Override
	public boolean updateReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		em = ConnectionFactory.getEntityManager();

		EntityTransaction et = null;

		Reimbursement resb = null;
		try {

			et = em.getTransaction();
			et.begin();
			resb = em.find(Reimbursement.class, reimbursement.getReimbursementId());

			resb.setReimbursementAmount(reimbursement.getReimbursementAmount());
			resb.setReimbursementSubmitted(reimbursement.getReimbursementSubmitted());
			resb.setReimbursementResolved(reimbursement.getReimbursementResolved());
			resb.setReimbursementDescription(reimbursement.getReimbursementDescription());
			resb.setReimbursementReceipt(reimbursement.getReimbursementReceipt());
			resb.setReimbursementAnthorId(reimbursement.getReimbursementAnthorId());
			resb.setReimbursementResolverId(reimbursement.getReimbursementResolverId());
			resb.setReimbursementStatusId(reimbursement.getReimbursementStatusId());
			resb.setReimbursementTypeId(reimbursement.getReimbursementTypeId());

			em.persist(resb);
			et.commit();

			return true;
		} catch (NoResultException ex) {

			if (et != null) {
				et.rollback();
			}

			return false;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean deleteReimbursement(int reimbursementId) {
		// TODO Auto-generated method stub
		return false;
	}

}
