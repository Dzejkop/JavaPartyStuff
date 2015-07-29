<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starting page</title>
</head>
<body>

<h1>Your user database</h1>

<h1>Add new users?</h1>

Amount:
<form action="addUsers" method="POST">
<input type="text" name="userNumber" value="0"/>
<input type="submit" value="Add"/>
</form>

<h1>Check out existing user?</h1>

Index of user:
<form action="checkUser" method="POST">
<input type="text" name="userIndex" value="0"/>
<input type="submit" value="Find"/>
</form>

<h1>Show all users?</h1>
<form action="allUsers" method="GET">
<input type="submit" value="Ok"/>
</form>

</body>
</html>