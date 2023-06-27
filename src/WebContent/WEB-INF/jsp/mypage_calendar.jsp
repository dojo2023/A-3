<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.google.gson.Gson"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
<link rel="stylesheet" href="/TRex/css/common.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/mypage_calendar.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<style>
		/* 予定のある日の枠の色 */
		.highlight {
		  background-color: red;
		}

		/* 表示箇所を真ん中にするCSS */
		.ui-datepicker {
			margin-left:5%;
			width: 500px;
			height: 400px;
            font-size: 29px;
            font-family: Times ;
		}
	</style>
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
<input type="button" class="button-004" onclick="window.history.back();" value=MYPAGEに戻る>

    <div id="app">
    <div id="datepicker"></div>

</div>
	<!--  <div class="wrapper">
	    <!-- xxxx年xx月を表示 -->
	    <!--  <h1 id="header"></h1>

	    <!-- ボタンクリックで月移動 -->
	    <!--  <div id="next-prev-button">
	        <button id="prev" onclick="prev()">‹</button>
	        <button id="next" onclick="next()">›</button>
	    </div>

	    <!-- カレンダー -->
	    <!--  -<div id="calendar"></div>
	</div>
list = <%= new Gson().toJson(request.getAttribute("list"))%>;
	alert(list[0].insert_date);
  -->
</body>
<script>
     /* ハンバーガーメニュー */
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});


	 //日付を擬似的に作成する（テストの為）
/*     var dates = [];
    dates.push(new Date("2023-06-10"));
    dates.push(new Date("2023-06-10"));
    dates.push(new Date("2023-06-15"));
    dates.push(new Date("2023-06-24")); */
	list = <%= new Gson().toJson(request.getAttribute("list"))%>;



	//読み込まれた際に実行する
    $(document).ready(function() {
   	 //idがdatepickerのところに表示する
   	  $("#datepicker").datepicker({
   		//カレンダーに赤枠を表示するメソッド----------------------
   	    beforeShowDay: function(date) {
   	    //ループで配列に格納された日付のところを赤色にする
   	      for (var i = 0; i < list.length; i++) {
   	    	//ひとつ取り出す
   	        var targetDate = list[i].insert_date;

   	    	//上記のデータを分割
			var tSprit = targetDate.split(" ");
  			var yy = tSprit[2];
   	    	var mm = tSprit[0].replace("月","");
   	    	var dd = tSprit[1].replace(",","");
				//もし合致するデータがあったら


   	        if (
   	          date.getFullYear() == yy &&
   	          date.getMonth()+1 == mm &&
   	          date.getDate() == dd
   	        ) {
   	          //色を変える

   	          return [true, "highlight", "Custom text"];
   	        }
   	      }
			  //なんやろかよくわからん
   	      return [true, "", ""];
   	    },

	        //各dayをクリックした際に処理されるメソッド--------------------
	        onSelect: function(dateText, inst) {
	        	//クリックするたび、表示されたボックスを削除する
	        	 // .aaaクラスの要素を取得
	        	  var aaaElements = document.getElementsByClassName("show");
	        	  // 要素が存在する場合にのみ削除処理を実行
	        	  if (aaaElements.length > 0) {
	        		  //作業途中のボックスのための確認ダイアログ
	        		  if (confirm("開いているボックスがあります。閉じてもよろしいですか？")) {
	        			  //消す
	        			  while (aaaElements.length > 0) {
	    	        	      aaaElements[0].remove();
	    	        	  }
	        		  }else {
	        			 	return false;
	        		  }
	        	  }
	            // 押した日付を年、月、日で取得する
	            var ans = dateText.split("/");
	            var year = ans[2];
	            var month = ans[0];
	            var day = ans[1];

	            //合致しないフラグ
	            var flg=0;

	            //HTMLの作成
	            for (var i = 0; i < list.length; i++) {
	            	var targetDate = list[i].insert_date;
	            	//上記のデータを分割
	    			var tSprit = targetDate.split(" ");
	      			var yy = tSprit[2];
	       	    	var mm = tSprit[0].replace("月","");
	       	    	var dd = tSprit[1].replace(",","");
	    				//もし合致するデータがあったら

	    			if(mm.length==1){
	    				mm="0"+mm;
	    			}

	       	        if (
	       	          year == yy &&
	       	          month == mm &&
	       	          day == dd
	          	        ) {

	       	      // div要素を作成
	       	        	var div = document.createElement("div");
	       	        	div.className = "show";
	       	        	// table要素を作成
	       	        	var table = document.createElement("table");
	       	        	table.setAttribute("border", "1");
	       	        	// テーブルのデータを直接指定
	       	        	var tableData = [
	       	        	  ["画像", "/TRex/UploadPhoto/"+list[0].img], // 画像のパスを含む
	       	        	  ["ITEM", ,list[0].clothes],
	       	        	  ["GENDER", list[0].gender],
	       	        	  ["OUTER", list[0].subOuter],
	       	        	  ["TOPS", list[0].subTops],
	       	        	  ["BOTTOMS", list[0].subBottoms],
	       	        	  ["DRESS", list[0].subDress],
	       	        	  ["SHOES", list[0].subShoes],
	       	        	  ["ACCESSORY",list[0].subAcce],
	       	        	  ["TAG", list[0].tag]
	       	        	];
	       	        	// テーブルの行を作成してデータをセット
	       	        	for (var i = 0; i < tableData.length; i++) {
	       	        	  var row = document.createElement("tr");
	       	        	 row.style.backgroundColor = "white"; // 行の背景色を白に設定
	       	        	  var cell1 = document.createElement("td");
	       	        	  var cell2 = document.createElement("td");
	       	        	  cell1.textContent = tableData[i][0];
	       	        	  // 画像の行の場合、img要素を作成してsrc属性に画像のパスを指定
	       	        	  if (tableData[i][0] === "画像") {
	       	        	    var img = document.createElement("img");
	       	        	    img.src = tableData[i][1]; // 画像のパスをセット
	       	        	    cell2.appendChild(img);
	       	        	  } else {
	       	        	    cell2.textContent = tableData[i][1];
	       	        	  }
	       	        	  row.appendChild(cell1);
	       	        	  row.appendChild(cell2);
	       	        	  table.appendChild(row);
	       	        	}
	       	        	// div要素にtable要素を追加
	       	        	div.appendChild(table);
	       	        	// body要素にdiv要素を追加
	       	        	document.body.appendChild(div);
	    	            flg++;
	          		 }
				 }
	            //HTMLの作成：合致するものが無かったら空の要素を作成する
	         	if(flg==0){
			  		// 要素の作成
	   	            const divElement = document.createElement('div');
	   	            divElement.classList.add('aaa');

	   	            const formElement = document.createElement('form');
	   	            formElement.action = '飛び先';
	   	            formElement.method = 'post';

	   	            const inputElement = document.createElement('input');
	   	            inputElement.type = 'text';
	   	            inputElement.name = 'date';
	   	         	//合致しなかったのでデータを入れなかった場所
	   	            inputElement.value ='';

	   	            const submitElement = document.createElement('input');
	   	            submitElement.type = 'submit';
	   	            submitElement.value = 'クリック';

	   	            formElement.appendChild(inputElement);
	   	            formElement.appendChild(submitElement);

	   	            divElement.appendChild(formElement);

	   	            const bodyElement = document.querySelector('body');
	   	            bodyElement.appendChild(divElement);
			  	}
	         }
       });
   });
 </script>
</html>