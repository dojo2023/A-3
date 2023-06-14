<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
</head>
<header>
	<h1>C²A</h1>
	<h2>MY PAGE CALENDER</h2>
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
</html>