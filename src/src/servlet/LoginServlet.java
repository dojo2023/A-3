package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDao;
import model.Result;
import model.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		// リクエストパラメーターを取得する
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw =  request.getParameter("pw");

		// ログイン処理を行う
		UsersDao iDao = new UsersDao();

		Users user = iDao.login(id,pw);
		if (user!=null) { // ログイン成功
			// セッションスコープにIDを格納する→Usersの箱を格納すればよい
			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			// トップサーブレットにリダイレクトする
			response.sendRedirect("/TRex/TopServlet");
		}
		else {									// ログイン失敗
			// doGetを持ってきてアラートは表示させる
			request.setAttribute("result",
			new Result("ログイン失敗！", "IDまたはPWに間違いがあります。", "/TRex/LoginServlet"));

			// ログインページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
			dispatcher.forward(request, response);
		}

	}

}
