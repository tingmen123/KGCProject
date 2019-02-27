<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>注册</title>
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
				padding-top: 100px;
				font-size: 26px;
			}
		</style>
	</head>
	<body >
		<center>
		
		<form method="post">
			<h1>用户注册</h1>
			<br />
			姓名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="realname" /><br /><br />
			身份证： &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="shenfenzheng" maxlength="18" /><br /><br />
			手机号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="tel" name="telephone" maxlength="11"/><br /><br />
			密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password1" /><br /><br />
			确认密码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password2" /><br /><br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="login.jsp">提交</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="reguit.jsp">重置</a>
			</center>
		</form>
		
	</body>
</html>
