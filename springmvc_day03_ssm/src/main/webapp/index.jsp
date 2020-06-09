<%--
  Created by IntelliJ IDEA.
  User: administratorad
  Date: 2019/7/25
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>查询所有</h1>
    <a href="account/findAll">查询所有</a>
    <h1>保存</h1>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
