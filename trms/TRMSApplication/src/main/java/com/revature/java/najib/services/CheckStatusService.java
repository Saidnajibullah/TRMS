package com.revature.java.najib.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.java.najib.daos.StatusDao;

public class CheckStatusService {
	static boolean status = false;
	
	public static boolean getStatus(String id) {
		ResultSet rs = StatusDao.checkStatus(id);
		try {
			if(rs != null) {
				while(rs.next()) {
					status = rs.getBoolean(1);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return status;
	}

}
