package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.exceptions.UnauthenticatedException;
import com.revature.exceptions.UnauthorizedException;

public class UserController {

	ObjectMapper om = new ObjectMapper();

	public void getAllUsers(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession sess = req.getSession();

		if (sess.getAttribute("User-Role") == null) {
			throw new UnauthenticatedException();
		} else if (!sess.getAttribute("User-Role").equals("Finace Manager")) {
			throw new UnauthorizedException();
		}

		res.setStatus(200);
//		res.getWriter().write(om.writeValueAsString(user));
//		res.setHeader("Content-Type", "application/json");
	}
}
