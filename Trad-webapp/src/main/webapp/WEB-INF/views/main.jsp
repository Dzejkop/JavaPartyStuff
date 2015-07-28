<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starting page</title>
</head>
<body>

<h1>Add new users?</h1>

Amount:
<form action="addUsers" method="POST">
<input type="text" name="userNumber" value="0"/>
<input type="submit" value="Submit"/>
</form>

<h1>Check out existing user?</h1>

Index of user:
<form action="checkUser" method="POST">
<input type="text" name="userIndex" value="0"/>
<input type="submit" value="Submit"/>
</form>

</body>
</html>