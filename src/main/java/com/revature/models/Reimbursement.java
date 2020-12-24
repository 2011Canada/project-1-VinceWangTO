package com.revature.models;

import java.sql.Timestamp;

public class Reimbursement {

	private int reimbursementId;
	private double reimbursementAmount;
	private Timestamp reimbursementSubmitted;
	private Timestamp reimbursementResolved;
	private String reimbursementDescription;
	private byte[] reimbursementReceipt;
	private int reimbursementAnthorId;
	private int reimbursementResolverId;
	private int reimbursementStatusId;
	private int reimbursementTypeId;

	public Reimbursement() {

	}

	public Reimbursement(int reimbursementId, double reimbursementAmount, Timestamp reimbursementSubmitted,
			Timestamp reimbursementResolved, String reimbursementDescription, byte[] reimbursementReceipt,
			int reimbursementAnthorId, int reimbursementResolverId, int reimbursementStatusId,
			int reimbursementTypeId) {
		this.reimbursementId = reimbursementId;
		this.reimbursementAmount = reimbursementAmount;
		this.reimbursementSubmitted = reimbursementSubmitted;
		this.reimbursementResolved = reimbursementResolved;
		this.reimbursementDescription = reimbursementDescription;
		this.reimbursementReceipt = reimbursementReceipt;
		this.reimbursementAnthorId = reimbursementAnthorId;
		this.reimbursementResolverId = reimbursementResolverId;
		this.reimbursementStatusId = reimbursementStatusId;
		this.reimbursementTypeId = reimbursementTypeId;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public double getReimbursementAmount() {
		return reimbursementAmount;
	}

	public void setReimbursementAmount(double reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}

	public Timestamp getReimbursementSubmitted() {
		return reimbursementSubmitted;
	}

	public void setReimbursementSubmitted(Timestamp reimbursementSubmitted) {
		this.reimbursementSubmitted = reimbursementSubmitted;
	}

	public Timestamp getReimbursementResolved() {
		return reimbursementResolved;
	}

	public void setReimbursementResolved(Timestamp reimbursementResolved) {
		this.reimbursementResolved = reimbursementResolved;
	}

	public String getReimbursementDescription() {
		return reimbursementDescription;
	}

	public void setReimbursementDescription(String reimbursementDescription) {
		this.reimbursementDescription = reimbursementDescription;
	}

	public byte[] getReimbursementReceipt() {
		return reimbursementReceipt;
	}

	public void setReimbursementReceipt(byte[] reimbursementReceipt) {
		this.reimbursementReceipt = reimbursementReceipt;
	}

	public int getReimbursementAnthorId() {
		return reimbursementAnthorId;
	}

	public void setReimbursementAnthorId(int reimbursementAnthorId) {
		this.reimbursementAnthorId = reimbursementAnthorId;
	}

	public int getReimbursementResolverId() {
		return reimbursementResolverId;
	}

	public void setReimbursementResolverId(int reimbursementResolverId) {
		this.reimbursementResolverId = reimbursementResolverId;
	}

	public int getReimbursementStatusId() {
		return reimbursementStatusId;
	}

	public void setReimbursementStatusId(int reimbursementStatusId) {
		this.reimbursementStatusId = reimbursementStatusId;
	}

	public int getReimbursementTypeId() {
		return reimbursementTypeId;
	}

	public void setReimbursementTypeId(int reimbursementTypeId) {
		this.reimbursementTypeId = reimbursementTypeId;
	}

}
