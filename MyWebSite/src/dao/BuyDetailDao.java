package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.BuyDetailData;

public class BuyDetailDao {

	public static void insertBuyDetail(BuyDetailData bdd) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();
			st = con.prepareStatement(
					"INSERT INTO buy_detail(buy_id,book_id) VALUES(?,?)");
			st.setInt(1, bdd.getBuyId());
			st.setInt(2, bdd.getBookId());
			st.executeUpdate();
			System.out.println("inserting BuyDetail has been completed");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}


	public ArrayList<BuyDetailData> getBuyDataListByBuyId(int buyId) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();

			st = con.prepareStatement("SELECT * FROM buy_detail WHERE buy_id = ?");
			st.setInt(1, buyId);

			ResultSet rs = st.executeQuery();
			ArrayList<BuyDetailData> buyDetailList = new ArrayList<BuyDetailData>();

			while (rs.next()) {
				BuyDetailData bdd = new BuyDetailData();
				bdd.setId(rs.getInt("id"));
				bdd.setBuyId(rs.getInt("buy_id"));
				bdd.setBookId(rs.getInt("book_id"));
				buyDetailList.add(bdd);
			}

			System.out.println("searching BuyDataBeansList by BuyID has been completed");
			return buyDetailList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}


}

