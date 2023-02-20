<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bet2Rank | Account</title>
</head>

<script>
	function deleteUser() {
		var userName = document.getElementById("userName").value;
		if (confirm("Are you sure you want to delete your account? This action cannot be undone.")) {
			window.location.href = "<%=request.getContextPath()%>/Account?action=delete&userName=" + userName;
		}
	}
</script>

<div id="main">
	
		<h1>User Stats</h1>
		<p>Bets Placed: </p>
		<p>Bets Won: </p>
		<p>Success Rate: </p>

		<h1>Edit Account Details</h1>
	<form>	
		<p>Change Password: </p>	
		<div class="col">
			<input type="password" placeholder="Current password"
			name="password" required>
		</div>
		<div class="col">
			<input type="password" placeholder="New password"
			name="password" required>
		</div>
		
			<div class="col">
				<button type="submit">Submit</button>
			</div>

	</form>
	
	<button onclick="deleteUser()">Delete Account</button>

</div>
</html>