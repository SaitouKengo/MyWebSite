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


@WebServlet("/UserData")

public class UserData extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/userdata.jsp");
        dispatcher.forward(request,response);
        return;
    }


}
}

