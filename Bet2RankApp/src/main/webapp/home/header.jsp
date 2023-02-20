<%@ page import="com.java.to.User" %>
<%@ page import="com.java.business.UserBusiness" %>
<link rel="stylesheet" href="css/style.css"/>

<div id="header">
	<div style="text-align: center; font-size: 35px; color: white; font-family: Arial, Helvetica, sans-serif;">Bet2Rank</div>
	<div style="position: fixed; right: 10px; top: 10px; color: white; font-family: Arial, Helvetica, sans-serif;">Hello, <%=((User) session.getAttribute("CURRENT_USER")).getUsername() %></div>
	<div style="position: fixed; right: 10px; top: 30px; color: white; font-family: Arial, Helvetica, sans-serif;"><a href="<%=request.getContextPath()%>/logout">Logout</a></div>
</div>