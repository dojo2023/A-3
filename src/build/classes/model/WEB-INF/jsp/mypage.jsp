<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | マイページ</title>
<link rel ="stylesheet" href="/TRex/css/mypage.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
</head>
<body>
	<!-- ヘッダー -->
	<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
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
	<!-- ここに天気持ってくる -->

	<h1>MY PAGE</h1>




	<div class="mypageblock">
		<div class="mypagephoto">
		<p>あいこん</p>
			<!-- <img src="" alt="icon"> ここ画像入ります -->
		</div>
		<div class="mypageinfo">
			<table border=1>
				<tr>
					<th>USER_ID</th>
					<th><input type="text" name="USER_ID"></th>
				</tr>
				<tr>
					<th>PASSWORD</th>
					<th><input type="password" name="PASSWORD"></th>
				</tr>
				<tr>
					<th>NAME</th>
					<th><input type="text" name="NAME"></th>
				</tr>
				<tr>
					<th>EMAIL</th>
					<th><input type="text" name="EMAIL"></th>
				</tr>
				<tr>
					<th>GENDER</th>
					<th><input type="text" name="GENDER"></th>
				</tr>
				<tr>
					<th>HEIGHT</th>
					<th><input type="text" name="HEIGHT"></th>
				<tr>
					<th>WEIGHT</th>
					<th><input type="text" name="WEIGHT"></th>
				</tr>
				<tr>
					<th>SKELETON</th>
					<th><input type="text" name="SKELETON"></th>
				</tr>

			</table>
		</div>
		<nav class="mypagemenu">
			<ul>
				<li><a href="/TRex/GoodServlet">いいね一覧</a></li>
				<li><a href="/TRex/MypageEditServlet">プロフィール編集</a></li>
				<li><a href="/TRex/SkeletonServlet">骨格診断</a></li>
				<li><a href="/TRex/MypageCalendarServlet">服装カレンダー</a></li>
			</ul>
		</nav>

	</div>


</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>