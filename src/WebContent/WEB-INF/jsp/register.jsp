<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A | REGISTER</title>
</head>
<header>
	<h1>REGISTER</h1>
</header>
<body>
<div class = "wrapper">
	<form id = "register_form" method = "POST" action = "/TRex/RegisterServlet">
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
							<option value="jacket">ジャケット</option>
							<option value="coat">コート</option>
						</select>
					</div>
					<div>
						TOPS<br>
						<select name="sub_tops">
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
							<option value="shirts_dress">シャツワンピース</option>
							<option value="jumper">ジャンパースカート</option>
							<option value="knee">ひざ丈のワンピース</option>
						</select>
					</div>
					<div>
						SHOES<br>
						<select name="sub_shoes">
							<option value="pumps">パンプス</option>
							<option value="loafers">ローファー</option>
							<option value="sneakers">スニーカー</option>
							<option value="boots">ブーツ</option>
						</select>
					</div>
					<div>
						accessory<br>
						<select name="sub_acce">
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
						<input type = "file" name = "image">
						</label>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div>
						<input type = "submit" name = "register" value = "REGISTER">
					</div>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>