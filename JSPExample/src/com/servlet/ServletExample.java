package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
		//do your own thing
		String message = req.getParameter("prashanthiMessage");
		req.setAttribute("messageBack","Thank You!!");
		System.out.println(message);
		//TODO - Explain this... 
		getServletContext().getRequestDispatcher("/servlet-example.jsp").forward(req, resp);
	}
}
