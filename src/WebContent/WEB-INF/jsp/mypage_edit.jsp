<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | EDIT MYPAGE</title>
<link rel ="stylesheet" href="/TRex/css/mypage_edit.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
</head>
<header>
<div class = "container">
	<!-- 天気 -->
 <div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>EDIT MYPAGE</h1>
	<h1>C²A</h1>
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
	<form id = "mypage_form" method = "POST" action = "/TRex/MypageEditServlet">
		<table>
			<tr>
				<td>
					<label>画像アップロード<br>
					<input type = "file" name = "image">
					</label>
				</td>
			</tr>
			<!-- <tr>
				<td>
					<div>
						<label>USER ID<br>
						<input type="text" name="userid" placeholder="USER ID"><br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>PASSWORDS<br>
						<input type="password" name="password" placeholder="PASSWORD">
						<input type= "button" name = "change_password" value = "変更">
						</label>
					</div>
				</td>
			</tr> -->
			<tr>
				<td>
					<div>
						<label>NAME<br>
						<input type="text" name="name" placeholder="NAME" value="${param.name}"><br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>EMAIL<br>
						<input type="text" name="email" placeholder="E-MAIL" value="${param.email}"><br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>GENDER<br>
						   	<c:if test="${param.gender=='men'}">
								<select name="gender" id = "genderSelect">
									<option value="none">選択してください</option>
									<option value="men" selected>男性</option>
									<option value="woman">女性</option>
									<option value="others">その他</option>
								</select><br>
							</c:if>
							<c:if test="${param.gender=='woman'}">
								<select name="gender" id = "genderSelect">
									<option value="none">選択してください</option>
									<option value="men" selected>男性</option>
									<option value="woman">女性</option>
									<option value="others">その他</option>
								</select><br>
							</c:if>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>
						HEIGHT<br>
						<input type="text" name="height" placeholder="height" value="${param.height}">cm<br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>WEIGHT<br>
						<input type="text" name="weight" placeholder="weight" value="${param.weight}">kg<br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>PRIFECTURE<br>
							<select name="address">
									<option value="">選択してください</option>
									<option value="北海道" <c:if test="${param.address=='北海道'}">selected</c:if>>北海道</option>
									<option value="青森県" <c:if test="${param.address=='青森県'}">selected</c:if>>青森県</option>
									<option value="岩手県" <c:if test="${param.address=='岩手県'}">selected</c:if>>岩手県</option>
									<option value="宮城県" <c:if test="${param.address=='宮城県'}">selected</c:if>>宮城県</option>
									<option value="秋田県" <c:if test="${param.address=='秋田県'}">selected</c:if>>秋田県</option>
									<option value="山形県" <c:if test="${param.address=='山形県'}">selected</c:if>>山形県</option>
									<option value="福島県" <c:if test="${param.address=='福島県'}">selected</c:if>>福島県</option>
									<option value="茨城県" <c:if test="${param.address=='茨城県'}">selected</c:if>>茨城県</option>
									<option value="栃木県" <c:if test="${param.address=='栃木県'}">selected</c:if>>栃木県</option>
									<option value="群馬県" <c:if test="${param.address=='群馬県'}">selected</c:if>>群馬県</option>
									<option value="埼玉県" <c:if test="${param.address=='埼玉県'}">selected</c:if>>埼玉県</option>
									<option value="千葉県" <c:if test="${param.address=='千葉県'}">selected</c:if>>千葉県</option>
									<option value="東京都" <c:if test="${param.address=='東京都'}">selected</c:if>>東京都</option>
									<option value="神奈川県" <c:if test="${param.address=='神奈川県'}">selected</c:if>>神奈川県</option>
									<option value="新潟県" <c:if test="${param.address=='新潟県'}">selected</c:if>>新潟県</option>
									<option value="富山県" <c:if test="${param.address=='富山県'}">selected</c:if>>富山県</option>
									<option value="石川県" <c:if test="${param.address=='石川県'}">selected</c:if>>石川県</option>
									<option value="福井県" <c:if test="${param.address=='福井県'}">selected</c:if>>福井県</option>
									<option value="山梨県" <c:if test="${param.address=='山梨県'}">selected</c:if>>山梨県</option>
									<option value="長野県" <c:if test="${param.address=='長野県'}">selected</c:if>>長野県</option>
									<option value="岐阜県" <c:if test="${param.address=='岐阜県'}">selected</c:if>>岐阜県</option>
									<option value="静岡県" <c:if test="${param.address=='静岡県'}">selected</c:if>>静岡県</option>
									<option value="愛知県" <c:if test="${param.address=='愛知県'}">selected</c:if>>愛知県</option>
									<option value="三重県" <c:if test="${param.address=='三重県'}">selected</c:if>>三重県</option>
									<option value="滋賀県" <c:if test="${param.address=='滋賀県'}">selected</c:if>>滋賀県</option>
									<option value="京都府" <c:if test="${param.address=='京都府'}">selected</c:if>>京都府</option>
									<option value="大阪府" <c:if test="${param.address=='大阪府'}">selected</c:if>>大阪府</option>
									<option value="兵庫県" <c:if test="${param.address=='兵庫県'}">selected</c:if>>兵庫県</option>
									<option value="奈良県" <c:if test="${param.address=='奈良県'}">selected</c:if>>奈良県</option>
									<option value="和歌山県" <c:if test="${param.address=='和歌山県'}">selected</c:if>>和歌山県</option>
									<option value="鳥取県" <c:if test="${param.address=='鳥取県'}">selected</c:if>>鳥取県</option>
									<option value="島根県" <c:if test="${param.address=='島根県'}">selected</c:if>>島根県</option>
									<option value="岡山県" <c:if test="${param.address=='岡山県'}">selected</c:if>>岡山県</option>
									<option value="広島県" <c:if test="${param.address=='広島県'}">selected</c:if>>広島県</option>
									<option value="山口県" <c:if test="${param.address=='山口県'}">selected</c:if>>山口県</option>
									<option value="徳島県" <c:if test="${param.address=='徳島県'}">selected</c:if>>徳島県</option>
									<option value="香川県" <c:if test="${param.address=='香川県'}">selected</c:if>>香川県</option>
									<option value="愛媛県" <c:if test="${param.address=='愛媛県'}">selected</c:if>>愛媛県</option>
									<option value="高知県" <c:if test="${param.address=='高知県'}">selected</c:if>>高知県</option>
									<option value="福岡県" <c:if test="${param.address=='福岡県'}">selected</c:if>>福岡県</option>
									<option value="佐賀県" <c:if test="${param.address=='佐賀県'}">selected</c:if>>佐賀県</option>
									<option value="長崎県" <c:if test="${param.address=='長崎県'}">selected</c:if>>長崎県</option>
									<option value="熊本県" <c:if test="${param.address=='熊本県'}">selected</c:if>>熊本県</option>
									<option value="大分県" <c:if test="${param.address=='大分県'}">selected</c:if>>大分県</option>
									<option value="宮崎県" <c:if test="${param.address=='宮崎県'}">selected</c:if>>宮崎県</option>
									<option value="鹿児島県" <c:if test="${param.address=='鹿児島県'}">selected</c:if>>鹿児島県</option>
									<option value="沖縄県" <c:if test="${param.address=='沖縄県'}">selected</c:if>>沖縄県</option>
									</select><br>
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<label>BIRTHDAY<br>
							<input type="date" name="birth" max="9999-12-31" value="${param.birth}">
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
					    <div style="color:#ff0000;" class="contents" id="error_message"></div>
						<input type="submit"name="register" value="REGISTER" onclick="return check()">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<input type="button"name="cancel" value="CANCEL">
					</div>
				</td>
			</tr>
		</table>
	</form>

</body>
<script>
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});
</script>
<script src="/TRex/js/user_error.js"></script>
</html>