<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			*{
				padding: 0px;
				margin: 0px;
			}
			h1{
				font-size: 32px;
			}
			a{
				text-decoration: none;
			}
			a:hover{
				color: pink;
			}
			form{
				font-size: 26px;
				padding-top: 160px;
			}
		</style>
	</head>
	<body>
			<center>
		<form method="post">
			<h1>重置密码</h1>
			<br />
			输入新密码：<input type="password" name="password1"/><br /><br />
			确认新密码：<input type="password" name="password2"/><br /><br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="login.jsp">提交</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="password.jsp">重置</a>
		</form>
		</center>
	</body>
</html>
