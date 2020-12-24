package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Credentials;
import com.revature.models.User;

public class AuthServlet extends HttpServlet {

	ObjectMapper om = new ObjectMapper();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		Credentials cred = om.readValue(req.getInputStream(), Credentials.class);
		System.out.println(cred.getUsername());
		User user = new User(1, "username", "PW", "Heng", "Wang", "heng.wang@revature.net", 2);

		res.setStatus(200);
		res.getWriter().write(om.writeValueAsString(user));
		res.setHeader("Content-Type", "application/json");
	}

}
