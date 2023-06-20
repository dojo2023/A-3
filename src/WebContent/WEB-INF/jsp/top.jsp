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


  <!-- 枠とスライドが入ります -->
  <!--スライドショー-->
    <div id = "area" class="wrap slide-paused" ontouchstart="">
<ul class="slideshow" id="images">
    <li class="content content-hover"><img src="${'/TRex/UploadPhoto/'+=image}" id="gazo"></li>
    <li class="content content-hover"></li>
    <li class="content content-hover"></li>
    <li class="content content-hover"></li>
</ul>


</div>


<input type="button" value="今日のコーデ一覧はこちら" href='/TRex/ListServlet.java'>
<form action="/TRex/TopServlet" method="post" enctype="multipart/form-data">
		画像:<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);"><br>
		<canvas id="preview" style="max-width:100px;"></canvas><br>
		<input type="submit" value="送信">
		<img src="./UploadPhoto/メンズ夏1.jpg">

<img src="${'/TRex/UploadPhoto/'+=image}" id="gazo">
</form>
</body>
<script>
	function previewImage(obj){

		var fileReader = new FileReader();

		// 読み込み後に実行する処理
		fileReader.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas = document.getElementById('preview');
			var ctx = canvas.getContext('2d');
			var image = new Image();
			image.src = fileReader.result;
			console.log(fileReader.result) // ← (確認用)

			image.onload = (function () {
				canvas.width = image.width;
				canvas.height = image.height;
				ctx.drawImage(image, 0, 0);
			});
		});
		// 画像読み込み
		fileReader.readAsDataURL(obj.files[0]);
		console.log(fileReader.result) // ← (確認用)null
	}
</script>
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