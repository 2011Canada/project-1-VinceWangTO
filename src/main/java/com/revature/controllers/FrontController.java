package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AuthController authController = new AuthController();
	private ErrorController errorController = new ErrorController();
	private UserController userController = new UserController();

	protected void directControlRouter(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		String[] path = req.getRequestURI().split("/");
		String id = "";
		String URI = "/" + path[2];
		if (path.length >= 4) {
			id = path[3];
		}
		System.out.println("URI: " + URI);
		switch (URI) {
		case "/login": {
			switch (req.getMethod()) {
			case "GET": {
				res.setStatus(400);
				res.getWriter().write("Method Not Supported");
				break;
			}
			case "POST": {
				authController.userLogin(req, res);
				break;
			}
			case "PUT": {
				res.setStatus(400);
				res.getWriter().write("Method Not Supported");
				break;
			}
			default: {
				res.setStatus(400);
				res.getWriter().write("Method Not Supported");
				break;
			}
			}
			break;
		}
		case "/users": {
			if (!id.equals("")) {
				System.out.println("ID: " + id);
				break;
			} else {
				switch (req.getMethod()) {
				case "GET": {
					userController.getAllUsers(req, res);
					break;
				}
				case "POST": {
					// authController.userLogin(req, res);
					break;
				}
				case "PUT": {
					res.setStatus(400);
					res.getWriter().write("Method Not Supported");
					break;
				}
				default: {
					break;
				}
				}
				break;
			}
		}
		default: {
			break;
		}
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void directControl(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			directControlRouter(request, response);
		} catch (Throwable t) {
			errorController.handle(request, response, t);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.directControl(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.directControl(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.directControl(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.directControl(request, response);
	}

}
