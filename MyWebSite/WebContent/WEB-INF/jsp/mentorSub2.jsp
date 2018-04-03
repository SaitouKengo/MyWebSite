<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンタープロフィール更新</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>
<body background="picture/p0526_m.jpg">
	<ul class="navbar justify-content bg-dark">
	    <li class="nav"><a class="nav-link active"
			href="MessageList">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="MentorData">${userInfo.name}さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="Login">ユーザー用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="Logout">ログアウト</a></li>
	</ul>

	<div class="container">

		<h2 class="text-center">メンタープロフィール更新</h2>

		<form>
			<div class="form-group">
				<label for="formGroupExampleInput">ログインID</label> <input type="text"
					class="form-control" id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" class="form-control" id="formGroupExampleInput2"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" class="form-control" id="formGroupExampleInput2"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">自己紹介</label> <input type="text"
					class="form-control" id="formGroupExampleInput2" placeholder="">
			</div>

		</form>

		<br>
		<div class="button_center">
			<a class="btn btn-primary" href="MentorDataUpdateConfirm">更新</a>
		</div>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="MessageList">戻る</a></li>

		</ul>

	</div>

</body>
</html>