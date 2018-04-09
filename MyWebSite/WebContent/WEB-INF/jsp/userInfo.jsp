<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お悩み相談受付完了</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
</head>
<body background="picture/p0526_m.jpg">
	<ul class="navbar justify-content bg-dark">
	    <li class="nav"><a class="nav-link active"
			href="UserList">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="UserData?id=${userInfo.id}">${userInfo.name}さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="MentorLogin">メンター用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="Logout">ログアウト</a></li>
	</ul>
	<div class="container">


		<br><br>
		<div class="alert alert-success" role="alert">
			<h5 class="alert-heading text-center">お悩み相談受付完了</h5>
		</div>
		<br><br>


		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="UserList">戻る</a></li>

		</ul>

	</div>


</body>
</html>