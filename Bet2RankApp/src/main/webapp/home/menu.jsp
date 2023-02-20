<!DOCTYPE html>
<html>
<head>
</head>

<div id="nav" class="vmenu">
	<a class="menu_link${HOME}" href="<%=request.getContextPath()%>/account">Account Details</a>
	<a class="menu_link${LB}" href="<%=request.getContextPath()%>/Leaderboard?action=list">Leaderboard</a>
	<a class="menu_link${MKS}" href="<%=request.getContextPath()%>/markets">Markets</a>
</div>



<script>
	var header = document.getElementById("nav");
	var links = header.getElementsByClassName("menu_link");
	for (var i = 0; i < links.length; i++) {
		links[i].addEventListener("click", function()) {
			var current = document.getElementsByClassName("active");
			current[0].className = current[0].className.replace(" active", "");
			this.className += " active";
		});
	}
</script>


</html>