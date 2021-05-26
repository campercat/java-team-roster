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
  <title>List of Teams</title>
  </head>
  <body>
    <h2>List of Teams</h2>
    <c:set value="${requestScope.teams}" var="teams"/>
    <ul>
      <c:forEach items="${teams}" var="team">
        <li><a href="/team?teamIndex=${teams.indexOf(team)}"><c:out value="${team.teamName}"/></a></li>
      </c:forEach>
    </ul>
  </body>
</html>