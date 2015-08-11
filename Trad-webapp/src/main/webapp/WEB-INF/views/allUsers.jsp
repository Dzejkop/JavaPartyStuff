<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Starting page</title>
		<link href="<c:url value="/res/style.css" />" rel="stylesheet">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="<c:url value="/script/jq.js" />"></script>
	</head>
	<body>
		<div class="content">
			<div class="header">
	      <h1>Your users</h1>
	    </div>
				<c:forEach items="${users}" var="user" varStatus="status">
					<div class="panel">
						<p>ID: ${user.id} </p>
						<p>Name: ${user.name} </p>
						<p>Last Name: ${user.surname} </p>
					</div>
				</c:forEach>
		</div>
	</body>
</html>
