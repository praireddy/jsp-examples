<html>
<head>
<style>
.welcome-messae {
	margin-bottom: 20px;
	border-color: green;
	background-color: yellow;
}

.personal-info {
	background-color: pink;
}
</style>
</head>
<body>

	<%
		if ((session.getAttribute("userid") == null)
				|| (session.getAttribute("userid") == "")) {
	%>

	You are not logged in
	<br />
	<a href="index.jsp">Please Login</a>
	<%
		} else {
	%>
	<table align="center" class="welcome-messae">
		<tr>
			<td><b>Welcome </b><%=session.getAttribute("userid")%></td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;<a href='logout.jsp'><b>Log
						out</b>
			</a>
			</td>
		</tr>
	</table>

	<table class="personal-info" align="center" border="1" width="30%"
		cellpadding="5">
		<tr>
			<td>FirstName:</td>
			<td><%=session.getAttribute("firstname")%></td>
		</tr>
		<tr>
			<td>Lastname:</td>
			<td><%=session.getAttribute("lastname")%></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><%=session.getAttribute("email")%></td>
		</tr>
		<tr>
			<td>Contact Number:</td>
			<td><%=session.getAttribute("contactnum")%></td>
		</tr>
		<tr>
			<td>SSN Number:</td>
			<td><%=session.getAttribute("ssnnumber")%></td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>

