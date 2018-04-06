<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録完了</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>

<body background="picture/p0526_m.jpg">
   <ul class="navbar justify-content bg-dark">
	    <li class="nav"><a class="nav-link active"
			href="userList.html">TOP画面へ</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="userdata.html">ユーザ名さん</a></li>
		<li class="nav justify-content-end"><a class="nav-link active"
			href="mentorLogin.html">メンター用ページ</a></li>
		<li class="nav justify-content-end"><a class="nav-link disabled"
			href="logout.html">ログアウト</a></li>
	</ul>
	<div class="container">
		<br>

		<h2 class="text-center">登録完了</h2>





		<br><br>ログインID: ${userList.loginId}
		<br><br>名前: ${userList.userName}
		<br><br>生年月日: ${userList.birthDate}
		<br><br>パスワード: ${userList.password}
		<br><br>自己紹介: ${userList.profile}

		<br><br><br> 上記内容で登録しました。
		<div class="button_center">
			<a class="btn btn-primary" href="login.html">ログイン画面へ</a>
		</div>

	</div>
</body>
</html>