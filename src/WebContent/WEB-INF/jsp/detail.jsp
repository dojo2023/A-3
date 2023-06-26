<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel ="stylesheet" href="/TRex/css/list.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">



</head>

<header>
<div class="container">
<!-- 天気　ロゴ　ハンバーガーメニュー -->
<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>Ditail</h1>
	<h2>C²A</h2>
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


	 <c:forEach var="e" items="${list}" >
	 	<div class="detailblock">
		 	<div class="detailphoto">
			<img src="/TRex/UploadPhoto/${e.img}" id="gazo">
			</div>
			<div class="detailinfo">
			<table border=1>
				<tr>
					<th>GENDER</th>
					<th>${e.gender}</th>
				</tr>
				<tr>
					<th>ITEM</th>
					<th>${e.clothes}</th>
				</tr>
				<tr>
					<th>OUTER</th>
					<th>${e.subOuter}</th>
				</tr>
				<tr>
					<th>TOPS</th>
					<th>${e.subTops}</th>
				</tr>
				<tr>
					<th>BOTTOMS</th>
					<th>${e.subBottoms}</th>
				</tr>
				<tr>
					<th>DRESS</th>
					<th>${e.subDress}</th>
				</tr>
				<tr>
					<th>SHOES</th>
					<th>${e.subShoes}</th>
				</tr>
				<tr>
					<th>ACCESSORY</th>
					<th>${e.subAcce}</th>
				</tr>
				<tr>
					<th>TAG</th>
					<th>${e.tag}</th>
				</tr>

			</table>
			</div>
		</div>
	 </c:forEach>


</body>
<script>

</script>
</html>