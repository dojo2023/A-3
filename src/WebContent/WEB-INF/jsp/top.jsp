<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel ="stylesheet" href="/TRex/css/top.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">


</head>
    <header id="top-header">
      <!-- 天気 -->
 <div id="ww_77e87b2ff5d3f" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Arial","sl_ics":"one","sl_sot":"celsius","cl_bkg":"#FFFFFF00","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_77e87b2ff5d3f_u" target="_blank">東京天気14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_77e87b2ff5d3f"></script>
    <h1>TOP</h1>
    <h2> <img alt="" src="./img/logo9.png"style="width: 100px; height: 100px;"></h2>
     <!-- ハンバーガーメニュー -->
	 <button type="button" class="menu-btn">
     <i class="fa fa-bars" aria-hidden="true"></i>
    </button>
    <div class="menu">
     <div class="menu__item"><a href="/TRex/MypageServlet">MY PAGE</a></div>
      <div class="menu__item"><a href="/TRex/TopServlet">TOP PAGE</div>
      <div class="menu__item"><a href="/TRex/SearchServlet">SEARCH</div>
      <div class="menu__item"><a href="/TRex/ListServlet">LIST</div>
      <div class="menu__item"><a href="/TRex/RegisterServlet">REGISTER</a></div>
      <div class="menu__item">LOGOUT</div>
      <div class="hamburger-demo-cover"></div>
    </div>
    <hr>
    </header>


<body>
<!--  <h3>今週のトレンド</h3>  -->


  <!-- 枠とスライドが入ります -->
  <!--スライドショー-->
 <div class="box29">
  <div class="box-title">今週のトレンド</div>
    <div id = "area" class="wrap slide-paused" ontouchstart="">
<ul class="slideshow" id="images">
    <li class="content content-hover"><img src="./img/メンズ春1.jpg"></li>
    <li class="content content-hover"><img src="./img/メンズ夏1.jpg"></li>
    <li class="content content-hover"><img src="./img/メンズ秋1.jpg"></li>
    <li class="content content-hover"><img src="./img/メンズ冬1.jpg"></li>
</ul>
</div>
</div>

<div style="display: flex; justify-content: center;">
<input type="button" class="button-036" value="みんなのコーデ一覧はこちら" href='/TRex/ListServlet.java'>
</div>
<form action="/TRex/TopServlet" method="post" enctype="multipart/form-data">
		画像:<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);"><br>
		<canvas id="preview" style="max-width:100px;"></canvas><br>
		<input type="submit" value="送信">
		<%--<img src="./UploadPhoto/メンズ夏1.jpg"> --%>

<%--<img src="${'/TRex/UploadPhoto/'+=image}" id="gazo"> --%>
</form>
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

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>

</html>