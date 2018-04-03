<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報更新確認</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">
	<ul class="navbar justify-content bg-dark">
	    <li class="nav"><a class="nav-link active"
			href="UserList">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="UserData">${userInfo.name}さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="MentorLogin">メンター用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="Logout">ログアウト</a></li>
	</ul>
	<div class="container">
		<br>

		<h2 class="text-center">更新内容確認</h2>

		<br> ユーザ名: まさし<br><br>
		生年月日: 1994年11月11日 <br><br>
		ログインID: coco1<br><br>
		パスワード: ●●●●<br><br>


		<br><br><br> 上記内容で更新してよろしいでしょうか。<br><br>


		<div class="button_center">
			<a class="btn btn-primary" href="UserDataUpdateResult">更新</a> <a
				class="btn btn-danger" href="UserData">戻る</a>
		</div>

	</div>
</body>
</html>