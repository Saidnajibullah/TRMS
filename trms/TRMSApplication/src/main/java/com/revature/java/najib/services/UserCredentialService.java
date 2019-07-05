package com.revature.java.najib.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.java.najib.daos.LoginDaoImplt;
import com.revature.java.najib.pojos.User;

public class UserCredentialService implements UserService {
	User user = new User();

	public User loginUser(String password) {
		LoginDaoImplt usercred = new LoginDaoImplt();
		ResultSet userCredential = usercred.getUserCredential(password);
		try {
			while(userCredential.next()) {
				String userid = userCredential.getString(1);
				String username = userCredential.getString(2);
				user.setPassword(userid);
				user.setUsername(username);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	
}
