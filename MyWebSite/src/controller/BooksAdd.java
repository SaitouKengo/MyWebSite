package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BooksAdd
 */
@WebServlet("/BooksAdd")
public class BooksAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BooksAdd() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		try {
			//選択された商品のIDを型変換し利用
			int id = Integer.parseInt(request.getParameter("book_id"));
			//対象のアイテム情報を取得
			Books book = Books.findByBookInfo(id);

			//追加した商品を表示するためリクエストパラメーターにセット
			request.setAttribute("book", book);

			//カートを取得
			ArrayList<Books> cart = (ArrayList<Books>) session.getAttribute("cart");

			//セッションにカートがない場合カートを作成
			if (cart == null) {
				cart = new ArrayList<Books>();
			}
			//カートに商品を追加。
			cart.add(book);
			//カート情報更新
			session.setAttribute("cart", cart);
			request.setAttribute("cartActionMessage", "商品を追加しました");

		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}
	}
}