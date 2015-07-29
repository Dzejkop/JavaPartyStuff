<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starting page</title>
</head>
<body>

	<h1>Your users:</h1>

	<p>
		<c:forEach items="${users}" var="user" varStatus="status">
		ID: ${user.id} <br />
		Name: ${user.name} <br />
		Last Name: ${user.surname} <br />
			<br />
		</c:forEach>

	</p>
</body>
</html>