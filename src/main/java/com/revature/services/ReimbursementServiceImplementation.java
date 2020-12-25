package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementDAOImplementation;

public class ReimbursementServiceImplementation implements ReimbursementService {

	private ReimbursementDAOImplementation resd;

	public ReimbursementServiceImplementation(ReimbursementDAOImplementation resd) {
		this.resd = resd;
	}

	@Override
	public List<Reimbursement> getReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getReimbursementsByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		return this.resd.addReimbursement(reimbursement);
	}

	@Override
	public boolean updateReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		return this.resd.updateReimbursement(reimbursement);
	}

	@Override
	public boolean deleteReimbursement(int reimbursementId) {
		// TODO Auto-generated method stub
		return false;
	}

}
