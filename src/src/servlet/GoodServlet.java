package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Goods;

/**
 * Servlet implementation class GoodServlet
 */
@WebServlet("/GoodServlet")
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/good.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");


		// 送信されたデータの取得
		String id = request.getParameter("id");
		String clothesID = request.getParameter("clothesID");
		String uID = request.getParameter("uID");
		//確認するため
		System.out.println(id);

		//ArrayListをインスタンス化
		ArrayList<Goods> list = new ArrayList<>();


//		//文字コードの設定（めんどいのでコピペでOK）
//		response.setContentType("application/json");
//		response.setHeader("Cache-Control", "nocache");
//		response.setCharacterEncoding("utf-8");
//
//		//JSPに返却する値を作成する。値はoutの中に格納する
//		PrintWriter out = response.getWriter();
//		//outの中に持ってきたデータを連結したものを入れる
//		//勝手にJSPに渡り、dataという名前で使用することができる
//		out.print(data1+","+data2+","+data3);
//
//        return;
	}

}

