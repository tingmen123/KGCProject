<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <style type="text/css">
        a{
            text-decoration: none;
        }
        a:hover{
            color: pink;
        }
        *{
            padding: 0px;
            margin: 0px;
        }
        h1{
            font-size: 32px;
        }
        form{
            padding-top: 200px;
            font-size: 26px;
        }
    </style>
</head>
<body>
<center>
    
    <form method="post">
        <h1>登录</h1>
        <br />
        账号：<input type="text" name="user" maxlength="18" /><br /><br />
        
        密码：<input type="password" name="password" maxlength="18" /><br /><br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="main.html">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="forgetpsw.jsp">忘记密码？</a>
    </form>
</center>
</body>
</html>
