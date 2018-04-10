package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class UserUpdate
 */
@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// フォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userUpdate.jsp");
				dispatcher.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");

		 // リクエストパラメータの入力項目を取得
		    String loginId = request.getParameter("loginId");
			String userName = request.getParameter("userName");
			String pass = request.getParameter("pass");
			String passConfirm = request.getParameter("passConfirm");
		    String profile = request.getParameter("profile");
		    String id = request.getParameter("id");



			 boolean check = UserDao.userUpdate(loginId,userName,pass,passConfirm,profile,id);


		        if(check) {
		        	response.sendRedirect("UserUpdateResult");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userUpdate.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}


}
