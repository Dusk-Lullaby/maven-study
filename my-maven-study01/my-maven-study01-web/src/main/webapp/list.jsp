<%--
  Created by IntelliJ IDEA.
  User: sonnet
  Date: 2026/9/21
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <ul>
        <c:forEach items="${list}" var="user">
            <li>用户id：${user.id} &nbsp;&nbsp; 用户名：${user.username}</li>
        </c:forEach>
    </ul>
</body>
</html>
