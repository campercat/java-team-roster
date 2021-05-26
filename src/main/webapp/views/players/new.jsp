<%@ page language="java" contentType="text/html, charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Player</title>
  </head>
  <body>
    <h2>Add A New Player</h2>
    <form action="/player" method="post">
      <div>
        <label for="name">Name: </label>
        <input type="text" name="name" value="" />
      </div>
      <div>
        <label for="position">Position: </label>
        <input type="text" name="position" value="" />
      </div>
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>