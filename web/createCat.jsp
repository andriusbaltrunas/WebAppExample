<%--
  Created by IntelliJ IDEA.
  User: andriusbaltrunas
  Date: 4/18/2017
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

  <form action="/createCat" method="post">
    <div>name: <input name="catName"></div>
    <div>kind: <input name="catKind"></div>
    <div>age: <input name="catAge"></div>
    <div>weight: <input name="catWeight"></div>
    <div>is your cat like milk: <input type="checkbox" name="isLikeMik"></div>
    <button>SUKURTI CAT</button>
  </form>

</body>
</html>
