<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>お悩み相談サイト</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
<!-- Jqeryの読み込み -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <!-- BootstrapのJS読み込み -->
    <script src="js/bootstrap.min.js"></script>
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


		<h2 class="text-center text">お悩み相談サイト</h2>


		<br><br>
		各メンターの詳細画面から、お悩みを投稿してください。
		<div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>メンターID</th>
						<th>メンター名</th>
						<th>生年月日</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="user" items="${userList}" >
					<tr>


						<td>${user.loginId}</td>
						<td>${user.name}</td>
						<td><fmt:formatDate value="${user.birth_date}" pattern="yyyy年MM月dd日"/></td>
						<td><a class="btn btn-primary" href="Mentor?id=${user.id}">詳細表示</a></td>

					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>

	</div>
</body>
</html>