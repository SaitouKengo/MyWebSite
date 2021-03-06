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
import dao.QuestionDao;
import dao.UserDao;

/**
 * Servlet implementation class Mentor
 */
@WebServlet("/Mentor")
public class Mentor extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mentor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ログインセッションがない場合、ログイン画面に遷移させる
		HttpSession sessions = request.getSession();

		User userse = (User)sessions.getAttribute("userInfo");


		if(userse == null) {
			response.sendRedirect("Login");

			return;
		}


		request.setAttribute("check","");
		request.setCharacterEncoding("UTF-8");
    	    String detailId = (String)request.getParameter("id");


    	    if(detailId!=null)   {

	    	//DBからユーザーの情報を取得
		    UserDao userDao = new UserDao();
		    User detailUser = userDao.findByUserInfo(detailId);



		    request.setAttribute("detailUser", detailUser);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentor.jsp");
            dispatcher.forward(request,response);
            return;
	    }


	}




	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");



		 // リクエストパラメータの入力項目を取得
		    int userId = Integer.parseInt(request.getParameter("userId"));
			int mentorId = Integer.parseInt(request.getParameter("mentorId"));
			String userName = request.getParameter("userName");
			String mentorName = request.getParameter("mentorName");
		    String subject = request.getParameter("subject");
			String question = request.getParameter("question");


			 boolean check = QuestionDao.messageInsert(userId,mentorId,userName,mentorName,subject,question);


		        if(check) {
		        	response.sendRedirect("SendComp");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentor.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}

		}