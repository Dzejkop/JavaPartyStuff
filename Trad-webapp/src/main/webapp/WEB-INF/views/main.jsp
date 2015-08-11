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
      <h1>Your user database</h1>
    </div>

    <h1>Add new users?</h1>

    <div class="panel">
      Amount:
      <form action="addUsers" method="POST">
      <input type="text" name="userNumber" value="0"/>
      <input type="submit" value="Add"/>
      </form>
    </div>

    <h1>Check out existing user?</h1>

    <div class="panel">
      Index of user:
      <form action="checkUser" method="POST">
      <input type="text" name="userIndex" value="0"/>
      <input type="submit" value="Find"/>
      </form>
    </div>

    <h1>Show all users?</h1>

    <div class="panel">
      <form action="allUsers" method="GET">
      <input type="submit" value="Ok"/>
      </form>
    </div>

  </div>
  </body>
</html>
