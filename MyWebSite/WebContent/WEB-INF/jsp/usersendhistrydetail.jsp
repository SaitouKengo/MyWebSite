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
			href="UserList">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="UserData?id=${userInfo.id}">${userInfo.name}さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="MentorLogin">メンター用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="Logout">ログアウト</a></li>
	</ul>
	<div class="container">
		<br>

		<h2 class="text-center">相談履歴</h2>

		<br>

		<div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>メンター名</th>
						<th>件名</th>
						<th>相談日時</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="question" items="${messageList}" >
					<c:if test="${userInfo.id == question.userId}">
					<tr>
						<td>${question.mentorName}</td>
						<td>${question.subject}</td>
						<td><fmt:parseDate  var="questionDate" value="${question.questionDate}" pattern="yyyy-MM-dd HH:mm:ss.SSS" />
              <fmt:formatDate value="${questionDate}" pattern="yyyy年MM月dd日HH時mm分" /></td>
						<td><a class="btn btn-primary" href="UserMessageInfo?id=${question.id}">詳細</a>
					</tr>
					</c:if>

				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>