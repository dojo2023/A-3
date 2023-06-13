<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>C²A</title>
</head>
	<h1>C²A</h1>
	<h2>SEARCH</h2>
	<hr>
	<form action="">
		<div>
		<p>検索したいキーワードを入力してください。</p>
  		<input type="search" name="search" placeholder="キーワードを入力">
  		</div>
		<div>
		GENDER<br>
		<input type="radio" name="gender" value="MEN">MEN
		<input type="radio" name="gender" value="WOMAN">WOMAN
		<input type="radio" name="gender" value="OTHERS">OTHERS
		</div>
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
		SUB CATEGORY<br>
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
		accessory<br>
		<select name="sub_acce">
			<option value="none">選択してください</option>
			<option value="necklace">ネックレス</option>
			<option value="pierce">ピアス</option>
			<option value="earring">イヤリング</option>
			<option value="belt">ベルト</option>
		</select>
		</div>
		<div>
		<input type="submit"name="submit" value="検索">
		</div>
	</form>
<body>

</body>

</html>