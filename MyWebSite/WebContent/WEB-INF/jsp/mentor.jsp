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

		<br>
		<div align="center">
		<img src="${detailUser.picture}"width="180" height="200">
		</div>

		 <br>
		<div align="center">
        ${detailUser.profile}
		</div>

		 <br><br>

		<form method="post" action="Mentor">

		<input type="hidden" name="userId" value="${userInfo.id}">

		<input type="hidden" name="mentorId" value="${detailUser.id}">

			  <div class="form-group">
			    <label for="exampleFormControlInput1">件名</label>
			    <input type="text" name="subject" class="form-control" id="exampleFormControlInput1" placeholder="">
			  </div>

			  <div class="form-group">
			    <label for="exampleFormControlTextarea1">相談内容</label>
			    <textarea name="question" class="form-control" id="exampleFormControlTextarea1" ></textarea>
			  </div>
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