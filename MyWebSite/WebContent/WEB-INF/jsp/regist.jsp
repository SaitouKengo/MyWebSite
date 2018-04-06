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

		<form>

			<div class="form-group">
				<label for="formGroupExampleInput2">ログインID</label> <input type="text"
					class="form-control" id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">ユーザー名</label> <input type="text"
					class="form-control" id="formGroupExampleInput2" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">生年月日</label> <input type="date"
					class="form-control" id="formGroupExampleInput3" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" class="form-control" id="formGroupExampleInput4"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" class="form-control" id="formGroupExampleInput5"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">自己紹介</label> <input
					type="text" class="form-control" id="formGroupExampleInput6"
					placeholder="">
			</div>

		</form>

		<br>
		<div class="button_center">
			<a class="btn btn-primary" href="RegistConfirm">登録</a>
		</div>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="Login">戻る</a></li>



		</ul>

	</div>

</body>
</html>