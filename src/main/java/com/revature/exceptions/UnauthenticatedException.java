package com.revature.exceptions;

public class UnauthenticatedException extends AbstractHttpException {

	public UnauthenticatedException() {
		super("Please login", 401);
		// TODO Auto-generated constructor stub
	}

}
