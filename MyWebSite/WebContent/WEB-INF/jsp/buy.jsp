<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>購入確認</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">

<jsp:include page="/baselayout/header.jsp" />

	<div class="container">
		<br>

		<h2 class="text-center">書籍購入完了</h2>

		<br>

		<div class="alert alert-info" role="alert">
			<h5 class="alert-heading   text-center">書籍の購入が完了しました。</h5>

		</div>

		<br><br>
		<div class="table-responsive text-center">
			<table class="table table-striped table-bordered"
				class="table table-bordered">
				<thead>
					<tr>
						<th>著者</th>
						<th>書籍名</th>
						<th>価格</th>
						<th>冊数</th>

					</tr>
				</thead>

				<tbody>

					<tr>
						<td>山田太郎</td>
						<td>父ちゃんごめん</td>
						<td>1200円 </td>
						<td>1</td>

					</tr>




				</tbody>

			</table>
		</div>

		<br>

		<div class="button_center">
			 <a class="btn btn-primary" href="UserList">TOP画面へ</a><br><br>
		</div>

</div>

</body>
</html>