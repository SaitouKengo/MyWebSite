<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報</title>
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
		<br>

		<h2 class="text-center">ユーザー情報</h2>

		<br>



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
						<td>${userInfo.name}</td>
						<td>${userInfo.loginId}</td>
						<td>1994年11月11日 </td>
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