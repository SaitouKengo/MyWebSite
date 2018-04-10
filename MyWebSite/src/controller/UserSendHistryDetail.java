package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import dao.QuestionDao;


@WebServlet("/UserSendHistryDetail")

public class UserSendHistryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// メッセージ一覧情報を取得
				QuestionDao questionDao = new QuestionDao();
				List<Question> messageList = questionDao.findMessage();

				// リクエストスコープにメッセージ一覧情報をセット
				request.setAttribute("messageList", messageList);

				// message覧のjspにフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/usersendhistrydetail.jsp");
				dispatcher.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
}