<%--
  Created by IntelliJ IDEA.
  User: sonnet
  Date: 2026/9/20
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <ul>
        <c:forEach items="${list}" var="user">
            用户id：${user.id} &nbsp;&nbsp; 用户名：${user.username}
        </c:forEach>
    </ul>
</body>
</html>
