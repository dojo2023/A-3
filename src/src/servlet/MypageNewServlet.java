package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// ユーザー情報の登録処理を行う
		// 登録が成功したらトップページへ遷移する
		// 登録が成功しなかったら、必須入力項目が漏れていた場合エラー表示し、パスワード欄に文字列記述があった際には
		//パスワードのみ削除

	}

}
