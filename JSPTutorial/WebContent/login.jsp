<html>
<head>

<%--
1) Create success jsp
2) read the values (username, password)
3) Print them on browser
 --%>
<title>login</title>

</head>
<body>
<form action="login-success.jsp" method="post">
Username:<input type="text" name="username"><br>
Password:<input type="password" name="password"><br>
<input type="submit" name="login" value="login">
</form>
</body>

</html>