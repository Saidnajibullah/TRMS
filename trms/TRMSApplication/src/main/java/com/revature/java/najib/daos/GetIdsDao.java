package com.revature.java.najib.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.java.najib.utils.ConnectionFactory;

public class GetIdsDao {
	public static ResultSet getEmployeeIds(String col1, String col2, boolean flag1, boolean flag2) {
		Connection newconn = ConnectionFactory.getConnection();
		ResultSet rs = null;
		Statement st;
		try {
			st = newconn.createStatement();
			String sql = "select id from application where " + col1 +" = " + flag1 + " and " +
			col2 + " = " + flag2;
			rs = st.executeQuery(sql);
			newconn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rs;
	}
}
