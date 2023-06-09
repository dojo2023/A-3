<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>

<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
<link rel ="stylesheet" href="/TRex/css/list.css">
<!--  <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/>
 <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
 <script>
    jQuery(function($){
    	 // デフォルトの設定を変更（日本語化）--------------------
        $.extend( $.fn.dataTable.defaults, {
            language: {
                url: "http://cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Japanese.json"
            }
        });
    	 //------------------------------------------------
    	//データテーブルを使用
        $("#foo-table").DataTable();
    });
 </script>
 -->



</head>
<header id="top-header">
      <!-- 天気 -->
 <div id="ww_77e87b2ff5d3f" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Arial","sl_ics":"one","sl_sot":"celsius","cl_bkg":"#FFFFFF00","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_77e87b2ff5d3f_u" target="_blank">東京天気14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_77e87b2ff5d3f"></script>
    <h1>LIST</h1>
     <img alt="" src="./img/logo10.png"style="width: 200px; height: 100px; margin: 0 auto 0 auto;">

	<!-- ハンバーガーメニュー -->
	<button type="button" class="menu-btn">
    <i class="fa fa-bars" aria-hidden="true"></i>
    </button>
    <div class="menu">
      <div class="menu__item"><a href="/TRex/MypageServlet">MY PAGE</a></div>
      <div class="menu__item"><a href="/TRex/TopServlet">TOP PAGE</a></div>
      <div class="menu__item"><a href="/TRex/SearchServlet">SEARCH</a></div>
      <div class="menu__item"><a href="/TRex/ListServlet">LIST</a></div>
      <div class="menu__item"><a href="/TRex/RegisterServlet">REGISTER</a></div>
      <div class="menu__item"><a href="/TRex/LoginServlet">LOGOUT</a></div>
    </div>

</header>


<body>
<div class ="test">
	<c:forEach var="e" items="${list}" >
	 	<div class="linkAreaa">
			<a href="DetailServlet?key=${e.id}" target="_blank" >
				<img src="/TRex/UploadPhoto/${e.img}" id="gazo" style="width: 200px; height: 200px;">
			</a>
		</div>
	 </c:forEach>
</div>


</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
</html>