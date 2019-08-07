<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2019/8/7
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>modelAndView 用法</h2>
<form action="/emp/findEmp" method="post">

    <p>请输入员工编号:<input  type="text" name="empId"></p>
    <button type="submit"> 查询</button>
    </p>
</form>
员工信息为:${requestScope.Emp}

<h2>Map 用法</h2>
<form action="/emp/findEmpMap" method="post">

    <p>请输入员工编号:<input  type="text" name="empId"></p>
    <button type="submit"> 查询</button>
    </p>
</form>
员工信息为:${requestScope.FindEmp}
</body>
</html>
