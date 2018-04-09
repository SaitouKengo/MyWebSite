<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>

<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>
<body background="picture/p0526_m.jpg">

	<ul class="navbar justify-content bg-dark">

	</ul>
	<div class="container">


		<h2 class="text-center">ユーザー新規登録</h2>

		<form  action="Regist" method="post">

		<input type="hidden" name="userType" value="1">


			<div class="form-group">
				<label for="formGroupExampleInput2">ログインID</label> <input type="text"
					name="loginId" class="form-control" id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">ユーザー名</label> <input type="text"
					name="userName" class="form-control" id="formGroupExampleInput2" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">生年月日</label> <input type="date"
					  name="birthDate" class="form-control" id="formGroupExampleInput3" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" name="password" class="form-control" id="formGroupExampleInput4"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" name="passConfirm" class="form-control" id="formGroupExampleInput5"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">自己紹介</label> <input
					type="text" name="profile" class="form-control" id="formGroupExampleInput6"
					placeholder="">
			</div>



		<br>
		<div class="button_center">
			<button class="btn btn-primary" type="submit">登録</button>
		</div>

		</form>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="Login">戻る</a></li>



		</ul>

	</div>

</body>
</html>