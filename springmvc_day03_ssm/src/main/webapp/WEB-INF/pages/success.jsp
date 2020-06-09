<%--
  Created by IntelliJ IDEA.
  User: administratorad
  Date: 2019/7/25
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>访问成功！</h1>
    <h3>结果列表</h3>
    <c:forEach items="${list}" var="account">
        ${account.id}---${account.name}---${account.money}<br>
    </c:forEach>
</body>
</html>
