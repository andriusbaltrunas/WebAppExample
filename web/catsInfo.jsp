<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 4/18/2017
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<br>
  <c:forEach items="${cats}" var="cat">
    <div>name : ${cat.name}</div>
    <div>kind : ${cat.kind}</div>
    <div>age : ${cat.age}</div>
    <div>weight : ${cat.weight} </div>
    <div>your cat like milk? : ${cat.itLikeMilk}</div></br>
  </c:forEach>
</body>
</html>
