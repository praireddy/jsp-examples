package com.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  

		try{
			String username = request.getParameter("uname");  
			System.out.println("userName===="+username);
			String password = request.getParameter("password");
			System.out.println("password===="+password);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javatraining",
					"root", "root");
			System.out.println("select * from user where userName='" + username + "' and password='" +password + "'");
			Statement st = con.createStatement();
			ResultSet rs;
			rs = st.executeQuery("select * from tblstudent where username='" + username + "' and password='" +password + "'");

			if (rs.next()) {
				HttpSession session = request.getSession();
				//Setting values in the session
				session.setAttribute("userid", username);
				session.setAttribute("firstname", rs.getString(5));
				session.setAttribute("lastname", rs.getString(6));
				session.setAttribute("email", rs.getString(7));
				session.setAttribute("contactnum", rs.getString(4));
				session.setAttribute("ssnnumber", rs.getString(8));
				//getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
				rd.forward(request, response);
			}
			else{
				pw.println("Invalid password <a href='index.jsp'>try again</a>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
			}


			//writing html in the stream  
			//pw.println("<html><body>");  
			//pw.println("Welcome User");  
			//pw.println("</body></html>");  

			pw.close();//closing the stream
		} catch(ClassNotFoundException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
