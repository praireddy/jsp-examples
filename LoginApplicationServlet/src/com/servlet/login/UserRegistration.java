package com.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/registration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String userName = request.getParameter("userName");    
			String password = request.getParameter("password");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String ssnnumber= request.getParameter("ssnnumber");
			String contactnum = request.getParameter("contactnum");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining",
					"root", "root");
			Statement st = con.createStatement();
			String query = "insert into tblstudent(`contactnum`, `first_name`, `last_name`, `email`, `username`, `password`,`ssnnumber`) values ('" + contactnum + "','" + firstName + "','" 
			+ lastName + "','" + email + "','" + userName + "','" + password +"','" + ssnnumber + "');";
			System.out.println("query "+query);
			int i = st.executeUpdate(query);
			if (i > 0) {
				response.sendRedirect("welcome.jsp");

			} else {
				response.sendRedirect("index.jsp");
			}

		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  


		//writing html in the stream  
		//pw.println("<html><body>");  
		//pw.println("Welcome User");  
		//pw.println("</body></html>");  

		pw.close();//closing the stream

	}
}
