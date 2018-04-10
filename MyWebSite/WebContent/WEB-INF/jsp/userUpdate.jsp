<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ情報更新</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>
<body background="picture/p0526_m.jpg">

	<jsp:include page="/baselayout/header.jsp" />

	<div class="container">




		<h2 class="text-center">ユーザ情報更新</h2>

		<form method="post" action="UserUpdate">

		<input type="hidden" name="id" value="${userInfo.id}">

			<div class="form-group">
				<label for="formGroupExampleInput">ログインID</label> <input type="text"
					name="loginId" class="form-control" id="formGroupExampleInput" placeholder="${userInfo.loginId}">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">ユーザ名</label> <input type="text"
					name="userName" class="form-control" id="formGroupExampleInput2" placeholder="${userInfo.name}">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" name="pass" class="form-control" id="formGroupExampleInput4"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" name="passConfirm" class="form-control" id="formGroupExampleInput5"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">自己紹介</label> <input type="text"
					name="profile" class="form-control" id="formGroupExampleInput6" placeholder="">
			</div>

		<br>
		<div class="button_center">
			<button class="btn btn-primary" type="submit">更新</button>
		</div>

		</form>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="UserData?id=${userInfo.id}">戻る</a></li>



		</ul>

	</div>

</body>
</html>