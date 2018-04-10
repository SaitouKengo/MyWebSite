<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">

	<jsp:include page="/baselayout/header.jsp" />

	<div class="container">
		<br>

		<h2 class="text-center">ユーザー情報</h2>

		 <br>
		 <div align="center">
		 ${detailUser.profile}
		 </div>
		 <br><br>

		<div class="table-responsive">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>ユーザー名</th>
						<th>ログインID</th>
						<th>生年月日</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${detailUser.name}</td>
						<td>${detailUser.loginId}</td>
						<td><fmt:formatDate value="${detailUser.birth_date}" pattern="yyyy年MM月dd日"/></td>
						<td><a class="btn btn-primary" href="UserSub2">情報更新</a>
						<a class="btn btn-success" href="UserBuyHistryDetail">相談履歴</a>

					</tr>


				</tbody>
			</table>
		</div>

		<br>

	</div>
</body>
</html>