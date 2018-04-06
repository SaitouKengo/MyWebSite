package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;


@WebServlet("/Regist")
public class Regist extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
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


			 boolean check = UserDao.userInsert(loginId,userName,birthDate,password,passConfirm,profile);


		        if(check) {
		        	response.sendRedirect("ResistResult");

		           return;
		        }else {

		        	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/resist.jsp");
		           dispatcher.forward(request,response);
		           return;
		        }

			}

		}

