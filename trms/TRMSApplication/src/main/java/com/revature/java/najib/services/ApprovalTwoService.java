package com.revature.java.najib.services;
import com.revature.java.najib.daos.*;

public class ApprovalTwoService {
	
	public static void approved(String id, String col) {
		ApprovalTwoDao.approved(id, col);
	}

}
