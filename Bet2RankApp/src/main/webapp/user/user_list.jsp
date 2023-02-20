<%@page import="java.util.List"%>
<%@page import="com.java.to.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bet2Rank | Leaderboard</title>
</head>
<link rel="stylesheet" href="css/style.css"/>
<div id="main">
<h1>Leaderboard</h1>
<table border="1">
	<thead>
		<tr>
			<th>#</th>
			<th>Username</th>
			<th>SuccessRate</th>
		</tr>	
	</thead>
	<tbody>
		<%
			int i = 1;
			List<User> list = (List) request.getAttribute("list");
		%>
		
		<%
			for (User u : list) {
		%>
			<tr>
				<td><%=i++%></td>
				<td><%=u.getUsername()%></td>
				<td><%=u.getSuccessRate()%></td>
			</tr>
			
		<%}%>
	</tbody>
</table>
</div>
</html>
