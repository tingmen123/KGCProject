<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>我要还款</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<style type="text/css">
			.btn{
				position:relative;
				left: 30px;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<!--选择还款方式-->
			<h1 class="text-info">选择还款方式</h1>
			<hr >
			<div class="row">
				<div class="col-md-4">
					<label class="radio-inline">
					<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="yinlian"><img src="img/yinlian.jpg" class="img-thumbnail">
				</label>
				<span id="helpBlock1" class="help-block">银联</span>
				</div>
				
				
				<div class="col-md-4">
					<label class="radio-inline">
					<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="alipay"><img src="img/zhifubao.jpg" class="img-thumbnail" style="height: 85px;">
				</label>
				<span id="helpBlock2" class="help-block">支付宝</span>
				</div>
				
				<div class="col-md-4">
					<label class="radio-inline">
					<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="weixin"><img src="img/weixin.jpg" class="img-thumbnail">
				</label>
				<span id="helpBlock3" class="help-block">微信钱包</span>
				</div>
			</div>
			<hr >
			<!--确认还款按钮-->
			<div class="row">
				<div class="col-lg-4"></div>
				<div class="col-lg-4"></div>
				<div class="col-lg-4">
					<button type="button" class="btn btn-primary btn-lg" id="payBtn">确认还款</button>
				</div>
				
			</div>
		</div>
		<script src="js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript">
			$(function(){
				$('#payBtn').click(function(){
					var confirm=window.confirm("您点击了确认还款，确定立刻还款吗？");
					if(!confirm){
						return false;
					}else{
						window.location.href="pages/payments/"+$('input:radio:checked').val()+".jsp";
					}
				})
			});
		</script>
	</body>
</html>
