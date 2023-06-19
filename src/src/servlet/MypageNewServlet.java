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
import model.Users;

/**
 * Servlet implementation class MypageNewServlet
 */
@WebServlet("/MypageNewServlet")
public class MypageNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 新規登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mypage_new.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		doGet(request, response);

		//なにするのかをどんどん書いていく(コメントアウト)
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("ID");
		String pw= request.getParameter("PW");
		String name= request.getParameter("NAME");
		String email= request.getParameter("EMAIL");
		String gender= request.getParameter("GENDER");
		String address= request.getParameter("ADDRESS");
		String birth= request.getParameter("BIRTH");
		String height= request.getParameter("HEIGHT");
		String weight= request.getParameter("WEIGHT");
		String management= request.getParameter("MANAGEMENT");

		// ユーザー情報の登録処理を行う
		UsersDao uDao = new UsersDao();
		if (uDao.UsersDao(new Users(id, pw,name,email,gender,address,birth,height,weight,management))) { // ログイン成功
			// セッションスコープにIDを格納する→Usersの箱を格納すればよい
			HttpSession session = request.getSession();
			session.setAttribute("id", new Users(id));
		// 登録が成功したらトップページへ遷移する
		// 登録が成功しなかったら、必須入力項目が漏れていた場合エラー表示し、パスワード欄に文字列記述があった際には
		//パスワードのみ削除

	}

	}
}
