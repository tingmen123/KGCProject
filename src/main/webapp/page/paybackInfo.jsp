<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>借款情况</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<style type="text/css">
			.btn {
				position: relative;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<!--借款情况表-->
			<h1 class="text-info">借款情况</h1>
			<hr>
			<div class="row">
				<table class="table table-striped table-bordered">
					<tr>
						<td>应还金额</td>
						<td>借款金额</td>
						<td>已还金额</td>
						<td>待还金额</td>
					</tr>
					<tr>
						<td>162235</td>
						<td>150000</td>
						<td>60121</td>
						<td>102114</td>
					</tr>
				</table>
			</div>
			<hr>
			<!--本期应还金额-->
			<div class="row">
				<div class="col-md-6">
					<form class="form-inline">
						<label>本期应还金额：
							<input type="text" class="form-control" id="exampleInputAmount" placeholder="2333" readonly>
							（元）
						</label>
					</form>
					<span id="helpBlock" class="help-block">本期应还金额=应还金额/还款期限</span>
				</div>
			</div>
			<!--下一步按钮-->
			<div class="row">
				<div class="col-md-6">
				</div>
				<div class="col-md-6">
					<a href="paybackWay.jsp"><button type="submit" class="btn btn-primary">下一步</button></a>
				</div>
			</div>
		</div>
		<script src="js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
