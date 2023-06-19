package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import model.Registers;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search.jsp");
		dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		//なにするのかをどんどん書いていく(コメントアウト)
		// とりあえず現状は自由記入以外でなら検索引っかかるようにしてます
		// registerDaoが空なのでエラー吐きます

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String gender = request.getParameter("gender");
		String clothes = request.getParameter("clothes");
		String tag = request.getParameter("tag");
		String search = request.getParameter("search");

		// 検索処理を行う（投稿されたものの中から捜索）
		RegisterDao rDao = new RegisterDao();
		List<Registers> searchList = rDao.select(new Registers());


		// 検索結果をリクエストスコープに格納する
		request.setAttribute("searchList", searchList);

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search_result.jsp");
		dispatcher.forward(request, response);


	}

}
