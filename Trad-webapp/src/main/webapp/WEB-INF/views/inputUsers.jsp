<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User creation</title>
</head>
<body>

<h1>Define users...</h1>

<h2> Your input: ${userNumber}</h2>

<!-- 
<c:forEach begin="1" end="${userNumber}">
   Element <br />
</c:forEach>
-->

<form:form modelAttribute="userForm" method="post">

 First name: 
 <form:input path="firstName" id="firstName"></form:input>
 <br />

 Last name: 
 <form:input path="lastName" id="lastName"></form:input>
 <br />

 <input type="submit" value="Send form" />
</form:form>

</body>
</html>