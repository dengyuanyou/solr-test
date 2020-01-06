<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">

        function b() {
            var form = $("#loginForm").serialize();
            //表单异步提交
            $.get("/login.do",form,function (data) {
                alert(data);
            });
        }

    </script>

    <title>硅谷商城</title>
</head>
<body>
      异步登录表单
      <hr>
      <form id="loginForm">
          username:<input type="text" name="name"/><br>
          password:<input type="text" name="password"/><br>
          login:<input type="button" value="test" onclick="b()"/><br>
      </form>
</body>
</html>