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
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/TRex", "sa", "sa");

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

				pStmt.setString(38, "%" + param.getWinter() + "%");

				pStmt.setString(39, "%" + param.getCute() + "%");

				pStmt.setString(40, "%" + param.getCasual() + "%");

				pStmt.setString(41, "%" + param.getSimple() + "%");

				pStmt.setString(42, "%" + param.getStripe() + "%");

				pStmt.setString(43, "%" + param.getCheck() + "%");

				pStmt.setString(44, "%" + param.getDot() + "%");

				pStmt.setString(45, "%" + param.getBeauty() + "%");

				pStmt.setString(46, "%" + param.getMode() + "%");

				pStmt.setString(47, "%" + param.getNatural() + "%");

				pStmt.setString(48, "%" + param.getConserva() + "%");

				pStmt.setString(49, "%" + param.getCool() + "%");

				pStmt.setString(50, "%" + param.getLowheight() + "%");

				pStmt.setString(51, "%" + param.getMens() + "%");

				pStmt.setString(52, "%" + param.getLowprice() + "%");

				pStmt.setString(53, "%" + param.getMonotone() + "%");

				pStmt.setString(54, "%" + param.getSkewave() + "%");

				pStmt.setString(55, "%" + param.getSkestraight() + "%");

				pStmt.setString(56, "%" + param.getSkenatural() + "%");

				pStmt.setString(57, "%" + param.getRepeat() + "%");

				pStmt.setString(58, "%" + param.getImg() + "%");


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				//引数がありのBcメソッドを動かしている。
				Registers postlist = new Registers();
				postlist.setId(rs.getString("ID"));
				postlist.setOuter(rs.getString("OUTER"));
				postlist.setTops(rs.getString("TOPS"));
				postlist.setBottoms(rs.getString("BOTTOMS"));
				postlist.setDress(rs.getString("DRESS"));
				postlist.setSocks(rs.getString("SOCKS"));
				postlist.setShose(rs.getString("SHOSE"));
				postlist.setAcce(rs.getString("ACCE"));
				postlist.setCoat(rs.getString("COAT"));
				postlist.setJacket(rs.getString("JACKET"));
				postlist.setShirt(rs.getString("SHIRT"));
				postlist.setPolo(rs.getString("POLO"));
				postlist.setKnit(rs.getString("KNIT"));
				postlist.setVest(rs.getString("VEST"));
				postlist.setCardigan(rs.getString("CARDIGAN"));
				postlist.setStraight(rs.getString("STRAIGHT"));
				postlist.setSlacks(rs.getString("SLACKS"));
				postlist.setTapered(rs.getString("TAPERED"));
				postlist.setSkinny(rs.getString("SKINNY"));
				postlist.setChino(rs.getString("CHINO"));
				postlist.setLongskirt(rs.getString("LONG"));
				postlist.setShirtdress(rs.getString("SHIRTDRESS"));
				postlist.setJumperdress(rs.getString("JUMPERDRESS"));
				postlist.setKneedress(rs.getString("KNEEDRESS"));
				postlist.setPumps(rs.getString("PUMPS"));
				postlist.setLoafre(rs.getString("LOAFRE"));
				postlist.setSneaker(rs.getString("SNEAKER"));
				postlist.setBoots(rs.getString("BOOTS"));
				postlist.setSlip(rs.getString("SLIP"));
				postlist.setNecllace(rs.getString("NECLLACE"));
				postlist.setPiercr(rs.getString("PIERCR"));
				postlist.setEarring(rs.getString("EARRING"));
				postlist.setBelt(rs.getString("BELT"));
				postlist.setSpring(rs.getString("SPRING"));
				postlist.setSummer(rs.getString("SUMMER"));
				postlist.setAutum(rs.getString("AUTUM"));
				postlist.setWinter(rs.getString("WINTER"));
				postlist.setCute(rs.getString("CUTE"));
				postlist.setCasual(rs.getString("CASUAL"));
				postlist.setSimple(rs.getString("SIMPLE"));
				postlist.setStripe(rs.getString("STRIPE"));
				postlist.setCheck(rs.getString("CHEC"));
				postlist.setDot(rs.getString("DOT"));
				postlist.setBeauty(rs.getString("BEAUTY"));
				postlist.setMode(rs.getString("MODE"));
				postlist.setNatural(rs.getString("NATURA"));
				postlist.setConserva(rs.getString("CONSERVA"));
				postlist.setCool(rs.getString("COOL"));
				postlist.setLowheight(rs.getString("LOWHEIGHT"));
				postlist.setMens(rs.getString("MENS"));
				postlist.setLowprice(rs.getString("LOWPRICE"));
				postlist.setMonotone(rs.getString("MONOTONE"));
				postlist.setSkewave(rs.getString("SKEWAVE"));
				postlist.setSkestraight(rs.getString("SKESTRAIGHT"));
				postlist.setSkenatural(rs.getString("SKENATURAL"));
				postlist.setRepeat(rs.getString("REPEAT"));
				postlist.setImg(rs.getString("IMG"));

				postList.add(postlist);

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
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/TRex", "sa", "sa");

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

			pStmt.setString(38, "%" + postlist.getWinter() + "%");

			pStmt.setString(39, "%" + postlist.getCute() + "%");

			pStmt.setString(40, "%" + postlist.getCasual() + "%");

			pStmt.setString(41, "%" + postlist.getSimple() + "%");

			pStmt.setString(42, "%" + postlist.getStripe() + "%");

			pStmt.setString(43, "%" + postlist.getCheck() + "%");

			pStmt.setString(44, "%" + postlist.getDot() + "%");

			pStmt.setString(45, "%" + postlist.getBeauty() + "%");

			pStmt.setString(46, "%" + postlist.getMode() + "%");

			pStmt.setString(47, "%" + postlist.getNatural() + "%");

			pStmt.setString(48, "%" + postlist.getConserva() + "%");

			pStmt.setString(49, "%" + postlist.getCool() + "%");

			pStmt.setString(50, "%" + postlist.getLowheight() + "%");

			pStmt.setString(51, "%" + postlist.getMens() + "%");

			pStmt.setString(52, "%" + postlist.getLowprice() + "%");

			pStmt.setString(53, "%" + postlist.getMonotone() + "%");

			pStmt.setString(54, "%" + postlist.getSkewave() + "%");

			pStmt.setString(55, "%" + postlist.getSkestraight() + "%");

			pStmt.setString(56, "%" + postlist.getSkenatural() + "%");

			pStmt.setString(57, "%" + postlist.getRepeat() + "%");

			pStmt.setString(58, "%" + postlist.getImg() + "%");

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
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/TRex", "sa", "sa");

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
			pStmt.setString(1,postlist.getId());

			pStmt.setString(2,postlist.getOuter());

			pStmt.setString(3,postlist.getTops());

			pStmt.setString(4,postlist.getBottoms());

			pStmt.setString(5,postlist.getDress());

			pStmt.setString(6,postlist.getSocks());

			pStmt.setString(7,postlist.getShose());

			pStmt.setString(8,postlist.getAcce());

			pStmt.setString(9,postlist.getCoat());

			pStmt.setString(10,postlist.getJacket());

			pStmt.setString(11,postlist.getShirt());

			pStmt.setString(12,postlist.getPolo());

			pStmt.setString(13, postlist.getKnit());

			pStmt.setString(14,postlist.getVest());

			pStmt.setString(15,postlist.getCardigan());

			pStmt.setString(16,postlist.getStraight());

			pStmt.setString(17,postlist.getSlacks());

			pStmt.setString(18,postlist.getTapered());

			pStmt.setString(19,postlist.getSkinny());

			pStmt.setString(20,postlist.getChino());

			pStmt.setString(21,postlist.getLongskirt());

			pStmt.setString(22,postlist.getShirtdress());

			pStmt.setString(23,postlist.getJumperdress());

			pStmt.setString(24,postlist.getKneedress());

			pStmt.setString(25,postlist.getPumps());

			pStmt.setString(26,postlist.getLoafre());

			pStmt.setString(27,postlist.getSneaker());

			pStmt.setString(28,postlist.getBoots());

			pStmt.setString(29,postlist.getSlip());

			pStmt.setString(30,postlist.getNecllace());

			pStmt.setString(31,postlist.getPiercr());

			pStmt.setString(32,postlist.getEarring());

			pStmt.setString(33,postlist.getBelt());

			pStmt.setString(34,postlist.getSpring());

			pStmt.setString(35,postlist.getSummer());

			pStmt.setString(36,postlist.getAutum());

			pStmt.setString(38,postlist.getWinter());

			pStmt.setString(39,postlist.getCute());

			pStmt.setString(40,postlist.getCasual());

			pStmt.setString(41,postlist.getSimple());

			pStmt.setString(42,postlist.getStripe());

			pStmt.setString(43,postlist.getCheck());

			pStmt.setString(44, postlist.getDot());

			pStmt.setString(45,postlist.getBeauty());

			pStmt.setString(46, postlist.getMode());

			pStmt.setString(47,postlist.getNatural());

			pStmt.setString(48, postlist.getConserva());

			pStmt.setString(49,postlist.getCool());

			pStmt.setString(50,postlist.getLowheight());

			pStmt.setString(51,postlist.getMens());

			pStmt.setString(52,postlist.getLowprice());

			pStmt.setString(53,postlist.getMonotone());

			pStmt.setString(54,postlist.getSkewave());

			pStmt.setString(55,postlist.getSkestraight());

			pStmt.setString(56,postlist.getSkenatural());

			pStmt.setString(57,postlist.getRepeat());

			pStmt.setString(58,postlist.getImg());

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
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/TRex", "sa", "sa");

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