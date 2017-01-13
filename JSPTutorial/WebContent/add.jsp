<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jsp.add.Addition" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">

</head>
<body>
 <% 
//Getting the values from index.jsp,here firstNumber, secondNumber values are coming from index.jsp through “name” attribute in input tag of index.jsp
//response.sendRedirect("www.gmail.com");
String firstNumber=request.getParameter("firstNumber");
System.out.println("the value of firstnumber equals to "+firstNumber);
String secondNumber=request.getParameter("secondNumber");
String abc=request.getParameter("fname");
//out.println("Hello"+abc);

//Converting String data type to integer
int fno=Integer.parseInt(firstNumber);
int sno=Integer.parseInt(secondNumber);


//Addition class object created
Addition addition=new Addition();

//sum method of Addition class has been called and two arguments is passed

int result=addition.sum(fno, sno);

//Print output in the web browser(IE,Chrome etc) though “out” implicit object

//out.println("The Sum of the two number===>"+result); 

%>
<table align="left" class="tableProperties">
<tr>
<td>
The Sum of two numbers is :
</td>
<td>
<%=result%> <!-- Expression tag to show output to web page -->


</td>
</tr>
<tr>
<td>
Hello
<%=abc %>
</td>


</tr>
</table>
</body>
</html>

