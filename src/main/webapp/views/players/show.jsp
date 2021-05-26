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
  <title>Team Details</title>
  </head>
  <body>
    <h2>Player Detail</h2>
    <c:set value="${requestScope.player}" var="player"/>
    <c:out value="${player.name}: ${player.position}" /></li>
    </ul>
  </body>
</html>