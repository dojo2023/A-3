<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel ="stylesheet" href="/TRex/css/search_result.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
</head>

<header>
<div class = "container">
<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
<!-- 天気　ロゴ　ハンバーガーメニュー -->
	<h1>SEARCH RESULT</h1>
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
<!--性別アイコン  -->
<!-- RESULT :  WOMAN・TOPS  -->
<input type="button" onclick="window.history.back();" value=SEARCHに戻る>


<!-- ここポップアップ部分
<div class="box">

  服の検索結果が表示されます
  <h2>INFORMATION</h2>
<ul class=info>
<li>OUTER<a href="">(*)</a></li>
<li>TOPS<a href="">(*)</a></li>
<li>BOTTOMS<a href="">(*)</a></li>
<li>SOCKS<a href="">(*)</a></li>
<li>SHOES<a href="">(*)</a></li>
<li>ACCESSORIES<a href="">(*)</a></li>
</ul>
</div>
-->

<!--いいね等の機能  -->

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>