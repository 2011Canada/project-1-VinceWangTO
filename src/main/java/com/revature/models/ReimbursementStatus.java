package com.revature.models;

import java.util.List;

import javax.persistence.OneToMany;

public class ReimbursementStatus {

	private int reimbursementStatusId;
	private String reimbursementStatus;

	@OneToMany(mappedBy = "status")
	private List<Reimbursement> reimbursements;

	public ReimbursementStatus() {

	}

	public ReimbursementStatus(int reimbursementStatusId, String reimbursementStatus) {

		this.reimbursementStatusId = reimbursementStatusId;
		this.reimbursementStatus = reimbursementStatus;
	}

	public int getReimbursementStatusId() {
		return reimbursementStatusId;
	}

	public void setReimbursementStatusId(int reimbursementStatusId) {
		this.reimbursementStatusId = reimbursementStatusId;
	}

	public String getReimbursementStatus() {
		return reimbursementStatus;
	}

	public void setReimbursementStatus(String reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}

}
