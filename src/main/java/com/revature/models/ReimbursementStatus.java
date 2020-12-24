package com.revature.models;

public class ReimbursementStatus {

	private int reimbursementStatusId;
	private String reimbursementStatus;

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
