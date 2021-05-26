<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Position Details</title>
  </head>
  <body>
    <h2>Position Detail</h2>
    <c:set value="${requestScope.players}" var="players"/>
    <c:out value="Position: ${requestScope.positionName}" />
    <ul>
      <c:forEach items="${players}" var="player">
        <li><c:out value="${player.name}" /></li>
      </c:forEach>
    </ul>
  </body>
</html>