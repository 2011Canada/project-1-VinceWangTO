package com.revature.repositories;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementDAO {

	public List<Reimbursement> getAllReimbursements();

	public List<Reimbursement> getReimbursementByUserId(int userId);

	public Reimbursement getReimbursementById(int id);

	public boolean addReimbursement(Reimbursement reimbursement);

	public boolean updateReimbursement(Reimbursement reimbursement);

	public boolean deleteReimbursement(int reimbursementId);
}
