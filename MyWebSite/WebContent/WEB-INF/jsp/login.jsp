<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザーログイン画面</title>

<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
<script src="js/bootstrap.min.js"></script>
</head>

<body background="picture/p0526_m.jpg">


	<div class="container">

		<br>

		<h2 class="text-center text">ユーザーログイン画面</h2>
		<br>

		<c:if test="${errMsg != null}">
			<div class="alert alert-danger text-center" role="alert">${errMsg}</div>

		</c:if>


		<form  action="Login" method="post">

		<input type="hidden" name="userType" value="1">

		<div class="button_right">
			<a class="btn btn-success" href="Regist">ユーザー新規登録</a><br> <br>
		</div>


			<div class="form-group">
				<label for="formGroupExampleInput"></label>
				 <input type="text"	name=loginId class="form-control text-center"  id="formGroupExampleInput" placeholder="ログインID">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2"></label> <input
					type="password" name=password class="form-control text-center" id="formGroupExampleInput2"
					placeholder="パスワード">
			</div>

		<br>
		<div class="button_center">
			<button class="btn btn-primary btn-block" type="submit">ログイン</button>
		</div>
		</form>

		<br><br>
		<div class="button_right">
			<a class="btn btn-danger" href="MentorLogin">メンターログイン画面へ</a><br> <br>
		</div>

	</div>
</body>
</html>