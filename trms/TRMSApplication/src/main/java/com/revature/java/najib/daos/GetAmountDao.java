package com.revature.java.najib.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.java.najib.utils.ConnectionFactory;

public class GetAmountDao {
	
	
	public static ResultSet getAmount(String id) {
		ResultSet rs = null;
		
		Connection newconn = ConnectionFactory.getConnection();
		String sql = "select eventcost, amount from application where id = '" + id + "'";
		try {
			PreparedStatement st = newconn.prepareStatement(sql);
			rs = st.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	

}
