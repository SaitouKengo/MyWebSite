<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>相談履歴詳細</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">

	<jsp:include page="/baselayout/header2.jsp" />

	<div class="container">
		<br>

		<h2 class="text-center">相談詳細</h2>

		<br><br>

		<div class="alert alert-info text-center " role="alert">
			<h5 class="alert-heading">相談者: ${detailQuestion.mentorName}</h5>
			<hr>
			<p>相談日時: <fmt:parseDate  var="questionDate" value="${detailQuestion.questionDate}" pattern="yyyy-MM-dd HH:mm:ss.SSS" />
              <fmt:formatDate value="${questionDate}" pattern="yyyy年MM月dd日HH時mm分" /></p>

			<p>件名: ${detailQuestion.userName}</p>
			<hr>
			<p class="mb-0" >
				相談内容:<br><br> ${detailQuestion.question}
			</p>
		</div>
		<br><br>

		<div class="alert alert-success text-center" role="alert">
			<h5 class="alert-heading">返信者: ${detailQuestion.subject}</h5>
			<hr>
			<p>返信日時: <fmt:parseDate  var="replyDate" value="${detailQuestion.replyDate}" pattern="yyyy-MM-dd HH:mm:ss.SSS" />
              <fmt:formatDate value="${replyDate}" pattern="yyyy年MM月dd日HH時mm分" /> </p>

			<p>件名: ${detailQuestion.userName}</p>
			<hr>
			<p class="mb-0">
				返信内容:<br><br> ${detailQuestion.reply}
			</p>
		</div>
		<br><br>


		<form method="post" action="MessageInfo">


		<input type="hidden" name="id" value="${detailQuestion.id}">


		<div class="form-group text-center">
			    <label for="exampleFormControlTextarea1">返信内容</label>
			    <textarea name="reply" class="form-control" id="exampleFormControlTextarea1" ></textarea>
			  </div>

			  <div class="button_center">
						<button class="btn btn-primary" type="submit">返信</button><br> <br>
					</div>

		</form>

	</div>
</body>
</html>