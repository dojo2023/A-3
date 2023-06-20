package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Registers;

public class RegisterDao{// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Registers> select(Registers param) {
		Connection conn = null;
		List<Registers> postList = new ArrayList<Registers>();	//resultsetをArrayListに入れ直して返す

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data", "sa", "sa");

			// SQL文を準備する
			String sql = "select * from REGISTER "
					+ "WHERE ID LIKE ? AND OUTER LIKE ? AND TOPS LIKE ? AND BOTTOMS LIKE ? AND DRESS LIKE ? AND "
					+ "SOCKS LIKE ? AND SHOSE LIKE ? AND ACCE LIKE ?  AND COAT LIKE ? AND JACKET LIKE ? AND"
					+ "SHIRT LIKE ? AND POLO LIKE ? AND KNIT LIKE ? AND VEST LIKE ? AND CARDIGAN LIKE ? AND"
					+ "STRAIGHT LIKE ? AND SLACKS LIKE ? AND TAPERED LIKE ? AND SKINNY LIKE ? AND CHINO LIKE ? AND"
					+ "LONG LIKE ? AND SHIRTDRESS LIKE ? AND JUMPERDRESS LIKE ? AND KNEEDRESS LIKE ? AND"
					+ "PUMPS LIKE ? AND LOAFRE LIKE ? AND SNEAKER LIKE ? AND BOOTS LIKE ? AND SLIP LIKE ? AND"
					+ "NECLLACE LIKE ? AND PIERCR LIKE ? AND EARRING LIKE ? AND BELT LIKE ? AND SPRIPNG LIKE ? AND "
					+ "SUMMER LIKE ? AND AUTUM LIKE ? AND WINTER LIKE ? AND CUTE LIKE ? AND CASUAL LIKE ? AND "
					+ "SIMPLE LIKE ? AND STRIPE LIKE ? AND CHEC LIKE ? AND DOT LIKE ? AND BEAUTY LIKE ?  AND "
					+ "MODE LIKE ? AND NATURA LIKE ? AND CONSERVA LIKE ? AND COOL LIKE ? AND LOWHEIGHT LIKE ? AND "
					+ "MENS LIKE ? AND LOWPRICE LIKE ? AND MONOTONE LIKE ? AND SKEWAVE LIKE ? AND "
					+ "SKESTRAIGHT LIKE ? AND SKENATURAL LIKE ?  AND REPEAT LIKE ?  AND Img LIKE ?  ";




			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
				pStmt.setString(1, "%" + param.getId() + "%");

				pStmt.setString(2, "%" + param.getOuter() + "%");

				pStmt.setString(3, "%" + param.getTops() + "%");

				pStmt.setString(4, "%" + param.getBottoms() + "%");

				pStmt.setString(5, "%" + param.getDress() + "%");

				pStmt.setString(6, "%" + param.getSocks() + "%");

				pStmt.setString(7, "%" + param.getShose() + "%");

				pStmt.setString(8, "%" + param.getAcce() + "%");

				pStmt.setString(9, "%" + param.getCoat() + "%");

				pStmt.setString(10, "%" + param.getJacket() + "%");

				pStmt.setString(11, "%" + param.getShirt() + "%");

				pStmt.setString(12, "%" + param.getPolo() + "%");

				pStmt.setString(13, "%" + param.getKnit() + "%");

				pStmt.setString(14, "%" + param.getVest() + "%");

				pStmt.setString(15, "%" + param.getCardigan() + "%");

				pStmt.setString(16, "%" + param.getStraight() + "%");

				pStmt.setString(17, "%" + param.getSlacks() + "%");

				pStmt.setString(18, "%" + param.getTapered() + "%");

				pStmt.setString(19, "%" + param.getSkinny() + "%");

				pStmt.setString(20, "%" + param.getChino() + "%");

				pStmt.setString(21, "%" + param.getLongskirt() + "%");

				pStmt.setString(22, "%" + param.getShirtdress() + "%");

