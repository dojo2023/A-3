package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Topimages;

public class TopimageDao {

    private Connection conn;

    public List<Topimages> getTopImages() throws SQLException {
        List<Topimages> imageList = new ArrayList<>();
        try {

        	 // JDBCドライバを読み込む
            Class.forName("org.h2.Driver");

            // データベースに接続する
            conn = DriverManager.getConnection("jdbc:h2:file:C:\\dojo6\\data", "sa", "sa");


	        // SQL文を準備する
	        String sql = "SELECT * FROM TOP LIMIT 5" ;
	        PreparedStatement pStmt = conn.prepareStatement(sql);

	        // SQL文を完成させる
	//        pStmt.setString(1, ID);
	//        pStmt.setString(2, IMG);  //←画像なのにString型?

	        // SQL文の実行
	        ResultSet rs = pStmt.executeQuery();
	        while (rs.next()) {
	            Topimages e = new Topimages();
	            e.setTopid(rs.getInt("TOPID"));
	            e.setTopimg(rs.getString("TOPIMG"));
	            imageList.add(e);
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

	    return imageList;
    }
}





