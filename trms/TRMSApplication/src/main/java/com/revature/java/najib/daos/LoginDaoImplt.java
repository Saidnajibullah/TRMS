package com.revature.java.najib.daos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;
import com.revature.java.najib.utils.ConnectionFactory;

public class LoginDaoImplt implements LoginDao{
	Logger logger = Logger.getLogger(LoginDaoImplt.class);
	ResultSet result = null;
	public ResultSet getUserCredential(String pass) {
		Connection conn = ConnectionFactory.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql;
			if(pass.substring(0, 1).equals("e")) {
				sql = "select id, fullname from employee3 where id = '" + pass + "'" ; 
			}else {
				sql = "select id, fullname from supervisor where id = '" + pass + "'" ; 
			}
			result = st.executeQuery(sql);
			conn.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
		
	}

	

}
