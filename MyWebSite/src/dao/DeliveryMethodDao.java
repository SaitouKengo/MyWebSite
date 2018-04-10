package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.DeliveryMethodData;

public class DeliveryMethodDao {

	public static ArrayList<DeliveryMethodData> getAllDeliveryMethodData() throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();

			st = con.prepareStatement("SELECT * FROM delivery_method");

			ResultSet rs = st.executeQuery();

			ArrayList<DeliveryMethodData> deliveryMethodDataList = new ArrayList<DeliveryMethodData>();
			while (rs.next()) {
				DeliveryMethodData dmd = new DeliveryMethodData();
				dmd.setId(rs.getInt("id"));
				dmd.setName(rs.getString("name"));
				dmd.setPrice(rs.getInt("price"));
				deliveryMethodDataList.add(dmd);
			}

			System.out.println("searching all DeliveryMethodData has been completed");

			return deliveryMethodDataList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}


	public static DeliveryMethodData getDeliveryMethodDataBeansByID(int DeliveryMethodId) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();

			st = con.prepareStatement(
					"SELECT * FROM delivery_method WHERE id = ?");
			st.setInt(1, DeliveryMethodId);

			ResultSet rs = st.executeQuery();

			DeliveryMethodData dmd = new DeliveryMethodData();
			if (rs.next()) {
				dmd.setId(rs.getInt("id"));
				dmd.setName(rs.getString("name"));
				dmd.setPrice(rs.getInt("price"));
			}

			System.out.println("searching DeliveryMethodData by DeliveryMethodID has been completed");

			return dmd;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}


	public static DeliveryMethodData getDeliveryMethodDataBeansByBuyId(int buyId) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();

			st = con.prepareStatement(
					"SELECT delivery_method.name,"
					+ " delivery_method.price"
					+ " FROM buy"
					+ " JOIN delivery_method"
					+ " ON delivery_method.id = buy.delivery_method_id"
					+ " WHERE buy.id = ?");
			st.setInt(1, buyId);

			ResultSet rs = st.executeQuery();
			DeliveryMethodData dmd = new DeliveryMethodData();

			while (rs.next()) {
				dmd.setName(rs.getString("name"));
				dmd.setPrice(rs.getInt("delivery_method.price"));

			}

			System.out.println("searching DeliveryMethodData by BuyID has been completed");
			return dmd;
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

