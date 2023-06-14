<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²Ae</title>
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
</head>
<body>
	<h1>C²A</h1>
	<h2>SEARCH</h2>
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
	<form action="">
		  <input type="file" name="icon">
		  <button type="submit">送信する</button>
	<div>
	USER ID<br>
	<input type="text" name="userid" placeholder="USER ID"><br>
	PASSWORDS<br>
	<input type="password" name="password" placeholder="PASS"><br>
	NAME<br>
	<input type="text" name="name" placeholder="NAME"><br>
	EMAIL<br>
	<input type="text" name="email" placeholder="E-MAIL"><br>
	GENDER<br>
		<select name="gender">
			<option value="none">選択してください</option>
			<option value="men">男性</option>
			<option value="woman">女性</option>
			<option value="others">その他</option>
		</select><br>
	HEIGHT<br>
	<input type="text" name="height" placeholder="height">cm<br>
	WEIGHT<br>
	<input type="text" name="weight" placeholder="weight">kg<br>
	PRIFECTURE<br>
		<select name="pref">
				<option value="">選択してください</option>
				<option value="北海道">北海道</option>
				<option value="青森県">青森県</option>
				<option value="岩手県">岩手県</option>
				<option value="宮城県">宮城県</option>
				<option value="秋田県">秋田県</option>
				<option value="山形県">山形県</option>
				<option value="福島県">福島県</option>
				<option value="茨城県">茨城県</option>
				<option value="栃木県">栃木県</option>
				<option value="群馬県">群馬県</option>
				<option value="埼玉県">埼玉県</option>
				<option value="千葉県">千葉県</option>
				<option value="東京都" selected>東京都</option>
				<option value="神奈川県">神奈川県</option>
				<option value="新潟県">新潟県</option>
				<option value="富山県">富山県</option>
				<option value="石川県">石川県</option>
				<option value="福井県">福井県</option>
				<option value="山梨県">山梨県</option>
				<option value="長野県">長野県</option>
				<option value="岐阜県">岐阜県</option>
				<option value="静岡県">静岡県</option>
				<option value="愛知県">愛知県</option>
				<option value="三重県">三重県</option>
				<option value="滋賀県">滋賀県</option>
				<option value="京都府">京都府</option>
				<option value="大阪府">大阪府</option>
				<option value="兵庫県">兵庫県</option>
				<option value="奈良県">奈良県</option>
				<option value="和歌山県">和歌山県</option>
				<option value="鳥取県">鳥取県</option>
				<option value="島根県">島根県</option>
				<option value="岡山県">岡山県</option>
				<option value="広島県">広島県</option>
				<option value="山口県">山口県</option>
				<option value="徳島県">徳島県</option>
				<option value="香川県">香川県</option>
				<option value="愛媛県">愛媛県</option>
				<option value="高知県">高知県</option>
				<option value="福岡県">福岡県</option>
				<option value="佐賀県">佐賀県</option>
				<option value="長崎県">長崎県</option>
				<option value="熊本県">熊本県</option>
				<option value="大分県">大分県</option>
				<option value="宮崎県">宮崎県</option>
				<option value="鹿児島県">鹿児島県</option>
				<option value="沖縄県">沖縄県</option>
				</select><br>
	BIRTHDAY<br>
		<input type="date" name="calendar" max="9999-12-31">
	</div>
	<div>
		<input type="submit"name="submit" value="登録">
	</div>
	</form>

</body>
<script>
	/* ハンバーガーメニュー用 */
	document.querySelector('.menu-btn').addEventListener('click', function(){
	document.querySelector('.menu').classList.toggle('is-active');
	});

</script>
</html>