<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.sql.Connection, java.sql.DriverManager,java.sql.ResultSet,java.sql.ResultSetMetaData,java.sql.Statement"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>login-success</title>
</head>
<body>
<%
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	out.println("username is " + userName);
	out.println("password is " + password);
	
	Class.forName("com.mysql.jdbc.Driver").newInstance(); 
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","root");

	stmt =conn.createStatement();
	String query = "Select * from tblstudent where username='"+userName+ "' and password='"+password+"';";
	System.out.println(query);
	rs = stmt.executeQuery(query);
	

%>
</body>
</html>