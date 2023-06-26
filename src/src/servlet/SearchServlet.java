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
		// 検索ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//なにするのかをどんどん書いていく(コメントアウト)
		// とりあえず現状は自由記入以外でなら検索引っかかるようにしてます
		// registerDaoが空なのでエラー吐きます

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String gender = request.getParameter("gender");
		String[] item = request.getParameterValues("clothes");
		String subOuter = request.getParameter("sub_outer");
		String subTops = request.getParameter("sub_tops");
		String subBottoms = request.getParameter("sub_bottoms");
		String subDress = request.getParameter("sub_dress");
		String subShoes = request.getParameter("sub_shoes");
		String subAcce = request.getParameter("sub_acce");
		String[] tag = new String[1];
		tag[0]= "test";
		if(request.getParameterValues("tag")!=null) {
			tag = request.getParameterValues("tag");
		}
		/*System.out.println(tag.length+"aaaaaaaaaaaaaaaaa");*/



		// 検索処理を行う（投稿されたものの中から捜索）
		RegisterDao rDao = new RegisterDao();
		List<Registers> searchList = rDao.searchSelect(id,gender,item,subOuter,subTops,subBottoms,subDress,subShoes,subAcce,tag);

		/*System.out.println(searchList.size()+"aaaaaa");*/
		// 検索結果をリクエストスコープに格納する
		request.setAttribute("searchList", searchList);

		// 検索ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("//WEB-INF/jsp/search_result.jsp");
		dispatcher.forward(request, response);

	}

}
