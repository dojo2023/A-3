<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel="stylesheet" href="/TRex/css/hamburger.css">
</head>
<header>
	<h1>C²A</h1>
	<h2>MY PAGE CALENDER</h2>
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
	<div class="wrapper">
	    <!-- xxxx年xx月を表示 -->
	    <h1 id="header"></h1>

	    <!-- ボタンクリックで月移動 -->
	    <div id="next-prev-button">
	        <button id="prev" onclick="prev()">‹</button>
	        <button id="next" onclick="next()">›</button>
	    </div>

	    <!-- カレンダー -->
	    <div id="calendar"></div>
	</div>

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>