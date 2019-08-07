<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>success</title>
</head>
<body>
<%--解决路径重复问题--%>
<%--<%--%>
<%--    String path = request.getContextPath();--%>
<%--    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--%>--%>
<%--<% request.setCharacterEncoding("utf-8");%>--%>
<%--<% response.setCharacterEncoding("utf-8");%>--%>
<h2> hello spring mvc</h2>
<a href="index">访问controller类中index method</a>
<a href="first?username=vecher&age=24">访问controller类中带参数index方法</a>
<form action="first" method="post">
    <button type="submit">访问test方法</button>
</form>
<br>
<a href="emp/selectAll">访问empController类中method</a>
<br>
<a href="dept/selectAll">访问deptController类中method</a>
<br>
<a href="testVariable/100">访问testVariable method</a><br>
<h2>多参数传递</h2>
<form action="testLogin" method="post">
    <p> UserName:<input type="text" name="username"></p>
    <p> PassWord:<input type="password" name="userpsd"></p>
    <p>
        <button type="submit"> login</button>
        <button type="reset"> reset</button>
    </p>

</form>
<h2> pojo 验证</h2>
<form action="addEmp" method="post">
    <p> 员工编号：<input type="text" name="empId"></p>
    <p> 员工姓名：<input type="text" name="empName"></p>
    <p> 员工工资：<input type="text" name="empSalary"></p>
    <p> 部门编号：<input type="text" name="dept.deptId"></p>
    <p> 部门名称：<input type="text" name="dept.deptName"></p>
    <p>
        <button type="submit"> sign in</button>
        <button type="reset"> reset</button>
    </p>
</form>
<h2>  使用Servlet原生API</h2>
<form action="testServletAPI" method="post">

<p>UserName:<input  type="text" name="userName"></p>
<p>Password:<input  type="password" name="userPwd"></p>
<p>
    <button type="submit"> Submit</button>
    <button type="reset"> Reset</button>
</p>
</form>
<h2> ModelAndView</h2>
<form action="/findEmp" method="post">

    <p>请输入员工编号:<input  type="text" name="empId"></p>
    <button type="submit"> 查询</button>
    </p>
</form>

</body>
</html>
