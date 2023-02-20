<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bet2Rank | Login</title>
</head>
<link rel="stylesheet" href="css/login.css"/>

<body>

	<div class="bgr">
		<form action="<%=request.getContextPath()%>/login" method="POST">
			<div class="container">
				<h1>Bet2Rank | Login</h1>
    			<p>Please fill in this form to login.</p>
				<div class="row">
					<div class="col" style="width: 100px">
						<b>Username</b>
					</div>
					<div class="col>">
						<input type="text" placeholder="Enter your username"
						name="username" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<b>Password</b>
					</div>
					<div class="col">
						<input type="password" placeholder="Enter your password"
							name="password" required>
					</div>
				</div>
				
				<div class="row">
					<div class="col"></div>
					<div class="col">
						<button type="submit">Login</button>
					</div>
				</div>
				
				<div class="row">
					<div class="col"></div>
					<div class="col">
						<p class = "login_err"><%=request.getAttribute("err") == null ? "" : request.getAttribute("err")%>
						</p>
					</div>
				</div>
				<div class="container signin">
    				<p>Need an account? <a href="/Bet2RankApp/register.jsp">Register here</a>.</p>
  				</div>
			</div>
		</form>	
	</div>
</body>
</html>