package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

}
