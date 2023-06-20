<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | REGISTER</title>
<link rel ="stylesheet" href="/TRex/css/register.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
</head>
<header id="header">
  	<!-- 天気 -->
  	<div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>REGISTER</h1>
	<h1>C²A</h1>
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
	<div class = "wrapper">
		<form id = "register" method = "POST" action = "/TRex/RegisterServlet"enctype="multipart/form-data">
			<table>
				<tr>
					<td>
						<div>
						GENDER<br>
						<input type="radio" name="gender" value="MEN">MEN
						<input type="radio" name="gender" value="WOMAN">WOMAN
						<input type="radio" name="gender" value="OTHERS">OTHERS
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div>
							ITEM<br>
							<input type="checkbox" name="clothes"value="outer">outer
							<input type="checkbox" name="clothes"value="tops">tops
							<input type="checkbox" name="clothes"value="bottoms">bottoms
							<input type="checkbox" name="clothes"value="dress">dress
							<input type="checkbox" name="clothes"value="socks">socks
							<input type="checkbox" name="clothes"value="shoes">shoes
							<input type="checkbox" name="clothes"value="accessory">accessory
						</div>
						<div>
							SUB CATEGORY<br>
						</div>
						<div>
							OUTER<br>
							<select name="sub_outer">
								<option value="none">選択してください</option>
								<option value="jacket">ジャケット</option>
								<option value="coat">コート</option>
							</select>
						</div>
						<div>
							TOPS<br>
							<select name="sub_tops">
								<option value="none">選択してください</option>
								<option value="shirt">シャツ・ブラウス</option>
								<option value="poloshirt">ポロシャツ</option>
								<option value="sweater">セーター</option>
								<option value="vest">ベスト</option>
								<option value="cardigan">カーディガン</option>
							</select>
						</div>
						<div>
							BOTTOMS<br>
							<select name="sub_bottoms">
								<option value="none">選択してください</option>
								<option value="straight">ストレートパンツ</option>
								<option value="slacks">スラックス</option>
								<option value="tarered">テーパードパンツ</option>
								<option value="skinny">スキニーパンツ</option>
								<option value="chino">チノパンツ</option>
								<option value="long">ロングスカート</option>
							</select>
						</div>
						<div>
							DRESS<br>
							<select name="sub_dress">
								<option value="none">選択してください</option>
								<option value="shirts_dress">シャツワンピース</option>
								<option value="jumper">ジャンパースカート</option>
								<option value="knee">ひざ丈のワンピース</option>
							</select>
						</div>
						<div>
							SHOES<br>
							<select name="sub_shoes">
								<option value="none">選択してください</option>
								<option value="pumps">パンプス</option>
								<option value="loafers">ローファー</option>
								<option value="sneakers">スニーカー</option>
								<option value="boots">ブーツ</option>
							</select>
						</div>
						<div>
							ACCESSORY<br>
							<select name="sub_acce">
								<option value="none">選択してください</option>
								<option value="necklace">ネックレス</option>
								<option value="pierce">ピアス</option>
								<option value="earring">イヤリング</option>
								<option value="belt">ベルト</option>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div>
							<label>TAG<br>
							<input type = "checkbox" name = "tag" value = "春">SPRING
							<input type = "checkbox" name = "tag" value = "夏">SUMMER
							<input type = "checkbox" name = "tag" value = "秋">AUTUM
							<input type = "checkbox" name = "tag" value = "冬">WINTER
							<input type = "checkbox" name = "tag" value = "かわいい">CUTE
							<input type = "checkbox" name = "tag" value = "かっこいい">COOL
							<input type = "checkbox" name = "tag" value = "カジュアル">CASUAL<br>
							<input type = "checkbox" name = "tag" value = "シンプル">SIMPLE
							<input type = "checkbox" name = "tag" value = "ストライプ">STRIPE
							<input type = "checkbox" name = "tag" value = "チェック">CHECK
							<input type = "checkbox" name = "tag" value = "水玉">DOT
							<input type = "checkbox" name = "tag" value = "きれいめ">BEAUTY
							<input type = "checkbox" name = "tag" value = "モード">MODE
							<input type = "checkbox" name = "tag" value = "ナチュラル">NATURAL<br>
							<input type = "checkbox" name = "tag" value = "コンサバ">CONSERVA
							<input type = "checkbox" name = "tag" value = "低身長">LOWHEIGHT
							<input type = "checkbox" name = "tag" value = "メンズ">MENS
							<input type = "checkbox" name = "tag" value = "プチプラ">LOWPRICE
							<input type = "checkbox" name = "tag" value = "モノトーン">MONOTONE
							<input type = "checkbox" name = "tag" value = "着回し">REPEAT
							<input type = "checkbox" name = "tag" value = "骨格ウェーブ">SKEWAVE<br>
							<input type = "checkbox" name = "tag" value = "骨格ストレート">SKESTRAIGHT
							<input type = "checkbox" name = "tag" value = "骨格ナチュラル">SKENATURAL
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div>
							<label>画像アップロード<br>
								画像:<input type="file" name="IMAGE" accept="image/*" onchange="previewImage(this);"><br>
								<canvas id="preview" style="max-width:200px;"></canvas><br>
								<input type="submit" value="送信">
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div>
							<div style="color:#ff0000;" class="contents" id="error_message"></div>
							<input type = "submit" name = "register" value = "REGISTER">
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>

		<script>
			document.querySelector('.menu-btn').addEventListener('click', function(){
			document.querySelector('.menu').classList.toggle('is-active');
			});
		</script>
		<script>
	function previewImage(obj){

		var fileReader = new FileReader();

		// 読み込み後に実行する処理
		fileReader.onload = (function() {

			// canvas にプレビュー画像を表示
			var canvas = document.getElementById('preview');
			var ctx = canvas.getContext('2d');
			var image = new Image();
			image.src = fileReader.result;
			console.log(fileReader.result) // ← (確認用)

			image.onload = (function () {
				canvas.width = image.width;
				canvas.height = image.height;
				ctx.drawImage(image, 0, 0);
			});
		});
		// 画像読み込み
		fileReader.readAsDataURL(obj.files[0]);
		console.log(fileReader.result) // ← (確認用)null
	}
		</script>

</body>

</html>