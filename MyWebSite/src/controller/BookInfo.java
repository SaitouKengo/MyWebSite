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
import dao.BooksDao;

/**
 * Servlet implementation class Books
 */
@WebServlet("/BookInfo")
public class BookInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookInfo() {
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
		    BooksDao booksDao = new BooksDao();
		    beans.Books detailBooks = booksDao.findByBookInfo(detailId);

		    request.setAttribute("detailBooks", detailBooks);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/bookInfo.jsp");
            dispatcher.forward(request,response);
            return;
	    }

	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    				// リクエストスコープにメッセージをセット
    				request.setAttribute("cartMsg", "カートに書籍を追加しました。");

    				// Cartにフォワード
    				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp");
    	            dispatcher.forward(request,response);
    				return;
    			}

    	}


