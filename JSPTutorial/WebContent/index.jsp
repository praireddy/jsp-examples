<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addition</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">

</head>
<body>
<!--action attribute send data to add.jsp-->
<h1 align="center"><b>
welcome user
</b> 
</h1>
<form action="add.jsp" method="post">
<table align="center" class="tableProperties">

<tr>
<td>
Enter first Number:
</td>
<td>
-<input type="text" name="firstNumber" />
</td>
</tr>
<tr>
<td>
Enter Second Number:
</td>
<td>
-<input type="text" name="secondNumber" />
</td>
</tr>
<tr>
<td>
Enter your Name:
</td>
<td>
-<input type="text" name="fname"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Submit"/>
</td>
</tr>
</table>
	
	
	
	
</form>

</body>
</html>