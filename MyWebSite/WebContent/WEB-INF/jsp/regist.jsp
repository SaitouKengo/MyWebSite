<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
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




		<h2 class="text-center">新規登録</h2>

		<form>

			<div class="form-group">
				<label for="formGroupExampleInput2">名前</label> <input type="text"
					class="form-control" id="formGroupExampleInput" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">住所</label> <input type="text"
					class="form-control" id="formGroupExampleInput2" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">ログインID</label> <input type="text"
					class="form-control" id="formGroupExampleInput3" placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード</label> <input
					type="password" class="form-control" id="formGroupExampleInput4"
					placeholder="">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">パスワード（確認）</label> <input
					type="password" class="form-control" id="formGroupExampleInput5"
					placeholder="">
			</div>

		</form>

		<br>
		<div class="button_center">
			<a class="btn btn-primary" href="registconfirm.html">登録</a>
		</div>

		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="userList.html">戻る</a></li>



		</ul>

	</div>

</body>
</html>