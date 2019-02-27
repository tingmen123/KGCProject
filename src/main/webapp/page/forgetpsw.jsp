<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			h1{
				font-size: 32px;
			}
			*{
				padding: 0px;
				margin: 0px;
			}
			a{
				text-decoration: none;
			}
			a:hover{
				color: pink;
			}
			form{
				padding-top: 180px;
				font-size: 26px;
			}
		</style>
	</head>
	<body>
		
		<center>
		<form method="post">
			<h1>忘记密码</h1>
			<br />
			身份证：<input type="text" name="user" maxlength="18"/><br /><br />
			手机号：<input type="tel" name="phone" maxlength="11"/><br /><br />
			验证码：<input type="text" name="yanzheng" maxlength="6"/><br /><br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="password.jsp">提交</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="forgetpsw.jsp">重置</a>
		</form>
		</center>
	</body>
</html>
