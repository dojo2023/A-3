<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel="stylesheet" href="/TRex/css/good.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<header>
<div class = "container">
<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>GOOD</h1>
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
	<input type="hidden" name="clothesID" value="${clothesID}" id="cl">
 	<label for="myCheckbox">
  <input type="checkbox" id="myCheckbox">
  <span id="checkboxImage"></span>
</label>

	<script>
		var ch = document.getElementById('iine');

		ch.addEventListener("change",function(){
			//チェックが付いたら１、外されたら０になるんやで
			var c = this.checked ? 1:0;
			var id = document.getElementById('cl').value;

			alert("functionはいったよ！");
			//入力値を取得してくる
/* 			let testid = document.getElementById('test_id').value;
			let testclothesID = document.getElementById('test_clothesID').value;
			let testuID = document.getElementById('test_uID').value; */

			//{変数名：中に入れるもの}みたいに書いて、複数の値をpostData変数に格納
			let postData = {check:c,id:id}

			//非同期通信始めるよ
			$.ajaxSetup({scriptCharset:'utf-8'});
			$.ajax({
				//どのサーブレットに送るか
				//ajaxSampleのところは自分のプロジェクト名に変更する必要あり。
				url: '/TRex/GoodServlet',
				//どのメソッドを使用するか
				type:"POST",
				//受け取るデータのタイプ
				dataType:"json",
				//何をサーブレットに飛ばすか（変数を記述）
				data: postData,
				//この下の２行はとりあえず書いてる（書かなくても大丈夫？）
				processDate:false,
				timeStamp: new Date().getTime()
			   //非同期通信が成功したときの処理
			}).done(function(data) {
				alert("成功1");
			// 今回は上の<div id="test"></div>の中に返ってきた文字列を入れる
				document.getElementById("test").innerText=data[0].name;
			  })
			   //非同期通信が失敗したときの処理
			  .fail(function() {
				//失敗とアラートを出す
				alert("失敗！");
			  });
		});
	</script>

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>