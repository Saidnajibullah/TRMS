package com.revature.java.najib.services;

import java.sql.ResultSet;

import com.revature.java.najib.daos.ApprovalDaoImplt;

public class ApprovalProcessiongService{
	static ResultSet rs = null;
	static ResultSet rs2 = null; 
	static ResultSet rs3 = null; 

	public ResultSet processApplicationData(String id) {
		
		ResultSet rs1 = ApprovalDaoImplt.getEmployeeApplication(id, "supconfirm", false);
        if(rs1 != null) {
        	 rs = rs1;
        }
		
        return rs;
        
	}
   public ResultSet processApplicationData2(String id) {
		
		ResultSet rs1 = ApprovalDaoImplt.getEmployeeApplication(id, "headconfirm", false);
        if(rs1 != null) {
        	 rs2 = rs1;
        }
		
        return rs2;
        
	}
   public ResultSet processApplicationData3(String id) {
		
		ResultSet rs1 = ApprovalDaoImplt.getEmployeeApplication(id, "bencoconfirm", false);
       if(rs1 != null) {
       	 rs3 = rs1;
       }
		
       return rs3;
       
	}

}
