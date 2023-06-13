<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>C²A | LOGIN</title>
	<!-- スタイルシートの挿入 -->
	<link rel="stylesheet" href="/login/css/style.css">
</head>
<body>
	<!-- ログイン画面 -->
	<!-- ロゴと天気が入る -->

	<div class="loginpage">
		<h1>LOGIN</h1>
		<form id="login_form" method="post" action="/TRex/LoginServlet">
			USER_ID<input type="text" name="ID"><br>
			PASSWORD<input type="password" name="PW"><br>
			<input type="submit" name="LOGIN" value="LOGIN">
			<span id="error_massage"></span><br>
			<p>パスワードを忘れた方はこちら<br>
			<p>新規登録は<a href="MypageNewServlet.java">こちら</a>
		</form>
	</div>
	<!-- [ログイン]ボタンを押したとき -->

	var formObj = document.getElementById('login_form');
	ver errorMessageObj = document.getElementById('error_massage');
	formObj.onsubmit = function() {
		if(!formObj.ID.value || !formObj.PW.value) {
			errorMassageObj.textContent = 'IDとパスワードを入力してください';
			return false;
		}
		errorMassageObj.textContent = null;
	}

</body>
</html>