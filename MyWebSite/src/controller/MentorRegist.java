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
 * Servlet implementation class MentorRegist
 */
@WebServlet("/MentorRegist")
public class MentorRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorRegist() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorRegist.jsp");
				dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");

		 // リクエストパラメータの入力項目を取得
		    String loginId = request.getParameter("loginId");
			String userName = request.getParameter("userName");
			String birthDate = request.getParameter("birthDate");
			String password = request.getParameter("password");
			String passConfirm = request.getParameter("passConfirm");
		    String profile = request.getParameter("profile");
		    String picture = request.getParameter("picture");
		    String userType = request.getParameter("userType");


			 boolean check = UserDao.mentorInsert(loginId,userName,birthDate,password,passConfirm,profile,picture, Integer.parseInt(userType));


		        if(check) {
		        	response.sendRedirect("MentorRegistResult");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorRegist.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}


}
