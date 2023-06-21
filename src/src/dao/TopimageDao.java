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

  Connection conn = null;

    public List<Topimages> getTopImages()  {
        List<Topimages> imageList = new ArrayList<>();
        try {

        	 // JDBCドライバを読み込む
            Class.forName("org.h2.Driver");

            // データベースに接続する
            conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");


	        // SQL文を準備する
	        String sql = "SELECT * FROM TOP LIMIT 5" ; //LIMIT 5を消せば全検索
	        PreparedStatement pStmt = conn.prepareStatement(sql);

	        // SQL文を完成させる
	//        pStmt.setString(1, ID);
	//        pStmt.setString(2, IMG);

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
        //結果を返す
	    return imageList;
    }

             //INSERT
        //引数imageで指定されたレコードを登録し、成功したらtrueを返す
   public boolean insert(String image) {
	  Connection conn = null;
	  boolean result = false;

	  try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");

		// SQL文を準備する
		String sql = "INSERT INTO TOP (TOPIMG,IMAGE) VALUES (?,?)";
        PreparedStatement pStmt = conn.prepareStatement(sql);

        //SQL文を完成させる
//       pStmt.setInt(1, topId);
       pStmt.setString(1, image);
       pStmt.setString(2, image);

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

           //UPDATE
   // 引数imageで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Topimages image) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");

			// SQL文を準備する
			String sql = "UPDATE TOP SET TOPIMG = ? WHERE TOPID = ?";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            //SQL文を完成させる
            pStmt.setString(1, image.getTopimg());
            pStmt.setInt(2, image.getTopid());


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

	//DELATE文
	// 引数imageで指定されたレコードを削除し、成功したらtrueを返す
	public boolean delete(Topimages image) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");
			//SQL文を準備する
			String sql = "DELETE FROM TOP WHERE TOPID = ?"; //TOPからTOPIDが指定された値と一致するレコードを削除
            PreparedStatement pStmt = conn.prepareStatement(sql);
            //SQL文を完成させる
            pStmt.setInt(1, image.getTopid());

            // SQL文を実行する
            if (pStmt.executeUpdate() == 1) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // データベースを切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        // 結果を返す
        return result;
    }


	}
