package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public int update(String clothesID,String uID) {
	Connection conn = null;
	int result = 0;
	int count=0;

	try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\dojo6\\data", "sa", "sa");

		String sql ="select count(*) from GDDO where CLOTHES_ID =? and UID=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		pStmt.setString(1,clothesID);
		pStmt.setString(2,uID);
		ResultSet rs = pStmt.executeQuery();

		if(rs.next()) {
			count++;
		}

		if(count==0) {
			String sql ="insert into GOOD values (?, ?, ?)";

		}else {
			String sql ="delete from GOOD where CLOTHES_ID =? and UID=?";

		}

		PreparedStatement pStmt = conn.prepareStatement(sql);


		// SQL文を準備する
//		String sql = "update GOOD set GOOD_FLAG=? where ID=?";


		// SQL文を完成させる
		pStmt.setString(1, good.getID());


		// SQL文を実行する
		if (pStmt.executeUpdate() == 1) {
			result = true;
		}

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
