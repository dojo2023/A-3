package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Users;

public class UsersDao{

	// 引数paramで検索項目を指定し、検索結果のリストを返す
//		public List<Users> select(Users param) {
//			Connection conn = null;
//			Users user = null;

//			try {
				// JDBCドライバを読み込む
//				Class.forName("org.h2.Driver");

				// データベースに接続する
//				conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/TRex", "sa", "sa");

				// SQL文を準備する（何で検索することが多いかを考える）
				//検索
//				String sql = "select * from USERS WHERE ID LIKE ? AND MAIL LIKE ? AND ADDRESS LIKE ? ORDER BY NUMBER";
//				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				//検索値がnullにはならないから
//					pStmt.setString(1, "%" + param.getId() + "%");
//					pStmt.setString(2, "%" + param.getMail() + "%");
//					pStmt.setString(3, "%" + param.getAddress() + "%");

				// SQL文を実行し、結果表を取得する
//				ResultSet rs = pStmt.executeQuery();

				// 結果表をコレクションにコピーする
				//引数に合わせる(今回は11個）
//				while (rs.next()){
//					user= new Users();
//					user.setId(rs.getString("ID"));
//					user.setEmail(rs.getString("MAIL"));
//					user.setName(rs.getString("NAME"));

//					rs.getString("PASS"),
//					rs.getString("GENDER"),
//					rs.getString("ADDRESS"),
//					rs.getString("BARTH"),
//					rs.getString("HEIGHT"),
//					rs.getString("WEIGHT"),
//					rs.getString("COLOR"),
//					rs.getString("MANAGEMENT")



//			}
//			catch (SQLException e) {
//				e.printStackTrace();
//				user = null;
//			}
//			catch (ClassNotFoundException e) {
//				e.printStackTrace();
//				new Users();			}
//			finally {
				// データベースを切断
//				if (conn != null) {
//					try {
//						conn.close();
//					}
//					catch (SQLException e) {
//						e.printStackTrace();
//						new Users(); = null;
//					}
//				}
//			}

			// 結果を返す
//			return user;
//		}

		// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Users user) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/TRex", "sa", "sa");

				// SQL文を準備する
				String sql = "insert into Users values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
					pStmt.setString(1, user.getId());
					pStmt.setString(2, user.getPw());
					pStmt.setString(3, user.getName());
					pStmt.setString(4, user.getEmail());
					pStmt.setInt(5, user.getGender());
					pStmt.setString(6, user.getAddress());
					pStmt.setString(7, user.Birth());
					pStmt.setInt(8, user.getHeight());
					pStmt.setInt(9, user.getWeight());
					pStmt.setInt(10, user.getManagement());

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
		public boolean update(Users user) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/TRex", "sa", "sa");

				// SQL文を準備する
				String sql = "update USERS set ID=?, MAIL=?, NAME=?, PASS=?, GENDER=?, ADDRESS=?, BARTH=?, HEIGHT=?, MANAGEMENT=? where NUMBER=?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (user.getId() != null && !user.getId().equals("")) {
					pStmt.setString(1, user.getId());
				}
				else {
					pStmt.setString(1, null);
				}
				if (user.getEmail() != null && !user.getEmail().equals("")) {
					pStmt.setString(2, user.getEmail());
				}
				else {
					pStmt.setString(2, null);
				}
				if (user.getName() != null && !user.getName().equals("")) {
					pStmt.setString(3, user.getName());
				}
				else {
					pStmt.setString(3, null);
				}
				if (user.getPw() != null && !user.getPw().equals("")) {
					pStmt.setString(4, user.getPw());
				}
				else {
					pStmt.setString(4, null);
				}
				if (user.getGender() != null && !user.getGender().equals("")) {
					pStmt.setInt(5, user.getGender());
				}
				else {
					pStmt.setString(5, null);
				}
				if (user.getAddress() != null && !user.getAddress().equals("")) {
					pStmt.setString(6, user.getAddress());
				}
				else {
					pStmt.setString(6, null);
				}
				if (user.getBirth() != null && !user.getBirth().equals("")) {
					pStmt.setString(7, user.getBirth());
				}
				else {
					pStmt.setString(7, null);
				}
				if (user.getHeight() != null && !user.getHeight().equals("")) {
					pStmt.setInt(8, user.getHeight());
				}
				else {
					pStmt.setString(8, null);
				}
				if (user.getWeight() != null && !user.getWeight().equals("")) {
					pStmt.setInt(9, user.getWeight());
				}
				else {
					pStmt.setString(9, null);
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
		public boolean delete(String number) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data/TRex", "sa", "sa");

				// SQL文を準備する
				String sql = "delete from USERS where NUMBER=?";
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