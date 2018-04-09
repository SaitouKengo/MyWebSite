package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Books;

public class BooksDao {

	 public List<Books> findAll() {
	        Connection conn = null;
	        List<Books> bookList = new ArrayList<Books>();

	        try {
	            // データベースへ接続
	            conn = DBManager.getConnection();

	            // SELECT文を準備

	            String sql = "SELECT * FROM books";

	             // SELECTを実行し、結果表を取得
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);

	            // 結果表に格納されたレコードの内容を
	            // Userインスタンスに設定し、ArrayListインスタンスに追加
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String author = rs.getString("author");
	                String book_name = rs.getString("book_name");
	                int price = rs.getInt("price");
	                String book_info = rs.getString("book_info");

	                Books books = new Books(id, author, book_name, price, book_info);

	                bookList.add(books);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        } finally {
	            // データベース切断
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    return null;
	                }
	            }
	        }
	        return bookList;
	    }


	 public Books findByBookInfo(String detailId) {
	        Connection conn = null;
	        try {
	            // データベースへ接続
	            conn = DBManager.getConnection();

	            // SELECT文を準備
	            String sql = "SELECT * FROM books WHERE id = ?";

	             // SELECTを実行し、結果表を取得
	            PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, detailId);

	            ResultSet rs = pStmt.executeQuery();


	             // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
	            if (!rs.next()) {
	                return null;
	            }


	            int id = rs.getInt("id");
	            String author = rs.getString("author");
	            String book_name = rs.getString("book_name");
	            int price = rs.getInt("price");
	            String book_info = rs.getString("book_info");

	            Books books = new Books(id, author, book_name, price, book_info);

	            return books;

	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        } finally {
	            // データベース切断
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    return null;
	                }
	            }
	        }
	    }


}
