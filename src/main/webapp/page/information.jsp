<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>我要贷款</title>
		<style type="text/css">
			* {
				margin: 0 auto;
				padding: 0;
			}

			#bg {
				padding: 0;
				margin: 0;
				position: relative;
				background-color: rgba(0, 0, 0, 0.1);
				height: 300px;
			}

			#square {
				/* border: red solid 1px; */
				background-color: rgba(255, 255, 255, 0.9);
				height: 200px;
				width: 400px;
				position: relative;
				top: 50px;
			}

			#fram {
				width: 350px;
				height: 180px;
				padding-left: 20px;
			}

			#next {
				position: relative;
				text-align: center;
				height: 23px;
				width: 70px;
				background: #FFA500;
				font: normal bold 15px "宋体";
				color: white;
				line-height: 23px;
				top: 58px;
				left: 117px;
			}

			#processingbar:after {
				content: "";
				display: block;
				clear: both;
			}

			#bg:after {
				content: "";
				display: block;
				clear: both;
			}

			#next a {
				text-decoration: none;
				color: white;
			}

			#next a:hover {
				transform: scale(1.25);
				-webkit-transform: scale(1.25);
				-moz-transform: scale(1.25);
				-o-transform: scale(1.25);

			}

			#fram>legend {
				color: dimgrey;
				font-size: 30px;
			}

			#help {
				float: right;
			}
		</style>
	</head>
	<body>
		<div id="bg">
			
			<div id="square">
				<fieldset id="fram">
					<legend>账户信息</legend>
					<form action="#" method="post">
						
						<dl>
							<dt>请选择入账方式：</dt>
							<dd><input type="radio" name="path" id="path1" value="1month" />
								<label for="path1">支付宝</label></dd>
							<dd><input type="radio" name="path" id="path2" value="3month" />
								<label for="path2">银行卡</label></dd>
							
						</dl>
						请输入账号信息：<input type="text" name="amount" id="amount1" /><br>
					</form>

				</fieldset>

			</div>
			<div id="next"><a href="#">提交</a></div>
		</div>
		<hr>
		<!-- <div id="footer">

			<div id="help">
				联系客服：025-88888888
			</div>
		</div> -->

	</body>
</html>
