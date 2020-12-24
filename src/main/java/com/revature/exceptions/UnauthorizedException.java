package com.revature.exceptions;

public class UnauthorizedException extends AbstractHttpException {

	public UnauthorizedException() {
		super("You don't have permission to do this!", 403);
		// TODO Auto-generated constructor stub
	}

}
