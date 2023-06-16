package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Users;

public class UsersDao{

	// 引数paramで検索項目を指定し、検索結果のリストを返す
		public List<Bc> select(Bc param) {
			Connection conn = null;
			List<Bc> cardList = new ArrayList<Bc>();

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

				// SQL文を準備する（何で検索することが多いかを考える）
				//検索
				String sql = "select * from BC WHERE NUMBER LIKE ? AND NAME LIKE ? AND ADDRESS LIKE ? ORDER BY NUMBER";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				//検索値がnullにはならないから
					pStmt.setString(1, "%" + param.getNumber() + "%");
					pStmt.setString(2, "%" + param.getName() + "%");
					pStmt.setString(3, "%" + param.getAddress() + "%");

				// SQL文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();

				// 結果表をコレクションにコピーする
				//引数に合わせる(今回は11個）
				while (rs.next()) {
					Bc card = new Bc(
					rs.getString("NUMBER"),
					rs.getString("COMPANY"),
					rs.getString("DEPARTMENT"),
					rs.getString("POSITION"),
					rs.getString("NAME"),
					rs.getString("ZIPCODE"),
					rs.getString("ADDRESS"),
					rs.getString("PHONE"),
					rs.getString("FAX"),
					rs.getString("EMAIL"),
					rs.getString("REMARKS")
					);
					cardList.add(card);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				cardList = null;
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
				cardList = null;
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
						cardList = null;
					}
				}
			}

			// 結果を返す
			return cardList;
		}

		// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Bc card) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

				// SQL文を準備する
				String sql = "insert into BC values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
					pStmt.setString(1, card.getNumber());
					pStmt.setString(2, card.getCompany());
					pStmt.setString(3, card.getDepartment());
					pStmt.setString(4, card.getPosition());
					pStmt.setString(5, card.getName());
					pStmt.setString(6, card.getZipcode());
					pStmt.setString(7, card.getAddress());
					pStmt.setString(8, card.getPhone());
					pStmt.setString(9, card.getFax());
					pStmt.setString(10, card.getEmail());
					pStmt.setString(11, card.getRemarks());

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

		// 引数cardで指定されたレコードを更新し、成功したらtrueを返す
		public boolean update(Bc card) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

				// SQL文を準備する
				String sql = "update BC set COMPANY=?, DEPARTMENT=?, POSITION=?, NAME=?, ZIPCODE=?, ADDRESS=?, PHONE=?, FAX=?, EMAIL=?, REMARKS=? where NUMBER=?";
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
				if (card.getPhone() != null && !card.getPhone().equals("")) {
					pStmt.setString(7, card.getPhone());
				}
				else {
					pStmt.setString(7, null);
				}
				if (card.getFax() != null && !card.getFax().equals("")) {
					pStmt.setString(8, card.getFax());
				}
				else {
					pStmt.setString(8, null);
				}
				if (card.getEmail() != null && !card.getEmail().equals("")) {
					pStmt.setString(9, card.getEmail());
				}
				else {
					pStmt.setString(9, null);
				}
				if (card.getRemarks() != null && !card.getRemarks().equals("")) {
					pStmt.setString(10, card.getRemarks());
				}
				else {
					pStmt.setString(10, null);
				}
				pStmt.setString(11, card.getNumber());



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
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

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

}