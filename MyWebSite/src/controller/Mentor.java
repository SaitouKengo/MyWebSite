package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		    String subject = request.getParameter("subject");
			String question = request.getParameter("question");
			String questionDate = request.getParameter("questionDate");

			 boolean check = QuestionDao.messageInsert(userId,mentorId,subject,question,questionDate);


		        if(check) {
		        	response.sendRedirect("UserInfo");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentor.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}

		}