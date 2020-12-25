package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.exceptions.UnauthenticatedException;
import com.revature.exceptions.UnauthorizedException;
import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbursementDAOImplementation;
import com.revature.services.ReimbursementServiceImplementation;

public class ReimbursementController {

	ObjectMapper om = new ObjectMapper();

	private ReimbursementServiceImplementation reimbursementService = new ReimbursementServiceImplementation(
			new ReimbursementDAOImplementation());

	public void getAllReimbursement(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		HttpSession sess = req.getSession();

		if (sess.getAttribute("User-Role") == null) {
			throw new UnauthenticatedException();
		} else if (!sess.getAttribute("User-Role").equals("Finace Manager")) {
			throw new UnauthorizedException();
		}

		res.setStatus(200);

	}

	public void addReimbursement(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession sess = req.getSession();

//		if (sess.getAttribute("User-Role") == null) {
//			throw new UnauthenticatedException();
//		}

		Reimbursement reimbursement = om.readValue(req.getInputStream(), Reimbursement.class);

		boolean result = reimbursementService.addReimbursement(reimbursement);

		if (result) {
			res.setStatus(201);
			res.getWriter().write(om.writeValueAsString(reimbursement));
			res.setHeader("Content-Type", "application/json");
		} else {
			res.setStatus(400);
			res.getWriter().write("Failed to create");
			res.setHeader("Content-Type", "application/json");
		}
	}

	public void updateReimbursement(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		HttpSession sess = req.getSession();

//		if (sess.getAttribute("User-Role") == null) {
//			throw new UnauthenticatedException();
//		}

		Reimbursement reimbursement = om.readValue(req.getInputStream(), Reimbursement.class);

		boolean result = reimbursementService.updateReimbursement(reimbursement);

		if (result) {
			res.setStatus(200);
			res.getWriter().write(om.writeValueAsString(reimbursement));
			res.setHeader("Content-Type", "application/json");
		} else {
			res.setStatus(400);
			res.getWriter().write("Failed to create");
			res.setHeader("Content-Type", "application/json");
		}
	}
}
