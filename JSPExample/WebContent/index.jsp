<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prashanthi</title>
</head>
<body bgcolor="skyblue">
iam new to jsp
<p>&nbsp;</p>
<div align="center">
<center>
<table border="0" cellpadding="0" cellspacing="0" width="460" bgcolor="#EEFFCA">
<tr>
<td width="100%"><font size="6" color="#008000">&nbsp;Date Example</font></td>
</tr>
<tr>
<td width="100%"><b>&nbsp;Current Date and time is:&nbsp; <font color="#FF0000">
<%= new java.util.Date() %>
<% out.print("welcome to jsp tutorial"); %>  
<% System.out.print("hello"); %>
<% int dataValue=50;
 System.out.println("the value is="+dataValue); %>

</font></b></td>
</tr>
</table>
</center>
</div>

</body>
</html>