<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User creation</title>
		<link href="<c:url value="/res/style.css" />" rel="stylesheet">
	</head>

	<body>

		<div class="header">
			<h1>Define users...</h1>
		</div>
		
		<div class="content">
			<form:form method="post" action="save" modelAttribute="usersForm">
				<table class="panel">
					<tr>
						<th>Name</th>
						<th>Last name</th>
					</tr>
					<c:forEach items="${usersForm.users}" var="user" varStatus="status">
						<tr>
							<td><input name="users[${status.index}].name"
								value="${user.name}" /></td>
							<td><input name="users[${status.index}].surname"
								value="${user.surname }" /></td>
						</tr>
					</c:forEach>
				</table>
				<br />
				<div  class="panel">
					<input type="submit" value="Save" />
				</div>
			</form:form>
		</div>
	</body>
</html>