				pStmt.setString(23, "%" + param.getJumperdress() + "%");

				pStmt.setString(24, "%" + param.getKneedress() + "%");

				pStmt.setString(25, "%" + param.getPumps() + "%");

				pStmt.setString(26, "%" + param.getLoafre() + "%");

				pStmt.setString(27, "%" + param.getSneaker() + "%");

				pStmt.setString(28, "%" + param.getBoots() + "%");

				pStmt.setString(29, "%" + param.getSlip() + "%");

				pStmt.setString(30, "%" + param.getNecllace() + "%");

				pStmt.setString(31, "%" + param.getPiercr() + "%");

				pStmt.setString(32, "%" + param.getEarring() + "%");

				pStmt.setString(33, "%" + param.getBelt() + "%");

				pStmt.setString(34, "%" + param.getSpring() + "%");

				pStmt.setString(35, "%" + param.getSummer() + "%");

				pStmt.setString(36, "%" + param.getAutum() + "%");

				pStmt.setString(37, "%" + param.getWinter() + "%");

				pStmt.setString(38, "%" + param.getCute() + "%");

				pStmt.setString(39, "%" + param.getCasual() + "%");

				pStmt.setString(40, "%" + param.getSimple() + "%");

				pStmt.setString(41, "%" + param.getStripe() + "%");

				pStmt.setString(42, "%" + param.getCheck() + "%");

				pStmt.setString(43, "%" + param.getDot() + "%");

				pStmt.setString(44, "%" + param.getBeauty() + "%");

				pStmt.setString(45, "%" + param.getMode() + "%");

				pStmt.setString(46, "%" + param.getNatural() + "%");

				pStmt.setString(47, "%" + param.getConserva() + "%");

				pStmt.setString(48, "%" + param.getCool() + "%");

				pStmt.setString(49, "%" + param.getLowheight() + "%");

				pStmt.setString(50, "%" + param.getMens() + "%");

				pStmt.setString(51, "%" + param.getLowprice() + "%");

				pStmt.setString(52, "%" + param.getMonotone() + "%");

				pStmt.setString(53, "%" + param.getSkewave() + "%");

				pStmt.setString(54, "%" + param.getSkestraight() + "%");

				pStmt.setString(55, "%" + param.getSkenatural() + "%");

				pStmt.setString(56, "%" + param.getRepeat() + "%");

