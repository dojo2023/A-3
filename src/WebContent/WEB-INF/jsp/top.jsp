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
<h1>今週のトレンド</h1>

<div class="box">
  <!-- 枠とスライドが入ります -->
</div>

  </div>
<input type="button" value="今日のコーデ一覧はこちら" href='/TRex/ListServlet.java'>
</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>