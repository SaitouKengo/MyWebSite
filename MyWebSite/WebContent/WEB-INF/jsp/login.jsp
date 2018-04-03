<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザーログイン画面</title>

<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
<script src="js/bootstrap.min.js"></script>
</head>

<body background="picture/p0526_m.jpg">
	<ul class="navbar justify-content bg-dark">

	</ul>

	<div class="container">

		<br>

		<h2 class="text-center">ユーザーログイン画面</h2>
		<form  action="Login" method="post">

		<div class="button_right">
			<a class="btn btn-success" href="Regist">ユーザー新規登録</a><br> <br>
		</div>


			<div class="form-group">
				<label for="formGroupExampleInput">ログインID</label>
				 <input type="text"	name=loginId class="form-control" id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" name=password class="form-control" id="formGroupExampleInput2"
					placeholder="">
			</div>

		<br>
		<div class="button_center">
			<button class="btn btn-primary btn-block" type="submit">ログイン</button>
		</div>
		</form>

		<br><br>
		<div class="button_right">
			<a class="btn btn-danger" href="MentorLogin">メンターログイン画面へ</a><br> <br>
		</div>

	</div>
</body>
</html>