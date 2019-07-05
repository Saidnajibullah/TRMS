package com.revature.java.najib.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.java.najib.utils.ConnectionFactory;

public class ApprovalDaoImplt {
	static ResultSet rs = null;

	public static ResultSet getEmployeeApplication(String id, String col, boolean flag) {
		Connection newconn = ConnectionFactory.getConnection();
		try {
			Statement st = newconn.createStatement();
			String sql = "select * from application where id = '" + id + "' and " + col + " = " + flag;
			rs = st.executeQuery(sql);
			newconn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
