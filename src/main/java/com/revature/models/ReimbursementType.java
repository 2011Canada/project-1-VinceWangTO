package com.revature.models;

public class ReimbursementType {

	private int reimbursementTypeId;
	private String reimbursementType;

	public ReimbursementType() {

	}

	public ReimbursementType(int reimbursementTypeId, String reimbursementType) {

		this.reimbursementTypeId = reimbursementTypeId;
		this.reimbursementType = reimbursementType;
	}

	public int getReimbursementTypeId() {
		return reimbursementTypeId;
	}

	public void setReimbursementTypeId(int reimbursementTypeId) {
		this.reimbursementTypeId = reimbursementTypeId;
	}

	public String getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

}