				pStmt.setString(57, "%" + param.getImg() + "%");


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				//引数がありのBcメソッドを動かしている。
				Registers poster = new Registers();
				poster.setId(rs.getString("ID"));
				poster.setOuter(rs.getString("OUTER"));
				poster.setTops(rs.getString("TOPS"));
				poster.setBottoms(rs.getString("BOTTOMS"));
				poster.setDress(rs.getString("DRESS"));
				poster.setSocks(rs.getString("SOCKS"));
				poster.setShose(rs.getString("SHOSE"));
				poster.setAcce(rs.getString("ACCE"));
				poster.setCoat(rs.getString("COAT"));
				poster.setJacket(rs.getString("JACKET"));
				poster.setShirt(rs.getString("SHIRT"));
				poster.setPolo(rs.getString("POLO"));
				poster.setKnit(rs.getString("KNIT"));
				poster.setVest(rs.getString("VEST"));
				poster.setCardigan(rs.getString("CARDIGAN"));
				poster.setStraight(rs.getString("STRAIGHT"));
				poster.setSlacks(rs.getString("SLACKS"));
				poster.setTapered(rs.getString("TAPERED"));
				poster.setSkinny(rs.getString("SKINNY"));
				poster.setChino(rs.getString("CHINO"));
				poster.setLongskirt(rs.getString("LONG"));
				poster.setShirtdress(rs.getString("SHIRTDRESS"));
				poster.setJumperdress(rs.getString("JUMPERDRESS"));
				poster.setKneedress(rs.getString("KNEEDRESS"));
				poster.setPumps(rs.getString("PUMPS"));
				poster.setLoafre(rs.getString("LOAFRE"));
				poster.setSneaker(rs.getString("SNEAKER"));
				poster.setBoots(rs.getString("BOOTS"));
				poster.setSlip(rs.getString("SLIP"));
				poster.setNecllace(rs.getString("NECLLACE"));
				poster.setPiercr(rs.getString("PIERCR"));
				poster.setEarring(rs.getString("EARRING"));
				poster.setBelt(rs.getString("BELT"));
				poster.setSpring(rs.getString("SPRING"));
				poster.setSummer(rs.getString("SUMMER"));
				poster.setAutum(rs.getString("AUTUM"));
				poster.setWinter(rs.getString("WINTER"));
				poster.setCute(rs.getString("CUTE"));
				poster.setCasual(rs.getString("CASUAL"));
				poster.setSimple(rs.getString("SIMPLE"));
				poster.setStripe(rs.getString("STRIPE"));
				poster.setCheck(rs.getString("CHEC"));
				poster.setDot(rs.getString("DOT"));
				poster.setBeauty(rs.getString("BEAUTY"));
				poster.setMode(rs.getString("MODE"));
				poster.setNatural(rs.getString("NATURA"));
				poster.setConserva(rs.getString("CONSERVA"));
				poster.setCool(rs.getString("COOL"));
				poster.setLowheight(rs.getString("LOWHEIGHT"));
				poster.setMens(rs.getString("MENS"));
				poster.setLowprice(rs.getString("LOWPRICE"));
				poster.setMonotone(rs.getString("MONOTONE"));
				poster.setSkewave(rs.getString("SKEWAVE"));
				poster.setSkestraight(rs.getString("SKESTRAIGHT"));
				poster.setSkenatural(rs.getString("SKENATURAL"));
				poster.setRepeat(rs.getString("REPEAT"));
				poster.setImg(rs.getString("IMG"));

