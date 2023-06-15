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
	<link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
</head>
<header>
	<!-- 天気、サイトロゴ、ハンバーガーメニュー -->
	<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
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
			PASSWORD<!-- <input type="password" name="PW"><br> -->
			<span id="fieldPassword">
	    	<input type="password" id="textPassword" name="password" placeholder="PASSWORD">
			</span>
		 	<span id="buttonEye" class="fa fa-eye" onclick="pushHideButton()"></span><br>
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
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
<!-- マスク用 -->
<script src="/TRex/js/mask.js"></script>
</html>