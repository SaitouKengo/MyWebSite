<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>メッセージ一覧</title>
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

		<h2 class="text-center">相談一覧</h2>

		<br><br>
		<div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>相談者</th>
						<th>件名</th>
						<th>投稿日時</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="question" items="${messageList}" >

					<tr>
					<c:if test="${userInfo.id == question.mentorId}">
						<td>${question.userId}</td>
						<td>${question.subject}</td>
						<td>${question.questionDate}</td>
						<td> <a class="btn btn-primary" href="MessageInfo?id=${question.id}">詳細</a></td>
					</c:if>
					</tr>

				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>