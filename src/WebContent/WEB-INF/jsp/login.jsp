<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>C²A | LOGIN</title>
	<!-- スタイルシートの挿入 -->
	<link rel="stylesheet" href="/login/css/style.css">
	<link rel="stylesheet" href="/TRex/css/hamburger.css">
</head>
<header>
	<!-- 天気、サイトロゴ、ハンバーガーメニュー -->
	<h1>LOGIN</h1>
	<!-- ハンバーガーメニュー -->
	<button type="button" class="menu-btn">
    <i class="fa fa-bars" aria-hidden="true"></i>
    </button>
    <div class="menu">
      <div class="menu__item">MY PAGE</div>
      <div class="menu__item">TOP PAGE</div>
      <div class="menu__item">SEARCH</div>
      <div class="menu__item">LIST</div>
      <div class="menu__item">REGISTER</div>
      <div class="menu__item">LOGOUT</div>
    </div>
</header>
<body>

	<div class="loginpage">
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
			errorMassageObj.textContent = 'IDとパスワードが一致しません。';
			return false;
		}
		errorMassageObj.textContent = null;
	}

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>