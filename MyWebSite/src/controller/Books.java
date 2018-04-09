package controller;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/Books")
public class Books extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Books() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 書籍一覧情報を取得
		BooksDao booksDao = new BooksDao();
		List<beans.Books> bookList = booksDao.findAll();

		// リクエストスコープにユーザ一覧情報をセット
		request.setAttribute("bookList", bookList);

		 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/books.jsp");
         dispatcher.forward(request,response);

}

}
