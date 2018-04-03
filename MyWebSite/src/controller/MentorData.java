package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import dao.UserDao;

/**
 * Servlet implementation class MentorData
 */
@WebServlet("/MentorData")
public class MentorData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorData() {
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

		//DBからユーザー(メンター）の情報を取得
	    UserDao userDao = new UserDao();
	    User detailMentor = userDao.findByUserInfo(detailId);

	    request.setAttribute("detailMentor", detailMentor);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mentorData.jsp");
        dispatcher.forward(request,response);
        return;
    }


}
}