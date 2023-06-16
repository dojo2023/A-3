<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/mypage_calendar.css">
</head>
<header>
<div class="container">
 <!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>MY PAGE CALENDER</h1>
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
<input type="button" onclick="window.history.back();" value=MYPAGEに戻る>
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
     /* ハンバーガーメニュー */
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});

     /* カレンダー */
		const week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
		const today = new Date();
		// 月末だとずれる可能性があるため、1日固定で取得
		var showDate = new Date(today.getFullYear(), today.getMonth(), 1);

		// 初期表示
		window.onload = function () {
		    showProcess(today, calendar);
		};
		// 前の月表示
		function prev(){
		    showDate.setMonth(showDate.getMonth() - 1);
		    showProcess(showDate);
		}

		// 次の月表示
		function next(){
		    showDate.setMonth(showDate.getMonth() + 1);
		    showProcess(showDate);
		}

		// カレンダー表示
		function showProcess(date) {
		    var year = date.getFullYear();
		    var month = date.getMonth();
		    document.querySelector('#header').innerHTML = year + "年 " + (month + 1) + "月";

		    var calendar = createProcess(year, month);
		    document.querySelector('#calendar').innerHTML = calendar;
		}

		// カレンダー作成
		function createProcess(year, month) {
		    // 曜日
		    var calendar = "<table><tr class='dayOfWeek'>";
		    for (var i = 0; i < week.length; i++) {
		        calendar += "<th>" + week[i] + "</th>";
		    }
		    calendar += "</tr>";

		    var count = 0;
		    var startDayOfWeek = new Date(year, month, 1).getDay();
		    var endDate = new Date(year, month + 1, 0).getDate();
		    var lastMonthEndDate = new Date(year, month, 0).getDate();
		    var row = Math.ceil((startDayOfWeek + endDate) / week.length);

		    // 1行ずつ設定
		    for (var i = 0; i < row; i++) {
		        calendar += "<tr>";
		        // 1colum単位で設定
		        for (var j = 0; j < week.length; j++) {
		            if (i == 0 && j < startDayOfWeek) {
		                // 1行目で1日まで先月の日付を設定
		                calendar += "<td class='disabled'>" + (lastMonthEndDate - startDayOfWeek + j + 1) + "</td>";
		            } else if (count >= endDate) {
		                // 最終行で最終日以降、翌月の日付を設定
		                count++;
		                calendar += "<td class='disabled'>" + (count - endDate) + "</td>";
		            } else {
		                // 当月の日付を曜日に照らし合わせて設定
		                count++;
		                if(year == today.getFullYear()
		                  && month == (today.getMonth())
		                  && count == today.getDate()){
		                    calendar += "<td class='today'>" + count + "</td>";
		                } else {
							//表示したい項目がある場合は、ここでリンクを設定する
		                    calendar += "<td>" + count + "<br>"
								+"<a href=''class='image-link'><img src='/TRex/img/hanger1.png' alt='Image' style='width: 50px; height: 50px;'></a>"
		                    +"</td>";

		                }
		            }
		        }
		        calendar += "</tr>";
		    }
		    return calendar;
		}


</script>
</html>