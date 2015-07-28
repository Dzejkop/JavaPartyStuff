<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User creation</title>
</head>
<body>

	<h1>Define users...</h1>

	<form:form method="post" action="save" modelAttribute="usersForm">
		<table>
			<tr>
				<th>Name</th>
				<th>Last name</th>
			</tr>
			<c:forEach items="${usersForm.users}" var="user" varStatus="status">
				<tr>
					<td><input name="users[${status.index}].firstName"
						value="${user.firstName}" /></td>
					<td><input name="users[${status.index}].lastName"
						value="${user.lastName }" /></td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<input type="submit" value="Save" />

	</form:form>

</body>
</html>