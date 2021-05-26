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
  <title>List of Positions</title>
  </head>
  <body>
    <h2>List of Positions</h2>
    <c:set value="${requestScope.positions}" var="positions"/>
    <ul>
      <c:forEach items="${positions}" var="position">
        <li><a href="/position?name=${position.name}"><c:out value="${position.name}"/></a></li>
      </c:forEach>
    </ul>
  </body>
</html>