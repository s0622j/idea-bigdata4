<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/28
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
  <title>reg.jsp</title>
</head>
<body>
<%--<form action='<c:url value="/reg.jsp" />' method="post">--%>
<form action="/doReg2" method="post">
<%--<form action="/doReg" method="post">--%>
  UserName : <input type="text" name="username"><br>
  Password : <input type="password" name="password"><br>
  <input type="submit" />
</form>
</body>
</html>
