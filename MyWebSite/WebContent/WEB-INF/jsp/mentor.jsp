<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンター詳細画面</title>
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


		<h2 class="text-center">メンター詳細画面</h2>

		<br><img src="${detailUser.picture}"width="180" height="200">

		 <br>${detailUser.profile}<br>
		 <br><br>

		<form method="post" action="Mentor">

		<input type="hidden" name="userId" value="${userInfo.id}">

		<input type="hidden" name="mentorId" value="${detailUser.id}">

		<p>件名：<input type="text" name="subject"></p>

		<dl>
			<dt>相談内容</dt>
			<dd>
				<textarea name="question" placeholder=></textarea>
			</dd>
		</dl>

		<br>

		<div class="button_center">
			<button class="btn btn-primary" type="submit">投稿</button><br> <br>
		</div>

		</form>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="UserList">戻る</a></li>

		</ul>

	</div>

</body>
</html>