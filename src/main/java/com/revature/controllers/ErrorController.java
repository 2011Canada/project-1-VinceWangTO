package com.revature.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.exceptions.AbstractHttpException;

public class ErrorController {

	public void handle(HttpServletRequest request, HttpServletResponse response, Throwable t) throws IOException {
		// TODO Auto-generated method stub
		if (t == null) {
			response.setStatus(500);
			response.getWriter().write("OOPS somthing went wrong.");
			return;
		}

		if (t instanceof AbstractHttpException) {
			AbstractHttpException err = (AbstractHttpException) t;
			response.setStatus(err.getStatsCode());
			response.getWriter().write(err.getMessage());
		} else {
			response.setStatus(500);
			response.getWriter().write("OOPS somthing went wrong.");
		}
	}

}
