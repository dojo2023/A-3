package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Registers;

public class RegisterDao{// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Registers> select(Registers param) { //全件検索
		Connection conn = null;
	List<Registers> postList = new ArrayList<Registers>();	//resultsetをArrayListに入れ直して返す

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");


			// SQL文を準備する
			String sql = "select * from REGISTER ";


			PreparedStatement pStmt = conn.prepareStatement(sql);

//			// SQL文を完成させる
//				pStmt.setString(1, "%" + param.getId() + "%");
//
//				pStmt.setString(2, "%" + param.getClothes() + "%");
//
//				pStmt.setString(3, "%" + param.getSubOuter() + "%");
//
//				pStmt.setString(4, "%" + param.getSubTops() + "%");
//
//				pStmt.setString(5, "%" + param.getSubBottoms() + "%");
//
//				pStmt.setString(6, "%" + param.getSubDress() + "%");
//
//				pStmt.setString(7, "%" + param.getSubDress() + "%");
//
//				pStmt.setString(8, "%" + param.getSubShoes() + "%");
//
//				pStmt.setString(9, "%" + param.getSubAcce() + "%");
//
//				pStmt.setString(10, "%" + param.getTag() + "%");
//
//				pStmt.setString(11, "%" + param.getImg() + "%");


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				//引数がありのRegistersメソッドを動かしている。
				Registers poster = new Registers();
				poster.setId(rs.getString("ID"));
				String[] clothes = {rs.getString("OUTER"),rs.getString("TOPS"),
						rs.getString("BOTTOMS"),rs.getString("DRESS"),rs.getString("SOCKS"),
						rs.getString("SHOES"),rs.getString("ACCE")};
				poster.setClothes(clothes);
			    poster.setSubTops(rs.getString("SUBTOPS"));
				poster.setSubOuter(rs.getString("SUBOUTER"));
				poster.setSubBottoms(rs.getString("SUBBOTTOMS"));
				poster.setSubDress(rs.getString("SUBDRESS"));
				poster.setSubShoes(rs.getString("SUBSHOES"));
				poster.setSubAcce(rs.getString("SUBACCE"));
				String[] tag = {rs.getString("SPRING"),rs.getString("SUMMER"),rs.getString("AUTUM"),
						rs.getString("WINTER"),rs.getString("CUTE"),rs.getString("CASUAL"),rs.getString("SIMPLE")
						,rs.getString("STRIPE"),rs.getString("CHEC"),rs.getString("DOT"),rs.getString("BEAUTY")
						,rs.getString("MODE"),rs.getString("NATURA"),rs.getString("CONSERVA"),rs.getString("COOL")
						,rs.getString("LOWHEIGHT"),rs.getString("MENS"),rs.getString("LOWPRICE"),rs.getString("MONOTONE")
						,rs.getString("SKEWAVE"),rs.getString("SKESTRAIGHT"),rs.getString("SKENATURAL"),rs.getString("REPEAT")};
				poster.setTag(tag);
				poster.setImg(rs.getString("IMAGE"));
				poster.setImg(rs.getString("INSERT_DATE"));
				postList.add(poster);

			}
		}

		catch (SQLException e) {			e.printStackTrace();
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
				}
			}
		}

		// 結果を返す
		return postList;
	}

	//検索用のselectメソッド
	public List<Registers> searchSelect(String id ,String gender,String[] item,String subOuter,String subTops,
			String subBottoms,String subDress,String subShoes,String subAcce,String[] tag) {
		Connection conn = null;
	List<Registers> searchList = new ArrayList<Registers>();	//resultsetをArrayListに入れ直して返す

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");



			// SQL文を準備する
			String sql = "select * from REGISTER "
					+ "WHERE"
					+ " GENDER=? and "
					+ " SUBOUTER=? and "
					+ "SUBTOPS=? and "
					+ "SUBBOTTOMS=? and "
					+ "SUBDRESS=? and "
					+ "SUBSHOES=? and "
					+ "SUBACCE=? and "

					+ "OUTER=? and "
					+ "TOPS=? and "
					+ "BOTTOMS=? and "
					+ "DRESS=? and "
					+ "SOCKS=? and "
					+ "SHOES=? and "
					+" ACCE=? and "

					+"SPRING=? and "
					+" SUMMER=? and "
					+" AUTUM=? and "
					+" WINTER=? and "
					+" CUTE=? and "
					+" CASUAL=? and "
					+" SIMPLE=? and "
					+" STRIPE=? and "
					+" CHEC=? and "
					+" DOT=? and "
					+" BEAUTY=? and "
					+" MODE=? and "
					+" NATURA=? and "
					+" CONSERVA=? and "
					+" COOL=? and "
					+" LOWHEIGHT=? and "
					+" MENS=? and "
					+" LOWPRICE=? and "
					+" MONOTONE=? and "
					+" SKEWAVE=? and "
					+" SKESTRAIGHT=? and "
					+" SKENATURAL=? and "
					+" REPEAT=?";


			/*					for(int i=0;i<item.length;i++) {
									sql+= "and clothes="+"\'"+item[i]+"\' ";
								}
								for(int i=0;i<tag.length;i++) {
									sql+= "or tag ="+"\'"+tag[i]+"\'";
								}*/
			/*System.out.println(sql);*/
			PreparedStatement pStmt = conn.prepareStatement(sql);

//			// SQL文を完成させる

				pStmt.setString(1, gender);

				pStmt.setString(2, subOuter);

				pStmt.setString(3, subTops);

				pStmt.setString(4, subBottoms);

				pStmt.setString(5,  subDress);

				pStmt.setString(6,  subShoes);

				pStmt.setString(7, subAcce);

				for(Registers n: searchList) {
					if(n.getClothes().equals("outer")) {
						pStmt.setString(8,"1");
						break;
					}else {
						pStmt.setString(8,"0");
					}
				}
				for(Registers a: searchList) {
					if(a.getClothes().equals("tops")) {
						pStmt.setString(9,"1");
						break;
					}else {
						pStmt.setString(9,"0");
					}
				}
					for(Registers b: searchList) {
					if(b.getClothes().equals("bottoms")) {
						pStmt.setString(10,"1");
						break;
					}else {
						pStmt.setString(10,"0");
					}
				}
					for(Registers c: searchList) {
					if(c.getClothes().equals("dress")) {
						pStmt.setString(11,"1");
						break;
					}else {
						pStmt.setString(11,"0");
					}
				}
					for(Registers d: searchList) {
					if(d.getClothes().equals("socks")) {
						pStmt.setString(12,"1");
						break;
					}else {
						pStmt.setString(12,"0");
					}
				}
					for(Registers e: searchList) {
					if(e.getClothes().equals("shoes")) {
						pStmt.setString(13,"1");
						break;
					}else {
						pStmt.setString(13,"0");
					}
				}
					for(Registers f: searchList) {
					if(f.getClothes().equals("acce")) {
						pStmt.setString(14,"1");
						break;
					}else {
						pStmt.setString(14,"0");
					}
				}

					for(Registers g: searchList) {
						if(g.getTag().equals("spring")) {
							pStmt.setString(15,"1");
							break;
						}else {
							pStmt.setString(15,"0");
						}
					}
					for(Registers h: searchList) {
						if(h.getTag().equals("summer")) {
							pStmt.setString(16,"1");
							break;
						}else {
							pStmt.setString(16,"0");
						}
					}
					for(Registers i: searchList) {
						if(i.getTag().equals("autum")) {
							pStmt.setString(17,"1");
							break;
						}else {
							pStmt.setString(17,"0");
						}
					}
					for(Registers j: searchList) {
						if(j.getTag().equals("winter")) {
							pStmt.setString(18,"1");
							break;
						}else {
							pStmt.setString(18,"0");
						}
					}
					for(Registers k: searchList) {
						if(k.getTag().equals("cute")) {
							pStmt.setString(19,"1");
							break;
						}else {
							pStmt.setString(19,"0");
						}
					}
					for(Registers l: searchList) {
						if(l.getTag().equals("casual")) {
							pStmt.setString(20,"1");
							break;
						}else {
							pStmt.setString(20,"0");
						}
					}
					for(Registers m: searchList) {
						if(m.getTag().equals("simple")) {
							pStmt.setString(21,"1");
							break;
						}else {
							pStmt.setString(21,"0");
						}
					}
					for(Registers o: searchList) {
						if(o.getTag().equals("stripe")) {
							pStmt.setString(22,"1");
							break;
						}else {
							pStmt.setString(22,"0");
						}
					}
					for(Registers p: searchList) {
						if(p.getTag().equals("check")) {
							pStmt.setString(23,"1");
							break;
						}else {
							pStmt.setString(23,"0");
						}
					}
					for(Registers q: searchList) {
						if(q.getTag().equals("dot")) {
							pStmt.setString(24,"1");
							break;
						}else {
							pStmt.setString(24,"0");
						}
					}
					for(Registers r: searchList) {
						if(r.getTag().equals("beauty")) {
							pStmt.setString(25,"1");
							break;
						}else {
							pStmt.setString(25,"0");
						}
					}
					for(Registers s: searchList) {
						if(s.getTag().equals("mode")) {
							pStmt.setString(26,"1");
							break;
						}else {
							pStmt.setString(26,"0");
						}
					}
					for(Registers t: searchList) {
						if(t.getTag().equals("natural")) {
							pStmt.setString(27,"1");
							break;
						}else {
							pStmt.setString(27,"0");
						}
					}
					for(Registers u: searchList) {
						if(u.getTag().equals("conserva")) {
							pStmt.setString(28,"1");
							break;
						}else {
							pStmt.setString(28,"0");
						}
					}
					for(Registers v: searchList) {
						if(v.getTag().equals("cool")) {
							pStmt.setString(29,"1");
							break;
						}else {
							pStmt.setString(29,"0");
						}
					}
					for(Registers w: searchList) {
						if(w.getTag().equals("lowheight")) {
							pStmt.setString(30,"1");
							break;
						}else {
							pStmt.setString(30,"0");
						}
					}
					for(Registers x: searchList) {
						if(x.getTag().equals("mens")) {
							pStmt.setString(31,"1");
							break;
						}else {
							pStmt.setString(31,"0");
						}
					}
					for(Registers z: searchList) {
						if(z.getTag().equals("lowprice")) {
							pStmt.setString(32,"1");
							break;
						}else {
							pStmt.setString(32,"0");
						}
					}
					for(Registers aa: searchList) {
						if(aa.getTag().equals("monotone")) {
							pStmt.setString(33,"1");
							break;
						}else {
							pStmt.setString(33,"0");
						}
					}
					for(Registers bb: searchList) {
						if(bb.getTag().equals("skewave")) {
							pStmt.setString(34,"1");
							break;
						}else {
							pStmt.setString(34,"0");
						}
					}
					for(Registers cc: searchList) {
						if(cc.getTag().equals("skestraight")) {
							pStmt.setString(35,"1");
							break;
						}else {
							pStmt.setString(35,"0");
						}
					}
					for(Registers dd: searchList) {
						if(dd.getTag().equals("skenatural")) {
							pStmt.setString(36,"1");
							break;
						}else {
							pStmt.setString(36,"0");
						}
					}
					for(Registers ee: searchList) {
						if(ee.getTag().equals("repeat")) {
							pStmt.setString(37,"1");
							break;
						}else {
							pStmt.setString(37,"0");
						}
					}

				/*for(String n: item) {
					if(n.equals("outer")) {
						pStmt.setString(8,"1");
					}else {
						pStmt.setString(8,"0");
					}
					if(n.equals("tops")) {
						pStmt.setString(9,"1");
					}else {
						pStmt.setString(9,"0");
					}
					if(n.equals("bottoms")) {
						pStmt.setString(10,"1");
					}else {
						pStmt.setString(10,"0");
					}
					if(n.equals("dress")) {
						pStmt.setString(11,"1");
					}else {
						pStmt.setString(11,"0");
					}
					if(n.equals("socks")) {
						pStmt.setString(12,"1");
					}else {
						pStmt.setString(12,"0");
					}
					if(n.equals("shoes")) {
						pStmt.setString(13,"1");
					}else {
						pStmt.setString(13,"0");
					}
					if(n.equals("acce")) {
						pStmt.setString(14,"1");
					}else {
						pStmt.setString(14,"0");
					}
				}

				for(String n: tag) {
					if(n.equals("spring")) {
						pStmt.setString(15,"1");
					}else {
						pStmt.setString(15,"0");
					}
					if(n.equals("summer")) {
						pStmt.setString(16,"1");
					}else {
						pStmt.setString(16,"0");
					}
					if(n.equals("autum")) {
						pStmt.setString(17,"1");
					}else {
						pStmt.setString(17,"0");
					}
					if(n.equals("winter")) {
						pStmt.setString(18,"1");
					}else {
						pStmt.setString(18,"0");
					}
					if(n.equals("cute")) {
						pStmt.setString(19,"1");
					}else {
						pStmt.setString(19,"0");
					}
					if(n.equals("casual")) {
						pStmt.setString(20,"1");
					}else {
						pStmt.setString(20,"0");
					}
					if(n.equals("simple")) {
						pStmt.setString(21,"1");
					}else {
						pStmt.setString(21,"0");
					}
					if(n.equals("stripe")) {
						pStmt.setString(22,"1");
					}else {
						pStmt.setString(22,"0");
					}
					if(n.equals("check")) {
						pStmt.setString(23,"1");
					}else {
						pStmt.setString(23,"0");
					}
					if(n.equals("dot")) {
						pStmt.setString(24,"1");
					}else {
						pStmt.setString(24,"0");
					}
					if(n.equals("beauty")) {
						pStmt.setString(25,"1");
					}else {
						pStmt.setString(25,"0");
					}
					if(n.equals("mode")) {
						pStmt.setString(26,"1");
					}else {
						pStmt.setString(26,"0");
					}
					if(n.equals("natural")) {
						pStmt.setString(27,"1");
					}else {
						pStmt.setString(27,"0");
					}
					if(n.equals("conserva")) {
						pStmt.setString(28,"1");
					}else {
						pStmt.setString(28,"0");
					}
					if(n.equals("cool")) {
						pStmt.setString(29,"1");
					}else {
						pStmt.setString(29,"0");
					}
					if(n.equals("lowheight")) {
						pStmt.setString(30,"1");
					}else {
						pStmt.setString(30,"0");
					}
					if(n.equals("mens")) {
						pStmt.setString(31,"1");
					}else {
						pStmt.setString(31,"0");
					}
					if(n.equals("lowprice")) {
						pStmt.setString(32,"1");
					}else {
						pStmt.setString(32,"0");
					}
					if(n.equals("monotone")) {
						pStmt.setString(33,"1");
					}else {
						pStmt.setString(33,"0");
					}
					if(n.equals("skewave")) {
						pStmt.setString(34,"1");
					}else {
						pStmt.setString(34,"0");
					}
					if(n.equals("skestraight")) {
						pStmt.setString(35,"1");
					}else {
						pStmt.setString(35,"0");
					}
					if(n.equals("skenatural")) {
						pStmt.setString(36,"1");
					}else {
						pStmt.setString(36,"0");
					}
					if(n.equals("repeat")) {
						pStmt.setString(37,"1");
					}else {
						pStmt.setString(37,"0");
					}
				}*/

				/*pStmt.setString(7, "%" + param.getSubShoes() + "%");

				pStmt.setString(8, "%" + param.getSubAcce() + "%");

				pStmt.setString(9, "%" + param.getTag() + "%");

				pStmt.setString(10, "%" + param.getImg() + "%");

				pStmt.setString(11, "%" + param.getGender() + "%");
				*/

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						//引数がありのRegistersメソッドを動かしている。
						Registers poster = new Registers();
						poster.setId(rs.getString("ID"));
						String[] clothes = {rs.getString("OUTER"),rs.getString("TOPS"),
								rs.getString("BOTTOMS"),rs.getString("DRESS"),rs.getString("SOCKS"),
								rs.getString("SHOES"),rs.getString("ACCE")};
						poster.setClothes(clothes);
					    poster.setSubTops(rs.getString("SUBTOPS"));
						poster.setSubOuter(rs.getString("SUBOUTER"));
						poster.setSubBottoms(rs.getString("SUBBOTTOMS"));
						poster.setSubDress(rs.getString("SUBDRESS"));
						poster.setSubShoes(rs.getString("SUBSHOES"));
						poster.setSubAcce(rs.getString("SUBACCE"));
						String[] tag1 = {rs.getString("SPRING"),rs.getString("SUMMER"),rs.getString("AUTUM"),
								rs.getString("WINTER"),rs.getString("CUTE"),rs.getString("CASUAL"),rs.getString("SIMPLE")
								,rs.getString("STRIPE"),rs.getString("CHEC"),rs.getString("DOT"),rs.getString("BEAUTY")
								,rs.getString("MODE"),rs.getString("NATURA"),rs.getString("CONSERVA"),rs.getString("COOL")
								,rs.getString("LOWsHEIGHT"),rs.getString("MENS"),rs.getString("LOWPRICE"),rs.getString("MONOTONE")
								,rs.getString("SKEWAVE"),rs.getString("SKESTRAIGHT"),rs.getString("SKENATURAL"),rs.getString("REPEAT")};
						poster.setTag(tag1);
						poster.setImg(rs.getString("IMAGE"));

						searchList.add(poster);

					}
		}

		catch (SQLException e) {
			e.printStackTrace();
			searchList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			searchList = null;
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
		return searchList;
	}

	// 詳細画面用の検索メソッド
		public List<Registers> select(String key) {
		Connection conn = null;
		List<Registers> postList = new ArrayList<Registers>();	//resultsetをArrayListに入れ直して返す

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");


				// SQL文を準備する
				String sql = "select * from REGISTER where id=? ";

				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setString(1, key);

				// SQL文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();

				// 結果表をコレクションにコピーする
				while (rs.next()) {
					//引数がありのRegistersメソッドを動かしている。
					Registers poster = new Registers();
					poster.setId(rs.getString("ID"));
					String[] clothes = {rs.getString("OUTER"),rs.getString("TOPS"),
							rs.getString("BOTTOMS"),rs.getString("DRESS"),rs.getString("SOCKS"),
							rs.getString("SHOES"),rs.getString("ACCE")};
					poster.setClothes(clothes);
				    poster.setSubTops(rs.getString("SUBTOPS"));
					poster.setSubOuter(rs.getString("SUBOUTER"));
					poster.setSubBottoms(rs.getString("SUBBOTTOMS"));
					poster.setSubDress(rs.getString("SUBDRESS"));
					poster.setSubShoes(rs.getString("SUBSHOES"));
					poster.setSubAcce(rs.getString("SUBACCE"));
					String[] tag = {rs.getString("SPRING"),rs.getString("SUMMER"),rs.getString("AUTUM"),
							rs.getString("WINTER"),rs.getString("CUTE"),rs.getString("CASUAL"),rs.getString("SIMPLE")
							,rs.getString("STRIPE"),rs.getString("CHEC"),rs.getString("DOT"),rs.getString("BEAUTY")
							,rs.getString("MODE"),rs.getString("NATURA"),rs.getString("CONSERVA"),rs.getString("COOL")
							,rs.getString("LOWHEIGHT"),rs.getString("MENS"),rs.getString("LOWPRICE"),rs.getString("MONOTONE")
							,rs.getString("SKEWAVE"),rs.getString("SKESTRAIGHT"),rs.getString("SKENATURAL"),rs.getString("REPEAT")};
					poster.setTag(tag);
					poster.setImg(rs.getString("IMAGE"));
					poster.setImg(rs.getString("INSERT_DATE"));
					poster.setGender(rs.getString("GENDER"));
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

			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6Data/data", "sa", "sa");


			// SQL文を準備する
			String sql = "insert into REGISTER (OUTER, TOPS, BOTTOMS, DRESS, SOCKS, SHOES, ACCE, SUBOUTER,"
					+ " SUBTOPS, SUBBOTTOMS, SUBDRESS, SUBSHOES, SUBACCE,  SPRING, SUMMER, AUTUM, WINTER,"
					+ " CUTE, CASUAL, SIMPLE, STRIPE, CHEC, DOT, BEAUTY, MODE, NATURA, CONSERVA,"
					+ " COOL, LOWHEIGHT, MENS, LOWPRICE, MONOTONE, SKEWAVE, SKESTRAIGHT, SKENATURAL, REPEAT, IMAGE,GENDER,INSERT_DATE)"
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ 		  "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+		  "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+         "?, ?, ?, ?, ?, ?, ?, ?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる

			//pStmt.setString(1,postlist.getId());
//			pStmt.setString(2,postlist.getClothes());
			pStmt.setString(8,postlist.getSubOuter());
			pStmt.setString(9,postlist.getSubTops());
			pStmt.setString(10,postlist.getSubBottoms());
			pStmt.setString(11,postlist.getSubDress());
			pStmt.setString(12,postlist.getSubShoes());
			pStmt.setString(13,postlist.getSubAcce());
//			pStmt.setString(9,postlist.getTag());
			pStmt.setString(37,postlist.getImg());
			pStmt.setString(38,postlist.getGender());
			pStmt.setDate(39,Date.valueOf(LocalDate.now()));

			for(String n: postlist.getClothes()) {
				if(n.equals("outer")) {
					pStmt.setString(1,"1");
					break;
				}else {
					pStmt.setString(1,"0");
				}
			}
			for(String a: postlist.getClothes()) {
				if(a.equals("tops")) {
					pStmt.setString(2,"1");
					break;
				}else {
					pStmt.setString(2,"0");
				}
			}
				for(String b: postlist.getClothes()) {
				if(b.equals("bottoms")) {
					pStmt.setString(3,"1");
					break;
				}else {
					pStmt.setString(3,"0");
				}
			}
				for(String c: postlist.getClothes()) {
				if(c.equals("dress")) {
					pStmt.setString(4,"1");
					break;
				}else {
					pStmt.setString(4,"0");
				}
			}
				for(String d: postlist.getClothes()) {
				if(d.equals("socks")) {
					pStmt.setString(5,"1");
					break;
				}else {
					pStmt.setString(5,"0");
				}
			}
				for(String e: postlist.getClothes()) {
				if(e.equals("shoes")) {
					pStmt.setString(6,"1");
					break;
				}else {
					pStmt.setString(6,"0");
				}
			}
				for(String f: postlist.getClothes()) {
				if(f.equals("acce")) {
					pStmt.setString(7,"1");
					break;
				}else {
					pStmt.setString(7,"0");
				}
			}
//
//
//
//			pStmt.setString(9,postlist.getCoat());
//
//			pStmt.setString(10,postlist.getJacket());
//
//			pStmt.setString(11,postlist.getShirt());
//
//			pStmt.setString(12,postlist.getPolo());
//
//			pStmt.setString(13,postlist.getKnit());
//
//			pStmt.setString(14,postlist.getVest());
//
//			pStmt.setString(15,postlist.getCardigan());
//
//			pStmt.setString(16,postlist.getStraight());
//
//			pStmt.setString(17,postlist.getSlacks());
//
//			pStmt.setString(18,postlist.getTapered());
//
//			pStmt.setString(19,postlist.getSkinny());
//
//			pStmt.setString(20,postlist.getChino());
//
//			pStmt.setString(21,postlist.getLongskirt());
//
//			pStmt.setString(22,postlist.getShirtdress());
//
//			pStmt.setString(23,postlist.getJumperdress());
//
//			pStmt.setString(24,postlist.getKneedress());
//
//			pStmt.setString(25,postlist.getPumps());
//
//			pStmt.setString(26,postlist.getLoafre());
//
//			pStmt.setString(27,postlist.getSneaker());
//
//			pStmt.setString(28,postlist.getBoots());
//
//			pStmt.setString(29,postlist.getSlip());
//
//			pStmt.setString(30,postlist.getNecllace());
//
//			pStmt.setString(31,postlist.getPiercr());
//
//			pStmt.setString(32,postlist.getEarring());
//
//			pStmt.setString(33,postlist.getBelt());
//
//
			for(String g: postlist.getTag()) {
				if(g.equals("spring")) {
					pStmt.setString(14,"1");
					break;
				}else {
					pStmt.setString(14,"0");
				}
			}
			for(String h: postlist.getTag()) {
				if(h.equals("summer")) {
					pStmt.setString(15,"1");
					break;
				}else {
					pStmt.setString(15,"0");
				}
			}
			for(String i: postlist.getTag()) {
				if(i.equals("autum")) {
					pStmt.setString(16,"1");
					break;
				}else {
					pStmt.setString(16,"0");
				}
			}
			for(String j: postlist.getTag()) {
				if(j.equals("winter")) {
					pStmt.setString(17,"1");
					break;
				}else {
					pStmt.setString(17,"0");
				}
			}
			for(String k: postlist.getTag()) {
				if(k.equals("cute")) {
					pStmt.setString(18,"1");
					break;
				}else {
					pStmt.setString(18,"0");
				}
			}
			for(String l: postlist.getTag()) {
				if(l.equals("casual")) {
					pStmt.setString(19,"1");
					break;
				}else {
					pStmt.setString(19,"0");
				}
			}
			for(String m: postlist.getTag()) {
				if(m.equals("simple")) {
					pStmt.setString(20,"1");
					break;
				}else {
					pStmt.setString(20,"0");
				}
			}
			for(String o: postlist.getTag()) {
				if(o.equals("stripe")) {
					pStmt.setString(21,"1");
					break;
				}else {
					pStmt.setString(21,"0");
				}
			}
			for(String p: postlist.getTag()) {
				if(p.equals("check")) {
					pStmt.setString(22,"1");
					break;
				}else {
					pStmt.setString(22,"0");
				}
			}
			for(String q: postlist.getTag()) {
				if(q.equals("dot")) {
					pStmt.setString(23,"1");
					break;
				}else {
					pStmt.setString(23,"0");
				}
			}
			for(String r: postlist.getTag()) {
				if(r.equals("beauty")) {
					pStmt.setString(24,"1");
					break;
				}else {
					pStmt.setString(24,"0");
				}
			}
			for(String s: postlist.getTag()) {
				if(s.equals("mode")) {
					pStmt.setString(25,"1");
					break;
				}else {
					pStmt.setString(25,"0");
				}
			}
			for(String t: postlist.getTag()) {
				if(t.equals("natural")) {
					pStmt.setString(26,"1");
					break;
				}else {
					pStmt.setString(26,"0");
				}
			}
			for(String u: postlist.getTag()) {
				if(u.equals("conserva")) {
					pStmt.setString(27,"1");
					break;
				}else {
					pStmt.setString(27,"0");
				}
			}
			for(String v: postlist.getTag()) {
				if(v.equals("cool")) {
					pStmt.setString(28,"1");
					break;
				}else {
					pStmt.setString(28,"0");
				}
			}
			for(String w: postlist.getTag()) {
				if(w.equals("lowheight")) {
					pStmt.setString(29,"1");
					break;
				}else {
					pStmt.setString(29,"0");
				}
			}
			for(String x: postlist.getTag()) {
				if(x.equals("mens")) {
					pStmt.setString(30,"1");
					break;
				}else {
					pStmt.setString(30,"0");
				}
			}
			for(String z: postlist.getTag()) {
				if(z.equals("lowprice")) {
					pStmt.setString(31,"1");
					break;
				}else {
					pStmt.setString(31,"0");
				}
			}
			for(String aa: postlist.getTag()) {
				if(aa.equals("monotone")) {
					pStmt.setString(32,"1");
					break;
				}else {
					pStmt.setString(32,"0");
				}
			}
			for(String bb: postlist.getTag()) {
				if(bb.equals("skewave")) {
					pStmt.setString(33,"1");
					break;
				}else {
					pStmt.setString(33,"0");
				}
			}
			for(String cc: postlist.getTag()) {
				if(cc.equals("skestraight")) {
					pStmt.setString(34,"1");
					break;
				}else {
					pStmt.setString(34,"0");
				}
			}
			for(String dd: postlist.getTag()) {
				if(dd.equals("skenatural")) {
					pStmt.setString(35,"1");
					break;
				}else {
					pStmt.setString(35,"0");
				}
			}
			for(String ee: postlist.getTag()) {
				if(ee.equals("repeat")) {
					pStmt.setString(36,"1");
					break;
				}else {
					pStmt.setString(36,"0");
				}
			}

//			pStmt.setString(57,postlist.getImg());
//
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
//	public boolean update(Registers postlist) {
//		Connection conn = null;
//		boolean result = false;
//
//		try {
//			// JDBCドライバを読み込む
//			Class.forName("org.h2.Driver");
//
//			// データベースに接続する
//			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data", "sa", "sa");
//
//			// SQL文を準備する
//			String sql = "update REGISTER set (ID,OUTER,TOPS,BOTTOMS,DRESS,SOCKS,SHOSE,ACCE"
//					+ "COAT,JACKET,SHIRT,POLO,KNIT,VEST,CARDIGAN,STRAIGHT,SLACKS,TAPERED,SKINNY,CHINO"
//					+ "LONG,SHIRTDRESS,JUMPERDRESS,KNEEDRESS,PUMPS,LOAFRE,SNEAKER,BOOTS,SLIP,NECLLACE"
//					+ "PIERCR,EARRING,BELT,SPRIPNG,SUMMER,AUTUM"
//					+ "WINTER,CUTE,CASUAL,SIMPLE,STRIPE,CHEC,DOT,BEAUTY,MODE,NATURA,CONSERVA,COOL,LOWHEIGHT"
//					+ "MENS,LOWPRICE,MONOTONE,SKEWAVE,SKESTRAIGHT,SKENATURAL,REPEAT,Img)"
//					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?)";
//			PreparedStatement pStmt = conn.prepareStatement(sql);
//
//			// SQL文を完成させる
//			if (postlist.getId() != null && !postlist.getId().equals("")) {
//			pStmt.setString(1,postlist.getId());
//			}
//			else {
//				pStmt.setString(1, null);
//			}
//
//			if (postlist.getOuter() != 0) {
//			pStmt.setInt(2,postlist.getOuter());
//			}
//			else {
//				pStmt.setString(2, null);
//			}
//
//			if (postlist.getTops() != null && !postlist.getTops().equals("")) {
//			pStmt.setString(3,postlist.getTops());
//			}
//			else {
//				pStmt.setString(3, null);
//			}
//
//			if (postlist.getBottoms() != null && !postlist.getBottoms().equals("")) {
//			pStmt.setString(4,postlist.getBottoms());
//			}
//			else {
//				pStmt.setString(4, null);
//			}
//
//			if (postlist.getDress() != null && !postlist.getDress().equals("")) {
//			pStmt.setString(5,postlist.getDress());
//			}
//			else {
//				pStmt.setString(5, null);
//			}
//
//			if (postlist.getSocks() != null && !postlist.getSocks().equals("")) {
//			pStmt.setString(6,postlist.getSocks());
//			}
//			else {
//				pStmt.setString(6, null);
//			}
//
//			if (postlist.getShose() != null && !postlist.getShose().equals("")) {
//			pStmt.setString(7,postlist.getShose());
//			}
//			else {
//				pStmt.setString(7, null);
//			}
//
//			if (postlist.getAcce() != null && !postlist.getAcce().equals("")) {
//			pStmt.setString(8,postlist.getAcce());
//			}
//			else {
//				pStmt.setString(8, null);
//			}
//
//			if (postlist.getCoat() != null && !postlist.getCoat().equals("")) {
//			pStmt.setString(9,postlist.getCoat());
//			}
//			else {
//				pStmt.setString(9, null);
//			}
//
//			if (postlist.getJacket() != null && !postlist.getJacket().equals("")) {
//			pStmt.setString(10,postlist.getJacket());
//			}
//			else {
//				pStmt.setString(10, null);
//			}
//
//			if (postlist.getShirt() != null && !postlist.getShirt().equals("")) {
//			pStmt.setString(11,postlist.getShirt());
//			}
//			else {
//				pStmt.setString(11, null);
//			}
//
//			if (postlist.getPolo() != null && !postlist.getPolo().equals("")) {
//			pStmt.setString(12,postlist.getPolo());
//			}
//			else {
//				pStmt.setString(12, null);
//			}
//
//			if (postlist.getKnit() != null && !postlist.getKnit().equals("")) {
//			pStmt.setString(13, postlist.getKnit());
//			}
//			else {
//				pStmt.setString(13, null);
//			}
//
//			if (postlist.getVest() != null && !postlist.getVest().equals("")) {
//			pStmt.setString(14,postlist.getVest());
//			}
//			else {
//				pStmt.setString(14, null);
//			}
//
//			if (postlist.getCardigan() != null && !postlist.getCardigan().equals("")) {
//			pStmt.setString(15,postlist.getCardigan());
//			}
//			else {
//				pStmt.setString(15, null);
//			}
//
//			if (postlist.getStraight() != null && !postlist.getStraight().equals("")) {
//			pStmt.setString(16,postlist.getStraight());
//			}
//			else {
//				pStmt.setString(16, null);
//			}
//
//			if (postlist.getSlacks() != null && !postlist.getSlacks().equals("")) {
//			pStmt.setString(17,postlist.getSlacks());
//			}
//			else {
//				pStmt.setString(17, null);
//			}
//
//			if (postlist.getTapered() != null && !postlist.getTapered().equals("")) {
//			pStmt.setString(18,postlist.getTapered());
//			}
//			else {
//				pStmt.setString(18, null);
//			}
//
//			if (postlist.getSkinny() != null && !postlist.getSkinny().equals("")) {
//			pStmt.setString(19,postlist.getSkinny());
//			}
//			else {
//				pStmt.setString(19, null);
//			}
//
//			if (postlist.getChino() != null && !postlist.getChino().equals("")) {
//			pStmt.setString(20,postlist.getChino());
//			}
//			else {
//				pStmt.setString(20, null);
//			}
//
//			if (postlist.getLongskirt() != null && !postlist.getLongskirt().equals("")) {
//			pStmt.setString(21,postlist.getLongskirt());
//			}
//			else {
//				pStmt.setString(21, null);
//			}
//
//			if (postlist.getShirtdress() != null && !postlist.getShirtdress().equals("")) {
//			pStmt.setString(22,postlist.getShirtdress());
//			}
//			else {
//				pStmt.setString(22, null);
//			}
//
//			if (postlist.getJumperdress() != null && !postlist.getJumperdress().equals("")) {
//			pStmt.setString(23,postlist.getJumperdress());
//			}
//			else {
//				pStmt.setString(23, null);
//			}
//
//			if (postlist.getKneedress() != null && !postlist.getKneedress().equals("")) {
//			pStmt.setString(24,postlist.getKneedress());
//			}
//			else {
//				pStmt.setString(24, null);
//			}
//
//			if (postlist.getPumps() != null && !postlist.getPumps().equals("")) {
//			pStmt.setString(25,postlist.getPumps());
//			}
//			else {
//				pStmt.setString(25, null);
//			}
//
//			if (postlist.getLoafre() != null && !postlist.getLoafre().equals("")) {
//			pStmt.setString(26,postlist.getLoafre());
//			}
//			else {
//				pStmt.setString(26, null);
//			}
//
//			if (postlist.getSneaker() != null && !postlist.getSneaker().equals("")) {
//			pStmt.setString(27,postlist.getSneaker());
//			}
//			else {
//				pStmt.setString(27, null);
//			}
//
//			if (postlist.getBoots() != null && !postlist.getBoots().equals("")) {
//			pStmt.setString(28,postlist.getBoots());
//			}
//			else {
//				pStmt.setString(28, null);
//			}
//
//			if (postlist.getSlip() != null && !postlist.getSlip().equals("")) {
//			pStmt.setString(29,postlist.getSlip());
//			}
//			else {
//				pStmt.setString(29, null);
//			}
//
//			if (postlist.getNecllace() != null && !postlist.getNecllace().equals("")) {
//			pStmt.setString(30,postlist.getNecllace());
//			}
//			else {
//				pStmt.setString(30, null);
//			}
//
//			if (postlist.getPiercr() != null && !postlist.getPiercr().equals("")) {
//			pStmt.setString(31,postlist.getPiercr());
//			}
//			else {
//				pStmt.setString(31, null);
//			}
//
//			if (postlist.getEarring() != null && !postlist.getEarring().equals("")) {
//			pStmt.setString(32,postlist.getEarring());
//			}
//			else {
//				pStmt.setString(32, null);
//			}
//
//			if (postlist.getBelt() != null && !postlist.getBelt().equals("")) {
//			pStmt.setString(33,postlist.getBelt());
//			}
//			else {
//				pStmt.setString(33, null);
//			}
//
//			if (postlist.getSpring() != null && !postlist.getSpring().equals("")) {
//			pStmt.setString(34,postlist.getSpring());
//			}
//			else {
//				pStmt.setString(34, null);
//			}
//
//			if (postlist.getSummer() != null && !postlist.getSummer().equals("")) {
//			pStmt.setString(35,postlist.getSummer());
//			}
//			else {
//				pStmt.setString(35, null);
//			}
//
//			if (postlist.getAutum() != null && !postlist.getAutum().equals("")) {
//			pStmt.setString(36,postlist.getAutum());
//			}
//			else {
//				pStmt.setString(36, null);
//			}
//
//			if (postlist.getWinter() != null && !postlist.getWinter().equals("")) {
//			pStmt.setString(37,postlist.getWinter());
//			}
//			else {
//				pStmt.setString(37, null);
//			}
//
//			if (postlist.getCute() != null && !postlist.getCute().equals("")) {
//			pStmt.setString(38,postlist.getCute());
//			}
//			else {
//				pStmt.setString(38, null);
//			}
//
//			if (postlist.getCasual() != null && !postlist.getCasual().equals("")) {
//			pStmt.setString(39,postlist.getCasual());
//			}
//			else {
//				pStmt.setString(39, null);
//			}
//
//			if (postlist.getSimple() != null && !postlist.getSimple().equals("")) {
//			pStmt.setString(40,postlist.getSimple());
//			}
//			else {
//				pStmt.setString(40, null);
//			}
//
//			if (postlist.getStripe() != null && !postlist.getStripe().equals("")) {
//			pStmt.setString(41,postlist.getStripe());
//			}
//			else {
//				pStmt.setString(41, null);
//			}
//
//			if (postlist.getCheck() != null && !postlist.getCheck().equals("")) {
//			pStmt.setString(42,postlist.getCheck());
//			}
//			else {
//				pStmt.setString(42, null);
//			}
//
//			if (postlist.getDot() != null && !postlist.getDot().equals("")) {
//			pStmt.setString(43, postlist.getDot());
//			}
//			else {
//				pStmt.setString(43, null);
//			}
//
//			if (postlist.getBeauty() != null && !postlist.getBeauty().equals("")) {
//			pStmt.setString(44,postlist.getBeauty());
//			}
//			else {
//				pStmt.setString(44, null);
//			}
//
//			if (postlist.getMode() != null && !postlist.getMode().equals("")) {
//			pStmt.setString(45, postlist.getMode());
//			}
//			else {
//				pStmt.setString(45, null);
//			}
//
//			if (postlist.getNatural() != null && !postlist.getNatural().equals("")) {
//			pStmt.setString(46,postlist.getNatural());
//			}
//			else {
//				pStmt.setString(46, null);
//			}
//
//			if (postlist.getConserva() != null && !postlist.getConserva().equals("")) {
//			pStmt.setString(47, postlist.getConserva());
//			}
//			else {
//				pStmt.setString(47, null);
//			}
//
//			if (postlist.getCool() != null && !postlist.getCool().equals("")) {
//			pStmt.setString(48,postlist.getCool());
//			}
//			else {
//				pStmt.setString(48, null);
//			}
//
//			if (postlist.getLowheight() != null && !postlist.getLowheight().equals("")) {
//			pStmt.setString(49,postlist.getLowheight());
//			}
//			else {
//				pStmt.setString(49, null);
//			}
//
//			if (postlist.getMens() != null && !postlist.getMens().equals("")) {
//			pStmt.setString(50,postlist.getMens());
//			}
//			else {
//				pStmt.setString(50, null);
//			}
//
//			if (postlist.getLowprice() != null && !postlist.getLowprice().equals("")) {
//			pStmt.setString(51,postlist.getLowprice());
//			}
//			else {
//				pStmt.setString(51, null);
//			}
//
//			if (postlist.getMonotone() != null && !postlist.getMonotone().equals("")) {
//			pStmt.setString(52,postlist.getMonotone());
//			}
//			else {
//				pStmt.setString(52, null);
//			}
//
//			if (postlist.getSkewave() != null && !postlist.getSkewave().equals("")) {
//			pStmt.setString(53,postlist.getSkewave());
//			}
//			else {
//				pStmt.setString(53, null);
//			}
//
//			if (postlist.getSkestraight() != null && !postlist.getSkestraight().equals("")) {
//			pStmt.setString(54,postlist.getSkestraight());
//			}
//			else {
//				pStmt.setString(54, null);
//			}
//
//			if (postlist.getSkenatural() != null && !postlist.getSkenatural().equals("")) {
//			pStmt.setString(55,postlist.getSkenatural());
//			}
//			else {
//				pStmt.setString(55, null);
//			}
//
//			if (postlist.getRepeat() != null && !postlist.getRepeat().equals("")) {
//			pStmt.setString(56,postlist.getRepeat());
//			}
//			else {
//				pStmt.setString(56, null);
//			}
//
//			if (postlist.getImg() != null && !postlist.getImg().equals("")) {
//			pStmt.setString(57,postlist.getImg());
//			}
//			else {
//				pStmt.setString(57, null);
//			}
//
//
//			// SQL文を実行する
//			if (pStmt.executeUpdate() == 1) {
//				result = true;
//			}
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//		catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			// データベースを切断
//			if (conn != null) {
//				try {
//					conn.close();
//				}
//				catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		// 結果を返す
//		return result;
//	}
//
//	// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
//	public boolean delete(String id) {
//		Connection conn = null;
//		boolean result = false;
//
//		try {
//			// JDBCドライバを読み込む
//			Class.forName("org.h2.Driver");
//
//			// データベースに接続する
//			conn = DriverManager.getConnection("jdbc:h2:file:C:/dojo6/data", "sa", "sa");
//
//			// SQL文を準備する
//			String sql = "delete from REGISTER where ID=?";
//			PreparedStatement pStmt = conn.prepareStatement(sql);
//
//			// SQL文を完成させる
//			pStmt.setString(1, id);
//
//			// SQL文を実行する
//			if (pStmt.executeUpdate() == 1) {
//				result = true;
//			}
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//		catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			// データベースを切断
//			if (conn != null) {
//				try {
//					conn.close();
//				}
//				catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		// 結果を返す
//		return result;
//	}

}