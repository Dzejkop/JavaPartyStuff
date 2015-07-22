<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hej!</h1>
<h3>Twoje pieprzone koty: </h4>

<c:forEach var="element" items="${koty}">
   Element ${element}<br />
</c:forEach>

</body>
</html>