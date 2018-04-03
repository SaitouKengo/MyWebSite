<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンター情報確認画面</title>
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


		<h2 class="text-center">メンター情報確認画面</h2>

		<br><img src="${detailMentor.picture}"width="180" height="200">

		 <br>${detailMentor.profile}<br>


		 <div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>メンター名</th>
						<th>ログインID</th>
						<th>生年月日</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${userInfo.name}</td>
						<td>${userInfo.loginId}</td>
						<td>${detailMentor.birth_date} </td>
						<td><a class="btn btn-primary" href="MentorSub2">情報更新</a>

					</tr>


				</tbody>
			</table>
		</div>




		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="MessageList">戻る</a></li>

		</ul>

	</div>


</body>
</html>