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
@MultipartConfig(location = "C:\\pleiades\\workspace\\Nyample\\WebContent\\images") // アップロードファイルの一時的な保存先
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
		String ID= request.getParameter("ID");
		//アイテムカテゴリ
		String OUTER= request.getParameter("OUTER");
		String TOPS= request.getParameter("TOPS");
		String BOTTOMS= request.getParameter("BOTTOMS");
		String DRESS= request.getParameter("DRESS");
		String SOCKS= request.getParameter("SOCKS");
		String SHOSE= request.getParameter("SHOSE");
		String ACCE= request.getParameter("ACCE");

		//サブカテゴリ
		//アウター
		String COAT= request.getParameter("COAT");
		String JACKET= request.getParameter("JACKET");
		//トップス
		String SHIRT= request.getParameter("SHIRT");
		String BROWSE= request.getParameter("BROWSE");
		String POLOSHIRT= request.getParameter("POLOSHIRT");
		String KNIT= request.getParameter("KNIT");
		String SWEATER= request.getParameter("SWEATER");
		String VEST= request.getParameter("VEST");
		String CARDIGAN= request.getParameter("CARDIGAN");
		//ボトムス
		String STRAIGHTPANTS= request.getParameter("STRAIGHTPANTS");
		String SLACKS= request.getParameter("SLACKS");
		String TAPEREDPANTS= request.getParameter("TAPEREDPANTS");
		String SKINNYPANTS= request.getParameter("SKINNYPANTS");
		String CHINOPANTS= request.getParameter("CHINOPANTS");
		String LONGSKIRT= request.getParameter("LONGSKIRT");
		//ドレス
		String SHIRTDRESS= request.getParameter("SHIRTDRESS");
		String JUMPERSKIRT= request.getParameter("JUMPERSKIRT");
		String KNEELENGTHDRESS= request.getParameter("KNEELENGTHDRESS");
		//靴
		String PUMPS= request.getParameter("PUMPS");
		String LOAFERS= request.getParameter("LOAFERS");
		String SNEAKERS= request.getParameter("SNEAKERS");
		String BOOTS= request.getParameter("BOOTS");
		//アクセサリー
		String NECKLACE= request.getParameter("NECKLACE");
		String EARRINGS= request.getParameter("EARRINGS");
		String PIERCE= request.getParameter("PIERCE");
		String BELT= request.getParameter("BELT");


		//タグ
		String SPRING= request.getParameter("SPRING");
		String SUMMER= request.getParameter("SUMMER");
		String AUTUM= request.getParameter("AUTUM");
		String WINTER= request.getParameter("WINTER");
		String CUTE= request.getParameter("CUTE");
		String CASUAL= request.getParameter("CASUAL");
		String SIMPLE= request.getParameter("SIMPLE");
		String STRIPE= request.getParameter("STRIPE");
		String CHECK= request.getParameter("CHECK");
		String DOT= request.getParameter("DOT");
		String BEAUTY= request.getParameter("BEAUTY");
		String MODE= request.getParameter("MODE");
		String NATURAL= request.getParameter("NATURAL");
		String CONSERVA= request.getParameter("CONSERVA");
		String COOL= request.getParameter("COOL");
		String LOWHEIGHT= request.getParameter("LOWHEIGHT");
		String MENS= request.getParameter("MENS");
		String LOWPRICE= request.getParameter("LOWPRICE");
		String MONOTONE= request.getParameter("MONOTONE");
		String SKEWAVWINTER= request.getParameter("WINTER");
		String SKESTRAIGHT= request.getParameter("SKESTRAIGHT");
		String SKENATURAL= request.getParameter("SKENATURAL");
		String REPEAT= request.getParameter("WINTER");
		String IMG = request.getParameter("IMG ");

		//画像アップロード
		Part part = request.getPart("IMAGE"); // getPartで取得
		String image = this.getImg(part);
		request.setAttribute("image", image);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある
		part.write(image);

		RegisterDao rDao = new RegisterDao();
		if (rDao.insert(new Registers())) {	// 登録成功
		request.setAttribute("result",
		new Registers());
		}
		else {												// 登録失敗
		request.setAttribute("result",
		new Registers());
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

	}

	private String getImg(Part part) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
