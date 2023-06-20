package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.RegisterDao;
import model.Registers;


/**
 * Servlet implementation class RegisterServlet
 */
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\UploadPhoto") // アップロードファイルの一時的な保存先
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		request.setCharacterEncoding("UTF-8");
		//主キー
		String id= request.getParameter("ID");
		//アイテムカテゴリ
		String clothes[]=request.getParameterValues("clothes");
//		for(String n: clothes) {
//			if(n.equals("outer")) {
//				pStmt.setInt(2,1);
//			}else {
//				pStmt.setInt(2,0);
//			}
//		}
		//アウター
		String subOuter= request.getParameter("sub_outer");
		//String jacket= request.getParameter("sub_outer");
		//トップス
		String subTops= request.getParameter("sub_tops");
//		String browse= request.getParameter("BROWSE");
//		String poloshirt= request.getParameter("POLOSHIRT");
//		String knit= request.getParameter("KNIT");
//		String sweater= request.getParameter("SWEATER");
//		String vest= request.getParameter("VEST");
//		String cardigan= request.getParameter("CARDIGAN");
		//ボトムス
		String subBottoms= request.getParameter("sub_bottoms");
//		String slacks= request.getParameter("SLACKS");
//		String taperedpants= request.getParameter("TAPEREDPANTS");
//		String skinnypants= request.getParameter("SKINNYPANTS");
//		String chinopants= request.getParameter("CHINOPANTS");
//		String longskirt= request.getParameter("LONGSKIRT");
		//ドレス
		String subDress= request.getParameter("sub_dress");
//		String jumperdress= request.getParameter("JUMPERSKIRT");
//		String kneelengthdress= request.getParameter("KNEELENGTHDRESS");
		//靴
		String subShoes= request.getParameter("sub_shoes");
//		String loafers= request.getParameter("LOAFERS");
//		String sneakers= request.getParameter("SNEAKERS");
//		String boots= request.getParameter("BOOTS");
//		String slip= request.getParameter("SLIP");
		//アクセサリー
		String subAcce= request.getParameter("sub_acce");
//		String earring= request.getParameter("EARRINGS");
//		String pierce= request.getParameter("PIERCE");
//		String belt= request.getParameter("BELT");
		//タグ
		String tag[]=request.getParameterValues("tag");


		//画像アップロード
		Part part = request.getPart("IMAGE"); // getPartで取得
		String image = this.getImg(part);
		request.setAttribute("image", image);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある
		part.write(image);
		//Daoに書き直す
		//データベースも書き直す
		RegisterDao rDao = new RegisterDao();
		Registers register = new Registers( id,  clothes,  subOuter,  subTops,  subBottoms,  subDress,
				 subShoes,  subAcce, tag,  image);

		if (rDao.insert(register)) {	// 登録成功
		request.setAttribute("result",
		new Registers());
		}
		else {												// 登録失敗
		request.setAttribute("result",
		new Registers());
		}
	}
		//ファイルの名前を取得してくる
		private String getImg(Part part) {
	        String name = null;
	        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
	            if (dispotion.trim().startsWith("filename")) {
	                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
	                name = name.substring(name.lastIndexOf("\\") + 1);
	                break;
	            }
	        }		// TODO 自動生成されたメソッド・スタブ
			return name;
		}



//	private String getImg(Part part) {
		// TODO 自動生成されたメソッド・スタブ
//		return null;

}
