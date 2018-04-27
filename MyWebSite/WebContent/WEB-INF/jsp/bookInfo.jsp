<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍詳細</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">

	<jsp:include page="/baselayout/header.jsp" />

	<div class="container">
		<br>

		<h2 class="text-center">書籍詳細</h2>

		<br>
		<br>

		<form  action="BookInfo" method="post">


		<div class="alert alert-success text-center" role="alert">
			<h5 class="alert-heading">書籍名: ${detailBooks.book_name}</h5>
			<hr>
			<p>著者: ${detailBooks.author}</p>

			<p>価格: ${detailBooks.price}円</p>
			<hr>
			<p class="mb-0">
				内容:<br><br> ${detailBooks.book_info}</p>
				<br>

				<button class="btn btn-success" type="submit">カートに追加</button>

		</div>

		</form>
		<br>

		<br>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="Books">戻る</a></li>

		</ul>

		</div>
</body>
</html>