<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bet2Rank | Register</title>
</head>
<link rel="stylesheet" href="css/register.css"/>

<body>

<div id="register">
<form action="register" method="get">
  <div class="container">
    <h1>Bet2Rank | Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" id="username" required>

    <label for="pass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required>

    <hr>

    <button type="submit" class="registerbtn" value="register">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="/Bet2RankApp/login.jsp">Sign in</a>.</p>
  </div>
</form>
</div>
</body>
</html>
</html>