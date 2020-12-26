package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementService {

	public List<Reimbursement> getReimbursements();

	public List<Reimbursement> getReimbursementsByUserId(int userId);

	public Reimbursement getReimbursement(int reimbursementId);

	public boolean addReimbursement(Reimbursement reimbursement);

	public boolean updateReimbursement(Reimbursement reimbursement);

	public boolean deleteReimbursement(int reimbursementId);
}
