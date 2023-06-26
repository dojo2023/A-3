<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | マイページ</title>
<link rel ="stylesheet" href="/TRex/css/mypage.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
</head>
<body>
<header>
<div class = "container">
	<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<!-- ヘッダー -->
	<h1>MY PAGE</h1>
	<h2>C²A
	</div>
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
<hr>
</header>
<body>
	<div class="mypageblock">
		<div class="mypagephoto">
		<p>あいこん</p>
			<!-- <img src="" alt="icon"> ここ画像入ります -->
		</div>

		<div class="mypageinfo">
			<table border=1>
			<c:forEach var="e" items="${postList}" varStatus="status">

				<tr>
					<th>USER_ID</th>
					<th>${e.id}</th>

				</tr>
<%-- 				<tr>
					<th>PASSWORD</th>
					<th>${e.pw}</th>
				</tr> --%>
				<tr>
					<th>NAME</th>
					<th>${e.name}</th>
				</tr>
				<tr>
					<th>EMAIL</th>
					<th>${e.email}</th>
				</tr>
				<tr>
					<th>GENDER</th>
					<th>${e.gender}</th>
				</tr>
				<tr>
					<th>ADDRESS</th>
					<th>${e.address}</th>
				</tr>
				<tr>
					<th>BIRTH</th>
					<th>${e.birth}</th>
				</tr>
				<tr>
					<th>HEIGHT</th>
					<th>${e.height}</th>
				<tr>
					<th>WEIGHT</th>
					<th>${e.weight}</th>
				</tr>
				<tr>
					<td colspan="2">
						<form action ="/TRex/MypageEditServlet" method="get" enctype="multipart/form-data" action="UpLoadServlet">
							<input type="hidden" name="id" value="${e.id}">
							<input type="hidden" name="name" value="${e.name}">
							<input type="hidden" name="email" value="${e.email}">
							<input type="hidden" name="gender" value="${e.gender}">
							<input type="hidden" name="address" value="${e.address}">
							<input type="hidden" name="birth" value="${e.birth}">
							<input type="hidden" name="height" value="${e.height}">
							<input type="hidden" name="weight" value="${e.weight}">
							<input type="submit" value="プロフィール編集">
						</form>
					</td>
				</tr>




			</c:forEach>
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
