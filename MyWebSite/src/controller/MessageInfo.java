package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import dao.QuestionDao;

/**
 * Servlet implementation class MessageInfo
 */
@WebServlet("/MessageInfo")
public class MessageInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageInfo() {
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
		    QuestionDao questionDao = new QuestionDao();
		    Question detailQuestion = questionDao.findByQuestionInfo(detailId);

		    request.setAttribute("detailQuestion", detailQuestion);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/messageInfo.jsp");
            dispatcher.forward(request,response);
            return;
	    }

	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");




		 //リクエストパラメータの入力項目を取得
		 String reply = request.getParameter("reply");
		 String id = request.getParameter("id");



			 boolean check = QuestionDao.replyInsert(reply,id);


		        if(check) {
		        	response.sendRedirect("Reply");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/messageInfo.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }
			}
		}