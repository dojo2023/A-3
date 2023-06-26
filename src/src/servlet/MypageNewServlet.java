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

import dao.UsersDao;
import model.Result;
import model.Users;

/**
 * Servlet implementation class MypageNewServlet
 */
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\UploadPhoto") // アップロードファイルの一時的な保存先
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



		//なにするのかをどんどん書いていく(コメントアウト)
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String address= request.getParameter("address");
		String birth= request.getParameter("birth");
		String height= request.getParameter("height");
		String weight= request.getParameter("weight");
		String management= request.getParameter("management");

		//画像アップロード
				Part part = request.getPart("img"); // getPartで取得
				String img = this.getImg(part);
				request.setAttribute("img", img);
				// サーバの指定のファイルパスへファイルを保存
		        //場所はクラス名↑の上に指定してある
				part.write(img);
		// ユーザー情報の登録処理を行う
		UsersDao uDao = new UsersDao();
		Users user = new Users(id, pw,name,email,gender,address,birth,height,weight,management, img);
		if (uDao.insert(user)) {
			request.setAttribute("result",
			new Result("登録成功！", "レコードを登録しました。", "/TRex/TopServlet"));
						}
						else {												// 登録失敗
							request.setAttribute("result",
							new Result("登録失敗！", "レコードを登録できませんでした。", "/TRex/TopServlet"));
						}

						// 結果ページにフォワードする
						RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
						dispatcher.forward(request, response);
	}
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
