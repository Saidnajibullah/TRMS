package com.revature.java.najib.daos;

import java.sql.ResultSet;


public interface LoginDao {
	ResultSet getUserCredential(String pass);

}
