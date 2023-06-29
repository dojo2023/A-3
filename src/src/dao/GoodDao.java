package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodDao{

	public GoodDao() {

	}
	public GoodDao(String string, String string2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int insertDelete(String clothesID,String uID,int check) {
		Connection conn = null;
		int result = 0;


		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");
			String sql = "";
			if(check==1) {
				sql ="insert into GOOD (GOODCLOTHES,UID) values (?, ?)";

			}else {
				sql ="delete from GOOD where GOODCLOTHES =? and UID=?";
			}
			PreparedStatement pStmt = conn.prepareStatement(sql);

//			pStmt = conn.prepareStatement(sql);


			// SQL文を準備する
	//		String sql = "update GOOD set GOOD_FLAG=? where ID=?";


			// SQL文を完成させる
			pStmt.setString(1, clothesID);
			pStmt.setString(2, uID);


			// SQL文を実行する
			/*			if (pStmt.executeUpdate() == 1) {
							result = check;
						}*/

			result = pStmt.executeUpdate();
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

	@SuppressWarnings("unchecked")
	public List<GoodDao> select(GoodDao param) {
		Connection conn = null;
		List<GoodDao> goodList = new ArrayList<GoodDao>();


		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");

			// SQL文を準備する（何で検索することが多いかを考える）
			//検索
			String sql = "select * from BC WHERE CLOTHESID LIKE ? AND UID LIKE ? ORDER BY ID";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			//検索値がnullにはならないから
				pStmt.setString(1, "%" + param.getgetclothesID() + "%");
				pStmt.setString(2, "%" + param.getgetuID() + "%");

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				GoodDao Goods = new GoodDao(
				rs.getString("CLOTHESID"),
				rs.getString("UID")
				);
				goodList.add(Goods);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			goodList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			goodList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					goodList = null;
				}
			}
		}

		// 結果を返す
		return (List<GoodDao>) goodList;
	}


	public boolean select(String clothesID,String uID) {
		Connection conn = null;
		boolean result = false;


		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");
			//検索
			String sql = "select * from GOOD WHERE GOODCLOTHES = ? AND UID = ? ORDER BY GOODID";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
				pStmt.setString(1, clothesID);
				pStmt.setString(2, uID);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
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

	private String getgetuID() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private String getgetclothesID() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


}