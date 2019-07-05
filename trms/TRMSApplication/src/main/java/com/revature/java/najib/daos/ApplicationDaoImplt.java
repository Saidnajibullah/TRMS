package com.revature.java.najib.daos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.java.najib.utils.ConnectionFactory;
import com.revature.java.najib.pojos.*;

public class ApplicationDaoImplt implements ApplicationDao {
	public int saveApplicationData(Application app) {
		int result = 0;
		
		//use to put employee reimbursement data to the database.
		
		Connection newconn = ConnectionFactory.getConnection();
		try {
			Statement st = newconn.createStatement();
			String sql = "insert into application (id, supid, fullname, eventtype, eventlocation,"
			+ " eventcost, amount, grade, presentaion, submitdate, justification, file1, file2)"
			+ "values(" + "'" + app.getEmployeeid() +  "', '" + app.getSupervisorid() + "', '"
			+ app.getFullname() + "', '" + app.getEvent() + "', '" + app.getLocation() + "', '" 
			+ Double.valueOf(app.getCost()) + "', '" + Double.valueOf(app.getAmount()) + "', '" 
			+ app.getGrade() + "', '" +app.getPresentation() + "', '" 
			+ Date.valueOf(app.getdate()) + "', '" + app.getJustification() +"', '" 
			+ app.getFile1() + "', '"+ app.getFile2() + "'" + ")";
			result = (Integer)st.executeUpdate(sql);
			newconn.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}

		
		return result;     
	}


   

}
