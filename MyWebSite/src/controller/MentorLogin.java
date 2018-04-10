package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import dao.UserDao;


@WebServlet("/MentorLogin")
public class MentorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public MentorLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorLogin.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");


		UserDao userDao = new UserDao();
		User user = userDao.findByLoginInfo(loginId, password);


		if (user == null) {

			request.setAttribute("errMsg", "ログインIDまたはパスワードが異なります");


			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorLogin.jsp");
			dispatcher.forward(request, response);
			return;
		}


		HttpSession session = request.getSession();
		session.setAttribute("userInfo", user);


		response.sendRedirect("MessageList");

	}

}