package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Credentials;
import com.revature.models.User;
import com.revature.repositories.UserDAOImplementation;
import com.revature.services.UserServiceImplementation;

public class AuthController {

	// private someServices

	ObjectMapper om = new ObjectMapper();

	private UserServiceImplementation userService = new UserServiceImplementation(new UserDAOImplementation());

	public void userLogin(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Credentials cred = om.readValue(req.getInputStream(), Credentials.class);

		User user = userService.login(cred.getUsername(), cred.getPassword());

		if (user != null) {
			String userRole = user.getUserRoleId() == 2 ? "Finace Manager" : "Employee";

			HttpSession sess = req.getSession();
			sess.setAttribute("User-Role", userRole);

			res.setStatus(200);
			res.getWriter().write(om.writeValueAsString(user));
			res.setHeader("Content-Type", "application/json");
		} else {
			res.setStatus(401);
		}

	}
}
