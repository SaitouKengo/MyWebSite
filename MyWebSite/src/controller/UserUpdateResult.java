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

/**
 * Servlet implementation class UserUpdateResult
 */
@WebServlet("/UserUpdateResult")
public class UserUpdateResult extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public UserUpdateResult() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    	//ログインセッションがない場合、ログイン画面に遷移させる
		HttpSession sessions = request.getSession();

		User userse = (User)sessions.getAttribute("userInfo");


		if(userse == null) {
			response.sendRedirect("Login");

			return;
		}

    	// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userUpdateResult.jsp");
		dispatcher.forward(request, response);
	}
}