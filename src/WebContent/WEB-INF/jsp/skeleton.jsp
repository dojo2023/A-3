<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>C²A | skeleton</title>
	<!-- スタイルシートの挿入 -->
<<<<<<< Updated upstream
	<!--<link rel="stylesheet" href="/skeleton/css/style.css">  -->
=======
	<link rel="stylesheet" href="/skeleton/css/style.css">
	<link rel="stylesheet" href="/TRex/css/hamburger.css">
>>>>>>> Stashed changes
</head>
<header>
<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<!-- 天気、サイトロゴ、ハンバーガーメニュー -->
	<h1>骨格診断</h1>
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
	<!-- 骨格診断と結果 -->
	<p id="contents-qa"></p>
	<div class="shindan">

		<!-- 質問１ -->
		<div id="q_01">
			<p>鎖骨が目立つ</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_02">YES</a></li>
				<li><a class="qa_btn" href="#q_03">NO</a></li>
			</ul>
		</div>

		<!-- 質問２ （質問１がyesのとき）-->
		<div id="q_02" style="display: none;">
			<p>ブラのカップの上がかぽかぽしやすい</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_04">YES</a></li>
				<li><a class="qa_btn" href="#q_05">NO</a></li>
			</ul>
		</div>

		<!-- 質問３（質問１がnoのとき） -->
		<div id="q_03" style="display: none;">
			<p>横から見て、お尻に丸みがなく平だと思う</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_06">YES</a></li>
				<li><a class="qa_btn" href="#q_05">NO</a></li>
			</ul>
		</div>

		<!-- 質問４（質問２がyesのとき） -->
		<div id="q_04" style="display: none;">
			<p>首が長いと言われることがある</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_08">YES</a></li>
				<li><a class="qa_btn" href="#q_09">NO</a></li>
			</ul>
		</div>

		<!-- 質問５（質問３がnoのとき） -->
		<div id="q_05" style="display: none;">
			<p>手の爪が小さい</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_07">YES</a></li>
				<li><a class="qa_btn" href="#q_11">NO</a></li>
			</ul>
		</div>

		<!-- 質問６（質問２と４がnoのとき） -->
		<div id="q_06" style="display: none;">
			<p>指の関節が大きく、第二関節を通過する指輪は根本で回ってしまう</p>
			<ul class="q-choices">
				<li><a class="qa_btn" href="#q_10">YES</a></li>
				<li><a class="qa_btn" href="#q_08">NO</a></li>
			</ul>
		</div>

		<!-- 質問７（質問５がyesのとき） -->
		<div id="q_07" style="display: none;">
			<p>ストレート</p>
			<p><a class="qa_btn" href="#q_01">もう一度診断する</a></p>
		</div>

		<!-- 質問８（質問６がnoのとき） -->
		<div id="q_08" style="display: none;">
			<p>ストレート</p>
			<p><a class="qa_btn" href="#q_01">もう一度診断する</a></p>
		</div>

		<!-- 質問９（質問４がyesのとき） -->
		<div id="q_09" style="display: none;">
			<p>ウェーブ</p>
			<p><a class="qa_btn" href="#q_01">もう一度診断する</a></p>
		</div>

		<!-- 質問１０（質問５がnoのとき） -->
		<div id="q_10" style="display: none;">
			<p>ナチュラル</p>
			<p><a class="qa_btn" href="#q_01">もう一度診断する</a></p>
		</div>

		<!-- 質問１１（質問６がyesのとき） -->
		<div id="q_11" style="display: none;">
			<p>ナチュラル</p>
			<p><a class="qa_btn" href="#q_01">もう一度診断する</a></p>
		</div>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
jQuery.noConflict();
(function($) {
	$(function(){
		$(".qa_btn").on("click", function() {
			$(this).closest("div").css("display","none");
			id = $(this).attr("href");
			$(id).fadeIn("500");
			$("html,body").animate({scrollTop: $("#contents-qa").offset().top}, 'normal','swing');
		});
	});
})(jQuery)
</script>
</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>