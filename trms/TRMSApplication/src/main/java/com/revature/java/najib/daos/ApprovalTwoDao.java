package com.revature.java.najib.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.java.najib.utils.ConnectionFactory;

public class ApprovalTwoDao{

	public static void approved(String id, String col) {
		Connection newconn = ConnectionFactory.getConnection();
		String sql = "update application set " + col + " = true where id = '" + id + "'";
		try {
			PreparedStatement st = newconn.prepareStatement(sql);
			st.executeUpdate();
			newconn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
