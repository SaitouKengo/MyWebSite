<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンター情報更新確認</title>
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
		<br>

		<h2 class="text-center">メンター更新内容確認</h2>

		<br><br>名前: 東村博之
		<br><br>ログインID: hiroyuki
		<br><br>パスワード: ●●●●
		<br><br>自己紹介: 来月新作本発売予定です。。


		<br><br><br> 上記内容で更新してよろしいでしょうか。<br><br>


		<div class="button_center">
			<a class="btn btn-primary" href="MentorDataUpdateResult">更新</a> <a
				class="btn btn-danger" href="MentorData">戻る</a>
		</div>

	</div>
</body>
</html>