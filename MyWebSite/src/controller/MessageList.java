package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import beans.User;
import dao.QuestionDao;

/**
 * Servlet implementation class MessageList
 */
@WebServlet("/MessageList")
public class MessageList extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ログインセッションがない場合、メンターログイン画面に遷移させる
		HttpSession sessions = request.getSession();

		User userse = (User)sessions.getAttribute("userInfo");


		if(userse == null) {
			response.sendRedirect("MentorLogin");

			return;
		}

		// メッセージ一覧情報を取得
		QuestionDao questionDao = new QuestionDao();
		List<Question> messageList = questionDao.findMessage();

		// リクエストスコープにメッセージ一覧情報をセット
		request.setAttribute("messageList", messageList);

		// message覧のjspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/messageList.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}