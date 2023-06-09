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
 * Servlet implementation class MypageEditServlet
 */
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\UploadPhoto") // アップロードファイルの一時的な保存先
@WebServlet("/MypageEditServlet")
public class MypageEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// マイページ編集ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mypage_edit.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		//なにするのかをどんどん書いていく(コメントアウト)

		// 画像アップロード
		Part part = request.getPart("image");
		//画像ファイルの名前を取得
		String img = this.getImg(part);
		request.setAttribute("img", img);
		// サーバの指定のファイルパスへファイルを保存
		// 場所はクラス名↑の上に指定してある
		part.write(img);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String height=request.getParameter("height");
		String weight=request.getParameter("weight");
		String address=request.getParameter("address");
		String birth=request.getParameter("birth");
		//Daoに書き直す
		//データベースも書き直す
		UsersDao uDao = new UsersDao();
		Users user = new Users();
		user.setImg(img);
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setHeight(height);
		user.setWeight(weight);
		user.setAddress(address);
		user.setBirth(birth);
		if (uDao.update(user)) {
			request.setAttribute("result",
			new Result("登録成功！", "レコードを登録しました。", "/TRex/MypageServlet"));
						}
						else {												// 登録失敗
							request.setAttribute("result",
							new Result("登録失敗！", "レコードを登録できませんでした。", "/TRex/MypageServlet"));
						}

		// トップページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mypage.jsp");
		dispatcher.forward(request, response);

	}
	// ファイルの名前を取得してくる
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
