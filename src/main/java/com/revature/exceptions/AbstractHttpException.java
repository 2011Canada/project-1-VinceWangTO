package com.revature.exceptions;

public class AbstractHttpException extends RuntimeException {

	private int statsCode;

	protected AbstractHttpException(String message, int status) {
		super(message);
		this.statsCode = status;
	}

	public int getStatsCode() {
		return statsCode;
	}
}
