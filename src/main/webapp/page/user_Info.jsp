<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta charset="utf-8">
	</head>
	<link rel="stylesheet" type="text/css" href="css/index.css" />
	<body>
		<nav>
			<ul>
				<li><a href="user.jsp" target="myfram">身份信息</a></li>
				<li><a href="zichan_imformation.jsp" target="myfram">资产信息</a></li>
				<li><a href="gongtongjiekuanren.jsp" target="myfram">共同借款人信息</a></li>
			</ul>
			<fieldset id="supplement">
				<a href="makeup.jsp">完善资料</a>
			</fieldset>
		</nav>
		<div class="fram">
			<iframe name="myfram" src="user.jsp" width="100%" height=""></iframe>
		</div>
	</body>
</html>
