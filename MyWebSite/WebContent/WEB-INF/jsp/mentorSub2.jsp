<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンタープロフィール更新</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>
<body background="picture/p0526_m.jpg">

	<jsp:include page="/baselayout/header2.jsp" />

	<div class="container">

		<h2 class="text-center">メンタープロフィール更新</h2>

		<form  action="MentorSub2" method="post">

		<input type="hidden" name="id" value="${userInfo.id}">

			<div class="form-group">
				<label for="formGroupExampleInput">ログインID</label> <input type="text"
					class="form-control" name=loginId id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" name=pass class="form-control" id="formGroupExampleInput2"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" name=passConfirm class="form-control" id="formGroupExampleInput3"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">自己紹介</label> <input type="text"
					class="form-control" name=profile id="formGroupExampleInput4" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">プロフ画像</label> <input type="text"
					class="form-control" name=picture id="formGroupExampleInput5" placeholder="">
			</div>



		<br>
		<div class="button_center">
			<button class="btn btn-primary" type="submit">更新</button>
		</div>

		</form>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="MentorData?id=${userInfo.id}">戻る</a></li>

		</ul>

	</div>

</body>
</html>