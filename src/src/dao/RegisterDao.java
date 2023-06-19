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



				pStmt.setString(1, "%" + param.getCoat() + "%");

				pStmt.setString(2, "%" + param.getOuter() + "%");

				pStmt.setString(3, "%" + param.getTops() + "%");

				pStmt.setString(4, "%" + param.getBottoms() + "%");

				pStmt.setString(5, "%" + param.getDress() + "%");

				pStmt.setString(6, "%" + param.getSocks() + "%");

				pStmt.setString(7, "%" + param.getShose() + "%");

				pStmt.setString(8, "%" + param.getAcce() + "%");

				pStmt.setString(1, "%" + param.getId() + "%");

				pStmt.setString(2, "%" + param.getOuter() + "%");

				pStmt.setString(3, "%" + param.getTops() + "%");

				pStmt.setString(4, "%" + param.getBottoms() + "%");

				pStmt.setString(5, "%" + param.getDress() + "%");

				pStmt.setString(6, "%" + param.getSocks() + "%");

				pStmt.setString(7, "%" + param.getShose() + "%");

				pStmt.setString(8, "%" + param.getAcce() + "%");

				pStmt.setString(1, "%" + param.getId() + "%");

				pStmt.setString(2, "%" + param.getOuter() + "%");

				pStmt.setString(3, "%" + param.getTops() + "%");

				pStmt.setString(4, "%" + param.getBottoms() + "%");

				pStmt.setString(5, "%" + param.getDress() + "%");

				pStmt.setString(6, "%" + param.getSocks() + "%");

				pStmt.setString(7, "%" + param.getShose() + "%");

				pStmt.setString(8, "%" + param.getAcce() + "%");


				pStmt.setString(9, "%" + param.getSpring() + "%");

				pStmt.setString(10, "%" + param.getSummer() + "%");

				pStmt.setString(11, "%" + param.getAutum() + "%");

				pStmt.setString(12, "%" + param.getWinter() + "%");

				pStmt.setString(13, "%" + param.getCute() + "%");

				pStmt.setString(14, "%" + param.getCasual() + "%");

				pStmt.setString(15, "%" + param.getSimple() + "%");

				pStmt.setString(16, "%" + param.getStripe() + "%");

				pStmt.setString(17, "%" + param.getCheck() + "%");

				pStmt.setString(18, "%" + param.getDot() + "%");

				pStmt.setString(19, "%" + param.getBeauty() + "%");

				pStmt.setString(20, "%" + param.getMode() + "%");

				pStmt.setString(21, "%" + param.getNatural() + "%");

				pStmt.setString(22, "%" + param.getConserva() + "%");

				pStmt.setString(23, "%" + param.getCool() + "%");

				pStmt.setString(24, "%" + param.getLowheight() + "%");

				pStmt.setString(25, "%" + param.getMens() + "%");

				pStmt.setString(26, "%" + param.getLowprice() + "%");

				pStmt.setString(27, "%" + param.getMonotone() + "%");

				pStmt.setString(28, "%" + param.getSkewave() + "%");

				pStmt.setString(29, "%" + param.getSkestraight() + "%");

				pStmt.setString(30, "%" + param.getSkenatural() + "%");

				pStmt.setString(31, "%" + param.getRepeat() + "%");

				pStmt.setString(32, "%" + param.getImg() + "%");


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
			String sql = "insert into REGISTER (ID,OUTER,TOPS,BOTTOMS,DRESS,SOCKS,SHOSE,ACCE,SPRIPNG,SUMMER,AUTUM,"
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

			pStmt.setString(9, "%" + postlist.getSpring() + "%");

			pStmt.setString(10, "%" + postlist.getSummer() + "%");

			pStmt.setString(11, "%" + postlist.getAutum() + "%");

			pStmt.setString(12, "%" + postlist.getWinter() + "%");

			pStmt.setString(13, "%" + postlist.getCute() + "%");

			pStmt.setString(14, "%" + postlist.getCasual() + "%");

			pStmt.setString(15, "%" + postlist.getSimple() + "%");

			pStmt.setString(16, "%" + postlist.getStripe() + "%");

			pStmt.setString(17, "%" + postlist.getCheck() + "%");

			pStmt.setString(18, "%" + postlist.getDot() + "%");

			pStmt.setString(19, "%" + postlist.getBeauty() + "%");

			pStmt.setString(20, "%" + postlist.getMode() + "%");

			pStmt.setString(21, "%" + postlist.getNatural() + "%");

			pStmt.setString(22, "%" + postlist.getConserva() + "%");

			pStmt.setString(23, "%" + postlist.getCool() + "%");

			pStmt.setString(24, "%" + postlist.getLowheight() + "%");

			pStmt.setString(25, "%" + postlist.getMens() + "%");

			pStmt.setString(26, "%" + postlist.getLowprice() + "%");

			pStmt.setString(27, "%" + postlist.getMonotone() + "%");

			pStmt.setString(28, "%" + postlist.getSkewave() + "%");

			pStmt.setString(29, "%" + postlist.getSkestraight() + "%");

			pStmt.setString(30, "%" + postlist.getSkenatural() + "%");

			pStmt.setString(31, "%" + postlist.getRepeat() + "%");

			pStmt.setString(32, "%" + postlist.getImg() + "%");

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
			String sql = "update REGISTER set COMPANY=?, DEPARTMENT=?, POSITION=?, NAME=?, ZIPCODE=?, ADDRESS=?, PHONENUMBER=?, EMAIL=?, REMARKS=? where NUMBER=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getCompany() != null && !card.getCompany().equals("")) {
				pStmt.setString(1, card.getCompany());
			}
			else {
				pStmt.setString(1, null);
			}

			if (card.getDepartment() != null && !card.getDepartment().equals("")) {
				pStmt.setString(2, card.getDepartment());
			}
			else {
				pStmt.setString(2, null);
			}

			if (card.getPosition() != null && !card.getPosition().equals("")) {
				pStmt.setString(3, card.getPosition());
			}
			else {
				pStmt.setString(3, null);
			}

			if (card.getName() != null && !card.getName().equals("")) {
				pStmt.setString(4, card.getName());
			}
			else {
				pStmt.setString(4, null);
			}

			if (card.getZipcode() != null && !card.getZipcode().equals("")) {
				pStmt.setString(5, card.getZipcode());
			}
			else {
				pStmt.setString(5, null);
			}

			if (card.getAddress() != null && !card.getAddress().equals("")) {
				pStmt.setString(6, card.getAddress());
			}
			else {
				pStmt.setString(6, null);
			}

			if (card.getPhonenumber() != null && !card.getPhonenumber().equals("")) {
				pStmt.setString(7, card.getPhonenumber());
			}
			else {
				pStmt.setString(7, null);
			}

			if (card.getEmail() != null && !card.getEmail().equals("")) {
				pStmt.setString(8, card.getEmail());
			}
			else {
				pStmt.setString(8, null);
			}

			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(9, card.getRemarks());
			}
			else {
				pStmt.setString(9, null);
			}

			pStmt.setString(10, card.getNumber());

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
	public boolean delete(String number) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/TRex", "sa", "sa");

			// SQL文を準備する
			String sql = "delete from BC where NUMBER=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, number);

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