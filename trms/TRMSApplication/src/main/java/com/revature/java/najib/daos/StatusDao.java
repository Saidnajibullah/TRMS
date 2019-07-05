package com.revature.java.najib.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.java.najib.utils.ConnectionFactory;

public class StatusDao {
	static ResultSet rs = null;
	public static ResultSet checkStatus(String id) {
		Connection newconn = ConnectionFactory.getConnection();
		String sql = "select bencoconfirm from application where id = '" + id + "'";
		try {
			PreparedStatement st = newconn.prepareStatement(sql);
			rs = st.executeQuery();
			newconn.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return rs;
	}

}
