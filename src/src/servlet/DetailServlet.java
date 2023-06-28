package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GoodDao;
import dao.RegisterDao;
import model.Registers;

/**
 * Servlet implementation class DetailServlet
 */
@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
		RegisterDao rDao = new RegisterDao();
		String key= request.getParameter("key");


		//daoに対して同じIDの投稿を持ってくるよう指示
		List<Registers> list =rDao.select(key);
		//もらってきたデータをlistという名前でスコープにセット
		request.setAttribute("list",list);






		// マイページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
		dispatcher.forward(request, response);




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// 送信されたデータの取得

		// 桝井へのお願い
		// GoodテーブルのGoodIdをオートインクリメントにしろ

			String check = request.getParameter("check");
			String clothesID = request.getParameter("id");
			String uId = request.getParameter("uId");

			//DAOにゅー
			GoodDao gDao = new GoodDao();

			int ans = gDao.insertDelete(clothesID, uId, Integer.parseInt(check));

			if(ans==1) {
				System.out.println("成功");
			}
		//確認するため
			System.out.println(ans);
			System.out.println("これ見えてますか？");




			//ArrayListをインスタンス化
			//List<Goods> list = new ArrayList<>();

	}

}