				postList.add(poster);

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			postList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			postList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					postList = null;
				}
			}
		}

		// 結果を返す
		return postList;
	}

	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Registers postlist) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection(" jdbc:h2:file:C:/dojo6/data", "sa", "sa");

			// SQL文を準備する
			String sql = "insert into REGISTER (ID,OUTER,TOPS,BOTTOMS,DRESS,SOCKS,SHOSE,ACCE,"
					+ "COAT,JACKET,SHIRT,POLO,KNIT,VEST,CARDIGAN,STRAIGHT,SLACKS,TAPERED,SKINNY,CHINO"
					+ "LONG,SHIRTDRESS,JUMPERDRESS,KNEEDRESS,PUMPS,LOAFRE,SNEAKER,BOOTS,SLIP,NECLLACE "
					+ "PIERCR,EARRING,BELT,SPRIPNG,SUMMER,AUTUM,"
					+ "WINTER,CUTE,CASUAL,SIMPLE,STRIPE,CHEC,DOT,BEAUTY,MODE,NATURA,CONSERVA,COOL,LOWHEIGHT,"
					+ "MENS,LOWPRICE,MONOTONE,SKEWAVE,SKESTRAIGHT,SKENATURAL,REPEAT,Img)"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?)";			//全ての列名で提示することでオートインクリメントに対応できる。
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる

			pStmt.setString(1, "%" + postlist.getId() + "%");

			pStmt.setString(2, "%" + postlist.getOuter() + "%");

			pStmt.setString(3, "%" + postlist.getTops() + "%");

			pStmt.setString(4, "%" + postlist.getBottoms() + "%");

			pStmt.setString(5, "%" + postlist.getDress() + "%");

			pStmt.setString(6, "%" + postlist.getSocks() + "%");

			pStmt.setString(7, "%" + postlist.getShose() + "%");

			pStmt.setString(8, "%" + postlist.getAcce() + "%");

			pStmt.setString(9, "%" + postlist.getCoat() + "%");

			pStmt.setString(10, "%" + postlist.getJacket() + "%");

			pStmt.setString(11, "%" + postlist.getShirt() + "%");

			pStmt.setString(12, "%" + postlist.getPolo() + "%");

			pStmt.setString(13, "%" + postlist.getKnit() + "%");

			pStmt.setString(14, "%" + postlist.getVest() + "%");

			pStmt.setString(15, "%" + postlist.getCardigan() + "%");

			pStmt.setString(16, "%" + postlist.getStraight() + "%");

			pStmt.setString(17, "%" + postlist.getSlacks() + "%");

			pStmt.setString(18, "%" + postlist.getTapered() + "%");

			pStmt.setString(19, "%" + postlist.getSkinny() + "%");

			pStmt.setString(20, "%" + postlist.getChino() + "%");

			pStmt.setString(21, "%" + postlist.getLongskirt() + "%");

			pStmt.setString(22, "%" + postlist.getShirtdress() + "%");

			pStmt.setString(23, "%" + postlist.getJumperdress() + "%");

			pStmt.setString(24, "%" + postlist.getKneedress() + "%");

			pStmt.setString(25, "%" + postlist.getPumps() + "%");

			pStmt.setString(26, "%" + postlist.getLoafre() + "%");

			pStmt.setString(27, "%" + postlist.getSneaker() + "%");

			pStmt.setString(28, "%" + postlist.getBoots() + "%");

			pStmt.setString(29, "%" + postlist.getSlip() + "%");

			pStmt.setString(30, "%" + postlist.getNecllace() + "%");

			pStmt.setString(31, "%" + postlist.getPiercr() + "%");

			pStmt.setString(32, "%" + postlist.getEarring() + "%");

			pStmt.setString(33, "%" + postlist.getBelt() + "%");

			pStmt.setString(34, "%" + postlist.getSpring() + "%");

			pStmt.setString(35, "%" + postlist.getSummer() + "%");

			pStmt.setString(36, "%" + postlist.getAutum() + "%");

			pStmt.setString(37, "%" + postlist.getWinter() + "%");

			pStmt.setString(38, "%" + postlist.getCute() + "%");

			pStmt.setString(39, "%" + postlist.getCasual() + "%");

			pStmt.setString(40, "%" + postlist.getSimple() + "%");

			pStmt.setString(41, "%" + postlist.getStripe() + "%");

			pStmt.setString(42, "%" + postlist.getCheck() + "%");

			pStmt.setString(43, "%" + postlist.getDot() + "%");

			pStmt.setString(44, "%" + postlist.getBeauty() + "%");

			pStmt.setString(45, "%" + postlist.getMode() + "%");

			pStmt.setString(46, "%" + postlist.getNatural() + "%");

			pStmt.setString(47, "%" + postlist.getConserva() + "%");

			pStmt.setString(48, "%" + postlist.getCool() + "%");

			pStmt.setString(49, "%" + postlist.getLowheight() + "%");

			pStmt.setString(50, "%" + postlist.getMens() + "%");

			pStmt.setString(51, "%" + postlist.getLowprice() + "%");

			pStmt.setString(52, "%" + postlist.getMonotone() + "%");

			pStmt.setString(53, "%" + postlist.getSkewave() + "%");

			pStmt.setString(54, "%" + postlist.getSkestraight() + "%");

			pStmt.setString(55, "%" + postlist.getSkenatural() + "%");

			pStmt.setString(56, "%" + postlist.getRepeat() + "%");

			pStmt.setString(57, "%" + postlist.getImg() + "%");

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// 結果を返す
		return result;
	}

	// 引数postlistで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Registers postlist) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data", "sa", "sa");

			// SQL文を準備する
			String sql = "update REGISTER set (ID,OUTER,TOPS,BOTTOMS,DRESS,SOCKS,SHOSE,ACCE"
					+ "COAT,JACKET,SHIRT,POLO,KNIT,VEST,CARDIGAN,STRAIGHT,SLACKS,TAPERED,SKINNY,CHINO"
					+ "LONG,SHIRTDRESS,JUMPERDRESS,KNEEDRESS,PUMPS,LOAFRE,SNEAKER,BOOTS,SLIP,NECLLACE"
					+ "PIERCR,EARRING,BELT,SPRIPNG,SUMMER,AUTUM"
					+ "WINTER,CUTE,CASUAL,SIMPLE,STRIPE,CHEC,DOT,BEAUTY,MODE,NATURA,CONSERVA,COOL,LOWHEIGHT"
					+ "MENS,LOWPRICE,MONOTONE,SKEWAVE,SKESTRAIGHT,SKENATURAL,REPEAT,Img)"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (postlist.getId() != null && !postlist.getId().equals("")) {
			pStmt.setString(1,postlist.getId());
			}
			else {
				pStmt.setString(1, null);
			}

			if (postlist.getOuter() != null && !postlist.getOuter().equals("")) {
			pStmt.setString(2,postlist.getOuter());
			}
			else {
				pStmt.setString(2, null);
			}

			if (postlist.getTops() != null && !postlist.getTops().equals("")) {
			pStmt.setString(3,postlist.getTops());
			}
			else {
				pStmt.setString(3, null);
			}

			if (postlist.getBottoms() != null && !postlist.getBottoms().equals("")) {
			pStmt.setString(4,postlist.getBottoms());
			}
			else {
				pStmt.setString(4, null);
			}

			if (postlist.getDress() != null && !postlist.getDress().equals("")) {
			pStmt.setString(5,postlist.getDress());
			}
			else {
				pStmt.setString(5, null);
			}

			if (postlist.getSocks() != null && !postlist.getSocks().equals("")) {
			pStmt.setString(6,postlist.getSocks());
			}
			else {
				pStmt.setString(6, null);
			}

			if (postlist.getShose() != null && !postlist.getShose().equals("")) {
			pStmt.setString(7,postlist.getShose());
			}
			else {
				pStmt.setString(7, null);
			}

			if (postlist.getAcce() != null && !postlist.getAcce().equals("")) {
			pStmt.setString(8,postlist.getAcce());
			}
			else {
				pStmt.setString(8, null);
			}

			if (postlist.getCoat() != null && !postlist.getCoat().equals("")) {
			pStmt.setString(9,postlist.getCoat());
			}
			else {
				pStmt.setString(9, null);
			}

			if (postlist.getJacket() != null && !postlist.getJacket().equals("")) {
			pStmt.setString(10,postlist.getJacket());
			}
			else {
				pStmt.setString(10, null);
			}

			if (postlist.getShirt() != null && !postlist.getShirt().equals("")) {
			pStmt.setString(11,postlist.getShirt());
			}
			else {
				pStmt.setString(11, null);
			}

			if (postlist.getPolo() != null && !postlist.getPolo().equals("")) {
			pStmt.setString(12,postlist.getPolo());
			}
			else {
				pStmt.setString(12, null);
			}

			if (postlist.getKnit() != null && !postlist.getKnit().equals("")) {
			pStmt.setString(13, postlist.getKnit());
			}
			else {
				pStmt.setString(13, null);
			}

			if (postlist.getVest() != null && !postlist.getVest().equals("")) {
			pStmt.setString(14,postlist.getVest());
			}
			else {
				pStmt.setString(14, null);
			}

			if (postlist.getCardigan() != null && !postlist.getCardigan().equals("")) {
			pStmt.setString(15,postlist.getCardigan());
			}
			else {
				pStmt.setString(15, null);
			}

			if (postlist.getStraight() != null && !postlist.getStraight().equals("")) {
			pStmt.setString(16,postlist.getStraight());
			}
			else {
				pStmt.setString(16, null);
			}

			if (postlist.getSlacks() != null && !postlist.getSlacks().equals("")) {
			pStmt.setString(17,postlist.getSlacks());
			}
			else {
				pStmt.setString(17, null);
			}

			if (postlist.getTapered() != null && !postlist.getTapered().equals("")) {
			pStmt.setString(18,postlist.getTapered());
			}
			else {
				pStmt.setString(18, null);
			}

			if (postlist.getSkinny() != null && !postlist.getSkinny().equals("")) {
			pStmt.setString(19,postlist.getSkinny());
			}
			else {
				pStmt.setString(19, null);
			}

			if (postlist.getChino() != null && !postlist.getChino().equals("")) {
			pStmt.setString(20,postlist.getChino());
			}
			else {
				pStmt.setString(20, null);
			}

			if (postlist.getLongskirt() != null && !postlist.getLongskirt().equals("")) {
			pStmt.setString(21,postlist.getLongskirt());
			}
			else {
				pStmt.setString(21, null);
			}

			if (postlist.getShirtdress() != null && !postlist.getShirtdress().equals("")) {
			pStmt.setString(22,postlist.getShirtdress());
			}
			else {
				pStmt.setString(22, null);
			}

			if (postlist.getJumperdress() != null && !postlist.getJumperdress().equals("")) {
			pStmt.setString(23,postlist.getJumperdress());
			}
			else {
				pStmt.setString(23, null);
			}

			if (postlist.getKneedress() != null && !postlist.getKneedress().equals("")) {
			pStmt.setString(24,postlist.getKneedress());
			}
			else {
				pStmt.setString(24, null);
			}

			if (postlist.getPumps() != null && !postlist.getPumps().equals("")) {
			pStmt.setString(25,postlist.getPumps());
			}
			else {
				pStmt.setString(25, null);
			}

			if (postlist.getLoafre() != null && !postlist.getLoafre().equals("")) {
			pStmt.setString(26,postlist.getLoafre());
			}
			else {
				pStmt.setString(26, null);
			}

			if (postlist.getSneaker() != null && !postlist.getSneaker().equals("")) {
			pStmt.setString(27,postlist.getSneaker());
			}
			else {
				pStmt.setString(27, null);
			}

			if (postlist.getBoots() != null && !postlist.getBoots().equals("")) {
			pStmt.setString(28,postlist.getBoots());
			}
			else {
				pStmt.setString(28, null);
			}

			if (postlist.getSlip() != null && !postlist.getSlip().equals("")) {
			pStmt.setString(29,postlist.getSlip());
			}
			else {
				pStmt.setString(29, null);
			}

			if (postlist.getNecllace() != null && !postlist.getNecllace().equals("")) {
			pStmt.setString(30,postlist.getNecllace());
			}
			else {
				pStmt.setString(30, null);
			}

			if (postlist.getPiercr() != null && !postlist.getPiercr().equals("")) {
			pStmt.setString(31,postlist.getPiercr());
			}
			else {
				pStmt.setString(31, null);
			}

			if (postlist.getEarring() != null && !postlist.getEarring().equals("")) {
			pStmt.setString(32,postlist.getEarring());
			}
			else {
				pStmt.setString(32, null);
			}

			if (postlist.getBelt() != null && !postlist.getBelt().equals("")) {
			pStmt.setString(33,postlist.getBelt());
			}
			else {
				pStmt.setString(33, null);
			}

			if (postlist.getSpring() != null && !postlist.getSpring().equals("")) {
			pStmt.setString(34,postlist.getSpring());
			}
			else {
				pStmt.setString(34, null);
			}

			if (postlist.getSummer() != null && !postlist.getSummer().equals("")) {
			pStmt.setString(35,postlist.getSummer());
			}
			else {
				pStmt.setString(35, null);
			}

			if (postlist.getAutum() != null && !postlist.getAutum().equals("")) {
			pStmt.setString(36,postlist.getAutum());
			}
			else {
				pStmt.setString(36, null);
			}

			if (postlist.getWinter() != null && !postlist.getWinter().equals("")) {
			pStmt.setString(37,postlist.getWinter());
			}
			else {
				pStmt.setString(37, null);
			}

			if (postlist.getCute() != null && !postlist.getCute().equals("")) {
			pStmt.setString(38,postlist.getCute());
			}
			else {
				pStmt.setString(38, null);
			}

			if (postlist.getCasual() != null && !postlist.getCasual().equals("")) {
			pStmt.setString(39,postlist.getCasual());
			}
			else {
				pStmt.setString(39, null);
			}

			if (postlist.getSimple() != null && !postlist.getSimple().equals("")) {
			pStmt.setString(40,postlist.getSimple());
			}
			else {
				pStmt.setString(40, null);
			}

			if (postlist.getStripe() != null && !postlist.getStripe().equals("")) {
			pStmt.setString(41,postlist.getStripe());
			}
			else {
				pStmt.setString(41, null);
			}

			if (postlist.getCheck() != null && !postlist.getCheck().equals("")) {
			pStmt.setString(42,postlist.getCheck());
			}
			else {
				pStmt.setString(42, null);
			}

			if (postlist.getDot() != null && !postlist.getDot().equals("")) {
			pStmt.setString(43, postlist.getDot());
			}
			else {
				pStmt.setString(43, null);
			}

			if (postlist.getBeauty() != null && !postlist.getBeauty().equals("")) {
			pStmt.setString(44,postlist.getBeauty());
			}
			else {
				pStmt.setString(44, null);
			}

			if (postlist.getMode() != null && !postlist.getMode().equals("")) {
			pStmt.setString(45, postlist.getMode());
			}
			else {
				pStmt.setString(45, null);
			}

			if (postlist.getNatural() != null && !postlist.getNatural().equals("")) {
			pStmt.setString(46,postlist.getNatural());
			}
			else {
				pStmt.setString(46, null);
			}

			if (postlist.getConserva() != null && !postlist.getConserva().equals("")) {
			pStmt.setString(47, postlist.getConserva());
			}
			else {
				pStmt.setString(47, null);
			}

			if (postlist.getCool() != null && !postlist.getCool().equals("")) {
			pStmt.setString(48,postlist.getCool());
			}
			else {
				pStmt.setString(48, null);
			}

			if (postlist.getLowheight() != null && !postlist.getLowheight().equals("")) {
			pStmt.setString(49,postlist.getLowheight());
			}
			else {
				pStmt.setString(49, null);
			}

			if (postlist.getMens() != null && !postlist.getMens().equals("")) {
			pStmt.setString(50,postlist.getMens());
			}
			else {
				pStmt.setString(50, null);
			}

			if (postlist.getLowprice() != null && !postlist.getLowprice().equals("")) {
			pStmt.setString(51,postlist.getLowprice());
			}
			else {
				pStmt.setString(51, null);
			}

			if (postlist.getMonotone() != null && !postlist.getMonotone().equals("")) {
			pStmt.setString(52,postlist.getMonotone());
			}
			else {
				pStmt.setString(52, null);
			}

			if (postlist.getSkewave() != null && !postlist.getSkewave().equals("")) {
			pStmt.setString(53,postlist.getSkewave());
			}
			else {
				pStmt.setString(53, null);
			}

			if (postlist.getSkestraight() != null && !postlist.getSkestraight().equals("")) {
			pStmt.setString(54,postlist.getSkestraight());
			}
			else {
				pStmt.setString(54, null);
			}

			if (postlist.getSkenatural() != null && !postlist.getSkenatural().equals("")) {
			pStmt.setString(55,postlist.getSkenatural());
			}
			else {
				pStmt.setString(55, null);
			}

			if (postlist.getRepeat() != null && !postlist.getRepeat().equals("")) {
			pStmt.setString(56,postlist.getRepeat());
			}
			else {
				pStmt.setString(56, null);
			}

			if (postlist.getImg() != null && !postlist.getImg().equals("")) {
			pStmt.setString(57,postlist.getImg());
			}
			else {
				pStmt.setString(57, null);
			}


			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// 結果を返す
		return result;
	}

	// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
	public boolean delete(String id) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data", "sa", "sa");

			// SQL文を準備する
			String sql = "delete from REGISTER where ID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, id);

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// 結果を返す
		return result;
	}

}