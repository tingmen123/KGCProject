<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>完善资料</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<style type="text/css">
			ul{
				list-style: none;
			}
			
			fieldset{
				list-style: circle;
			}
			
		</style>
	</head>
	<body >
		<div class="container">
			<div class="row">
				<div class="col-12">
					<form class="form">
						<fieldset >
							<legend>资产信息</legend>
							<ul class="text-center">
								<li><div class="form-group">
									自有住宅套数：<input type="text" name="houses" id="houses" value="" />
								</div></li>
								<li><div class="form-group">
									机动车保有量：<input type="text" name="cars" id="cars" value="" />
								</div></li>
								<li><div class="form-group">
									其他资产价值：<input type="text" name="assets" id="assets" value="" />
								</div></li>
								<li><div class="form-group">
									其他负债总额：<input type="text" name="debts" id="debts" value="" />
								</div></li>
							</ul>
						</fieldset>
					</form>
				</div>
			</div>

			<div class="row">
				<div class="col-12">
					<form class="form">
						<fieldset>
							<legend>共同借款人信息</legend>
							<ul class="text-center">
								<li><div class="form-group">
									&emsp;姓名：&emsp;<input type="text" name="tname" id="tname" value="" />
								</div></li>
								<li><div class="form-group">
									身份证号：<input type="text" name="tid" id="tid" value="" />
								</div></li>
								<li><div class="form-group">
									手机号码：<input type="text" name="ttel" id="ttel" value="" />
								</div></li>
								<li><div class="form-group">
									家庭住址：<input type="" name="tadd" id="tadd" value="" />
								</div></li>
							</ul>
						</fieldset>
					</form>
				</div>
			</div>
			<div class="row text-right">
				<div class="col-6">
				</div>
				<div class="col-6">
					<button class="btn btn-info" href="#">提交资料</button>
				</div>
				
			</div>
		</div>
		<script src="js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
