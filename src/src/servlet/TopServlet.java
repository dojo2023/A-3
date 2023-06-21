package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.TopimageDao;
import model.Topimages;

/**
 * Servlet implementation class TopServlet
*/
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\UploadPhoto") // アップロードファイルの一時的な保存先
@WebServlet("/TopServlet")
public class TopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TopimageDao dao = new TopimageDao();
		List<Topimages> list = dao.getTopImages();
		HttpSession session = request.getSession();
		session.setAttribute("list", list);


		// トップページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
			dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		Part part = request.getPart("IMAGE"); // getPartで取得

		String image = this.getimage(part);
		String Topimg = "./UploadPhoto/"+image;
		TopimageDao tdao = new TopimageDao();
		boolean ans =tdao.insert(image);
		if(ans
				) {
			//成功のときの処理
			ans = true;
		}else {
			//失敗のときの処理
			ans = false;
		}

		request.setAttribute("image", image);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある
		part.write(image);
        //ディスパッチ
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
		dispatcher.forward(request, response);
    }

	private String getimage(Part part) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//ファイルの名前を取得してくる
	private String getTopImg(Part part) {
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
