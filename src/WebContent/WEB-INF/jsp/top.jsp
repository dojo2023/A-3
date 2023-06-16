<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel ="stylesheet" href="/TRex/css/top.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
</head>


    <header>
    <div class=" ">
      <!-- 天気　ロゴ　ハンバーガーメニュー -->

      <!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
      <hr>

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
<h1>今週のトレンド</h1>

<div class="">
  <!-- 枠とスライドが入ります -->
</div>

  </div>
<input type="button" value="今日のコーデ一覧はこちら" href='/TRex/ListServlet.java'>
</body>


 <script type="text/javascript" src="TRex/mamewaza_weather/mamewaza_weather.min.js"></script>
<script type="text/javascript">
$.mamewaza_weather( {
	selector: "#mamewaza_weather",
	region:"120000",
	layout:"horizontalMini",
	when:"1day"
} );
=======
>>>>>>> Stashed changes
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>