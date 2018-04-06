<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>相談履歴詳細</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">
	<ul class="navbar justify-content bg-dark">
	    <li class="nav"><a class="nav-link active"
			href="MessageList">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="MentorData?id=${userInfo.id}">${userInfo.name}さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="Login">ユーザー用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="Logout">ログアウト</a></li>
	</ul>
	<div class="container">
		<br>

		<h2 class="text-center">相談詳細</h2>

		<br> 投稿日時: ${detailQuestion.questionDate} <br><br>
		相談者: ${detailQuestion.mentorName}<br><br>
		件名: ${detailQuestion.userName}<br><br>

		相談内容: ${detailQuestion.question}<br>


		<br><br><br>
		返信日時: ${detailQuestion.replyDate} <br><br>
		返信者: ${userInfo.name} <br><br>

		返信内容: ${detailQuestion.reply}
		<br><br><br>


		<form method="post" action="MessageInfo">


		<input type="hidden" name="id" value="${detailQuestion.id}">


		<div class="form-group">
			    <label for="exampleFormControlTextarea1">相談内容</label>
			    <textarea name="reply" class="form-control" id="exampleFormControlTextarea1" ></textarea>
			  </div>

			  <div class="button_center">
						<button class="btn btn-primary" type="submit">返信</button><br> <br>
					</div>

		</form>

	</div>
</body>
</html>