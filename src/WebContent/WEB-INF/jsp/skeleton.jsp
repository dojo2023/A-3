<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>C²A | skeleton</title>
	<!-- スタイルシートの挿入 -->
	<link rel="stylesheet" href="/skeleton/css/style.css">
</head>
<header>
	<!-- 天気、サイトロゴ、ハンバーガーメニュー -->
	<h1>骨格診断</h1>
</header>
<body>
	<!-- 骨格診断と結果 -->
	<p id="contents-qa">骨格診断</p>
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
			<ul class="q-choice">
				<li><a class="qa_btn" href="q_04">YES</a></li>
				<li><a class="qa_btn" href="q_05">NO</a></li>
			</ul>
		</div>

		<!-- 質問３（質問１がnoのとき） -->
		<div id="q_03" style="display: none;">
			<p>横から見て、お尻に丸みがなく平だと思う</p>
			<ul class="q-choice">
				<li><a class="qa_btn" href="q_06">YES</a></li>
				<li><a class="qa_btn" href="q_07">NO</a></li>
			</ul>
		</div>

		<!-- 質問４（質問２がyesのとき） -->
		<div id="q_04" style="display: none;">
			<p>首が長いと言われることがある</p>
			<ul class="q-choice">
				<li><a class="qa_btn" href="q_08">YES</a></li>
				<li><a class="qa_btn" href="q_09">NO</a></li>
			</ul>
		</div>

		<!-- 質問５（質問３がnoのとき） -->
		<div id="q_5" style="display: none;">
			<p>手の爪が小さい</p>
			<ul class="q-choice">
				<li><a class="qa_btn" href="q_10">YES</a></li>
				<li><a class="qa_btn" href="q_11">NO</a></li>
			</ul>
		</div>

		<!-- 質問６（質問３と４がnoのとき） -->
		<div id="q_6" style="display: none;">
			<p>指の関節が大きく、第二関節を通過する指輪は根本で回ってしまう</p>
			<ul class="q-choice">
				<li><a class="qa_btn" href="q_12">YES</a></li>
				<li><a class="qa_btn" href="q_13">NO</a></li>
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

</body>
</html>