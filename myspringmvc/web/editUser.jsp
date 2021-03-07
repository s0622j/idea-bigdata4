<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>editUser.jsp</title>
</head>
<body>
<form action='<c:url value="/updateOne" />' method="post">
  id : <input type="hidden" name="id" value='<c:out value="${user.id}" />'><br>
  UserName : <input type="text" name="name" value='<c:out value="${user.name}" />'><br>
  age : <input type="text" name="age" value='<c:out value="${user.age}" />'><br>
  <input type="submit" />
</form>
</body>
</html>
