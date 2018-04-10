package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import beans.BuyData;

public class BuyDao {



public static int insertBuy(BuyData bd) throws SQLException {
	Connection con = null;
	PreparedStatement st = null;
	int autoIncKey = -1;
	try {
		con = DBManager.getConnection();
		st = con.prepareStatement(
				"INSERT INTO buy(user_id,total_price,delivery_method_id,create_date) VALUES(?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		st.setInt(1, bd.getUserId());
		st.setInt(2, bd.getTotalPrice());
		st.setInt(3, bd.getDelivertMethodId());
		st.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
		st.executeUpdate();

		ResultSet rs = st.getGeneratedKeys();
		if (rs.next()) {
			autoIncKey = rs.getInt(1);
		}
		System.out.println("inserting buy-datas has been completed");

		return autoIncKey;
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		throw new SQLException(e);
	} finally {
		if (con != null) {
			con.close();
		}
	}
}


public static BuyData getBuyDataBeansByBuyId(int buyId) throws SQLException {
	Connection con = null;
	PreparedStatement st = null;
	try {
		con = DBManager.getConnection();

		st = con.prepareStatement(
				"SELECT * FROM buy"
						+ " JOIN delivery_method"
						+ " ON buy.delivery_method_id = delivery_method.id"
						+ " WHERE buy.id = ?");
		st.setInt(1, buyId);

		ResultSet rs = st.executeQuery();

		BuyData bd = new BuyData();
		if (rs.next()) {
			bd.setId(rs.getInt("id"));
			bd.setTotalPrice(rs.getInt("total_price"));
			bd.setBuyDate(rs.getTimestamp("create_date"));
			bd.setDelivertMethodId(rs.getInt("delivery_method_id"));
			bd.setUserId(rs.getInt("user_id"));
			bd.setDeliveryMethodPrice(rs.getInt("price"));
			bd.setDeliveryMethodName(rs.getString("name"));
		}

		System.out.println("searching BuyDataBeans by buyID has been completed");

		return bd;
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		throw new SQLException(e);
	} finally {
		if (con != null) {
			con.close();
		}
	}
}



public static ArrayList<BuyData> getBuyDataBeansByBuyUserId(int userId) throws SQLException {
	Connection con = null;
	PreparedStatement st = null;
	try {
		con = DBManager.getConnection();

		st = con.prepareStatement(
				"SELECT * FROM buy"
						+ " JOIN delivery_method"
						+ " ON buy.delivery_method_id = delivery_method.id"
						+ " WHERE buy.user_id = ?");
		st.setInt(1, userId);

		ResultSet rs = st.executeQuery();
		ArrayList<BuyData> buyDataList = new ArrayList<BuyData>();


		while (rs.next()) {
			BuyData bd = new BuyData();
			bd.setId(rs.getInt("id"));
			bd.setTotalPrice(rs.getInt("total_price"));
			bd.setBuyDate(rs.getTimestamp("create_date"));
			bd.setDelivertMethodId(rs.getInt("delivery_method_id"));
			bd.setUserId(rs.getInt("user_id"));
			bd.setDeliveryMethodPrice(rs.getInt("price"));
			bd.setDeliveryMethodName(rs.getString("name"));

			buyDataList.add(bd);
		}

		System.out.println("searching BuyData by userID has been completed");

		return buyDataList;
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


