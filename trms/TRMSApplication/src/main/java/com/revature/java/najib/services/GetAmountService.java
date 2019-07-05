package com.revature.java.najib.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.java.najib.daos.GetAmountDao;

public class GetAmountService {
	
	public static int getTatalAmout(String id) {
		int result = 1000;
		ResultSet rs = GetAmountDao.getAmount(id);
		if(rs != null) {
			try {
				while(rs.next()) {
					result = rs.getInt(2) - rs.getInt(1);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
}
