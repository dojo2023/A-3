<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel ="stylesheet" href="/TRex/css/search.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel="stylesheet" href="/TRex/css/common.css">
</head>
<!-- 天気 -->
<header id="top-header">
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>SEARCH</h1>
	<img alt="" src="./img/logo10.png"style="width: 200px; height: 100px; margin: 0 0 0 auto;">
	<!-- ハンバーガーメニュー -->
	<button type="button" class="menu-btn">
    <i class="fa fa-bars" aria-hidden="true"></i>
    </button>
    <div class="menu">
      <div class="menu__item"><a href="/TRex/MypageServlet">MY PAGE</a></div>
      <div class="menu__item"><a href="/TRex/TopServlet">TOP PAGE</a></div>
      <div class="menu__item"><a href="/TRex/ListServlet">LIST</a></div>
      <div class="menu__item"><a href="/TRex/RegisterServlet">REGISTER</a></div>
      <div class="menu__item"><a href="/TRex/LoginServlet">LOGOUT</a></div>
    </div>
	<hr>
</header>
<body>
	<div class="waraper">
	<form method = "POST" action = "/TRex/SearchServlet">
		<div>
		<br><b><label>GENDER</label></b><br>
		<label><input type="radio" name="gender" value="men"checked>MEN</label>
		<label><input type="radio" name="gender" value="woman">WOMAN</label>
		<label><input type="radio" name="gender" value="others">OTHERS</label>
		</div>
		<div>
		<br><b><label>ITEM</label></b><br>
		<label><input type="checkbox" name="clothes"value="outer" checked/>outer</label>
		<label><input type="checkbox" name="clothes"value="tops">tops</label>
		<label><input type="checkbox" name="clothes"value="bottoms">bottoms</label>
		<label><input type="checkbox" name="clothes"value="dress">dress</label><br>
		<label><input type="checkbox" name="clothes"value="socks">socks</label>
		<label><input type="checkbox" name="clothes"value="shoes">shoes</label>
		<label><input type="checkbox" name="clothes"value="accessory">accessory</label>
		</div>
		<br><b><label>SUB CATEGORY</label></b>
		<div>
		<b>OUTER&emsp;&emsp;&emsp;&emsp;</b>
		<select name="sub_outer">
			<option value="none">選択してください</option>
			<option value="jacket">ジャケット</option>
			<option value="coat">コート</option>
		</select>
		</div>
		<div>
		<br><b>TOPS&emsp;&emsp;&emsp;&emsp;</b>
		<select name="sub_tops">
			<option value="none">選択してください</option>
			<option value="shirt">シャツ・ブラウス</option>
			<option value="poloshirt">ポロシャツ</option>
			<option value="sweater">セーター</option>
			<option value="vest">ベスト</option>
			<option value="cardigan">カーディガン</option>
		</select>
		</div>
		<div>
		<br><b>BOTTOMS&emsp;&emsp;</b>
		<select name="sub_bottoms">
			<option value="none">選択してください</option>
			<option value="straight">ストレートパンツ</option>
			<option value="slacks">スラックス</option>
			<option value="tarered">テーパードパンツ</option>
			<option value="skinny">スキニーパンツ</option>
			<option value="chino">チノパンツ</option>
			<option value="long">ロングスカート</option>
		</select>
		</div>
		<div>
		<br><b>DRESS&emsp;&emsp;&emsp;&emsp;</b>
		<select name="sub_dress">
			<option value="none">選択してください</option>
			<option value="shirts_dress">シャツワンピース</option>
			<option value="jumper">ジャンパースカート</option>
			<option value="knee">ひざ丈のワンピース</option>
		</select>
		</div>
		<div>
		<br><b>SHOES&emsp;&emsp;&emsp;&emsp;</b>
		<select name="sub_shoes">
			<option value="none">選択してください</option>
			<option value="pumps">パンプス</option>
			<option value="loafers">ローファー</option>
			<option value="sneakers">スニーカー</option>
			<option value="boots">ブーツ</option>
		</select>
		</div>
		<div>
		<br><b>accessory&emsp;&emsp;</b>
		<select name="sub_acce">
			<option value="none">選択してください</option>
			<option value="necklace">ネックレス</option>
			<option value="pierce">ピアス</option>
			<option value="earring">イヤリング</option>
			<option value="belt">ベルト</option>
		</select>
		</div>
		<div>
			<br><b>TAG</b><br>
			<input type = "checkbox" name = "tag" value = "spring">SPRING
				<input type = "checkbox" name = "tag" value = "summer">SUMMER
				<input type = "checkbox" name = "tag" value = "autum">AUTUM
				<input type = "checkbox" name = "tag" value = "winter">WINTER<br>
				<input type = "checkbox" name = "tag" value = "cute">CUTE
				<input type = "checkbox" name = "tag" value = "cool">COOL
				<input type = "checkbox" name = "tag" value = "casual">CASUAL
				<input type = "checkbox" name = "tag" value = "simple">SIMPLE<br>
				<input type = "checkbox" name = "tag" value = "stripe">STRIPE
				<input type = "checkbox" name = "tag" value = "check">CHECK
				<input type = "checkbox" name = "tag" value = "dot">DOT
				<input type = "checkbox" name = "tag" value = "beauty">BEAUTY<br>
				<input type = "checkbox" name = "tag" value = "mode">MODE
				<input type = "checkbox" name = "tag" value = "natural">NATURAL
				<input type = "checkbox" name = "tag" value = "conserva">CONSERVA
				<input type = "checkbox" name = "tag" value = "lowheight">LOWHEIGHT<br>
				<input type = "checkbox" name = "tag" value = "mens">MENS
				<input type = "checkbox" name = "tag" value = "lowprice">LOWPRICE
				<input type = "checkbox" name = "tag" value = "monotone">MONOTONE
				<input type = "checkbox" name = "tag" value = "repeat">REPEAT<br>
				<input type = "checkbox" name = "tag" value = "skewave">SKEWAVE
				<input type = "checkbox" name = "tag" value = "skestraight">SKESTRAIGHT
				<input type = "checkbox" name = "tag" value = "skenatural">SKENATURAL
				<br>
		</div>
		<div>
		<br><input type="submit"name="submit" value="SEARCH"class="button-030">
		</div>
	</form>
	</div>

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
<script>
$(function () {
	  var $header = $("#header");
	  var scrollSize = 800; //超えると表示
	  $(window).on("load scroll", function () {
	    var value = $(this).scrollTop();
	    if (value > scrollSize) {
	      $header.addClass("scroll");
	    } else {
	      $header.removeClass("scroll");
	    }
	  });
	});
</script>
</html>