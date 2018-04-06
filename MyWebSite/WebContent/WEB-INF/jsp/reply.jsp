<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お悩み相談返信完了</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
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


		<h2 class="text-center"></h2>

		<br><br>
		<div class="alert alert-primary" role="alert">
			<h5 class="alert-heading text-center">返信が完了しました。</h5>
		</div>
		<br><br>


		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="MessageList">戻る</a></li>

		</ul>

	</div>


</body>
</html>