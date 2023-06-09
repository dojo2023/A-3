<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | REGISTER</title>
<link rel ="stylesheet" href="/TRex/css/register.css">
<link rel="stylesheet" href="/TRex/css/hamburger.css">
<link rel ="stylesheet" href="/TRex/css/common.css">
</head>
<header id="top-header">
  	<!-- 天気 -->
  	<div id="ww_4872ca99eaffb" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Times","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"#FFFFFF","cl_font":"#000000","cl_cloud":"#d4d4d4","cl_persp":"#2196F3","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722","el_phw":3,"el_whr":3}'>Weather Data Source: <a href="https://oneweather.org/ja/tokyo/14_days/" id="ww_4872ca99eaffb_u" target="_blank">東京天気予報14日間</a></div><script async src="https://app1.weatherwidget.org/js/?id=ww_4872ca99eaffb"></script>
	<h1>REGISTER</h1>
	<img alt="" src="./img/logo10.png"style="width: 200px; height: 100px; margin: 0 0 0 auto;">
	<!-- ハンバーガーメニュー -->
	<button type="button" class="menu-btn">
    <i class="fa fa-bars" aria-hidden="true"></i>
    </button>
    <div class="menu">
      <div class="menu__item"><a href="/TRex/MypageServlet">MY PAGE</a></div>
      <div class="menu__item"><a href="/TRex/TopServlet">TOP PAGE</a></div>
      <div class="menu__item"><a href="/TRex/SearchServlet">SEARCH</a></div>
      <div class="menu__item"><a href="/TRex/ListServlet">LIST</a></div>
      <div class="menu__item"><a href="/TRex/LoginServlet">LOGOUT</a></div>
    </div>
    <hr>
  </header>
<body>
	<div class = "waraper">
		<form id = "register" method = "POST" action = "/TRex/RegisterServlet"enctype="multipart/form-data">
			<input type="hidden" name="ID">
			<table>
				<tr>
					<td>
						<div>
							<br><b><label>ITEM</label></b><br>
							<input type="checkbox" name="clothes"value="outer">outer
							<input type="checkbox" name="clothes"value="tops">tops
							<input type="checkbox" name="clothes"value="bottoms">bottoms
							<input type="checkbox" name="clothes"value="dress">dress
							<input type="checkbox" name="clothes"value="socks">socks
							<input type="checkbox" name="clothes"value="shoes">shoes
							<input type="checkbox" name="clothes"value="acce">accessory
						</div>
						<div>
							<br><b><label>SUB CATEGORY</label></b>
						</div>
						<div>
							<b>OUTER&emsp;&emsp;&emsp;&emsp;</b>
							<select name="sub_outer">
								<option value="none">選択してください</option>
								<option value="jacket">ジャケット</option>
								<option value="coat">コート</option>
							</select>
						</div>
						<div>
							<br><b>TOPS&emsp;&emsp;&emsp;&emsp;</b>
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
							<br><b>BOTTOMS&emsp;&emsp;</b>
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
							<br><b>DRESS&emsp;&emsp;&emsp;&emsp;</b>
							<select name="sub_dress">
								<option value="none">選択してください</option>
								<option value="shirts_dress">シャツワンピース</option>
								<option value="jumper">ジャンパースカート</option>
								<option value="knee">ひざ丈のワンピース</option>
							</select>
						</div>
						<div>
							<br><b>SHOES&emsp;&emsp;&emsp;&emsp;</b>
							<select name="sub_shoes">
								<option value="none">選択してください</option>
								<option value="pumps">パンプス</option>
								<option value="loafers">ローファー</option>
								<option value="sneakers">スニーカー</option>
								<option value="boots">ブーツ</option>
							</select>
						</div>
						<div>
							<br><b>accessory&emsp;&emsp;</b>
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
							<br><b>TAG</b><br>
							<input type = "checkbox" name = "tag" value = "spring">SPRING
							<input type = "checkbox" name = "tag" value = "summer">SUMMER
							<input type = "checkbox" name = "tag" value = "autum">AUTUM
							<input type = "checkbox" name = "tag" value = "winter">WINTER
							<input type = "checkbox" name = "tag" value = "cute">CUTE
							<input type = "checkbox" name = "tag" value = "cool">COOL
							<input type = "checkbox" name = "tag" value = "casual">CASUAL<br>
							<input type = "checkbox" name = "tag" value = "simple">SIMPLE
							<input type = "checkbox" name = "tag" value = "stripe">STRIPE
							<input type = "checkbox" name = "tag" value = "check">CHECK
							<input type = "checkbox" name = "tag" value = "dot">DOT
							<input type = "checkbox" name = "tag" value = "beauty">BEAUTY
							<input type = "checkbox" name = "tag" value = "mode">MODE
							<input type = "checkbox" name = "tag" value = "natural">NATURAL<br>
							<input type = "checkbox" name = "tag" value = "conserva">CONSERVA
							<input type = "checkbox" name = "tag" value = "lowheight">LOWHEIGHT
							<input type = "checkbox" name = "tag" value = "mens">MENS
							<input type = "checkbox" name = "tag" value = "lowprice">LOWPRICE
							<input type = "checkbox" name = "tag" value = "monotone">MONOTONE
							<input type = "checkbox" name = "tag" value = "repeat">REPEAT
							<input type = "checkbox" name = "tag" value = "skewave">SKEWAVE<br>
							<input type = "checkbox" name = "tag" value = "skestraight">SKESTRAIGHT
							<input type = "checkbox" name = "tag" value = "skenatural">SKENATURAL
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
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div>
							<input type = "submit" name = "register" value = "REGISTER"class="button-030">
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