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

/**
 * Servlet implementation class MentorUpdate
 */
@WebServlet("/MentorUpdate")
public class MentorUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ログインセッションがない場合、メンターログイン画面に遷移させる
				HttpSession sessions = request.getSession();

				User userse = (User) sessions.getAttribute("userInfo");

				if (userse == null) {
					response.sendRedirect("MentorLogin");

					return;
				}

		// フォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorUpdate.jsp");
				dispatcher.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");

		 // リクエストパラメータの入力項目を取得
		    String loginId = request.getParameter("loginId");
			String pass = request.getParameter("pass");
			String passConfirm = request.getParameter("passConfirm");
		    String profile = request.getParameter("profile");
		    String picture = request.getParameter("picture");
		    String id = request.getParameter("id");



			 boolean check = UserDao.mentorUpdate(loginId,pass,passConfirm,profile,picture,id);


		        if(check) {
		        	response.sendRedirect("MentorUpdateResult");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorUpdate.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}

		}