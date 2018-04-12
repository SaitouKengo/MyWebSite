<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート情報</title>
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

		<h2 class="text-center">カート</h2>

		<br>

		<c:if test="${cartMsg != null}">
			<div class="alert alert-primary text-center" role="alert">${cartMsg}</div>

		</c:if>

		<br>


		<div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>著者</th>
						<th>書籍名</th>
						<th>価格</th>
						<th></th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="books" items="${bookList}">
					<tr>
						<td></td>
						<td></td>
						<td>円 </td>

						<td>
						<a ></a>

						 </td>

					</tr>

					</c:forEach>


				</tbody>

			</table>
		</div>


		<div class="button_center">
			 <a class="btn btn-primary" href="#">購入</a><br><br>
		</div>

</div>

</body>
</html>