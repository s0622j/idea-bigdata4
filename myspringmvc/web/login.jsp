<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>login.jsp</title>
</head>
<body>
<c:if test="${sessionScope.user != null}">
  欢迎 <c:out value="${sessionScope.user.name}" />
</c:if>
<c:if test="${sessionScope.user == null}">
  您还未登录，请登录
</c:if>
<c:out value="${sessionScope.user.name}" />

<form action="/doLogin" method="post">
  UserName : <input type="text" name="name"><br>
  Password : <input type="password" name="password"><br>
  <input type="submit" />
</form>
</body>
</html>
