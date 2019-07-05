package com.revature.java.najib.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.Part;

import com.revature.java.najib.daos.*;

import com.revature.java.najib.pojos.Application;

public class ApplicationService implements ApplicationProcessingService {
	ApplicationDaoImplt application = new ApplicationDaoImplt();
	
	

	public int processApplication(Application app, List<String> formItems, Part f1, Part f2) {
		InputStream input1 = null;
		InputStream input2 = null;
	
		int record = 0;
		
		if(f1 != null && f2 != null) {
			try {
				input1 = f1.getInputStream();
				input2 = f2.getInputStream();
				app.setEmployeeid((String) formItems.get(0));	
				app.setFullname((String) formItems.get(1));
				app.setSupervisorid((String) formItems.get(2));
				app.setdate((String) formItems.get(3));
				app.setEvent((String) formItems.get(4));
				app.setLocation((String) formItems.get(5));
				app.setCost(new Double( formItems.get(6)));
				app.setAmount(new Double( formItems.get(7)));
				app.setGrade((String) formItems.get(8));
				app.setPresentation((String) formItems.get(9));
				app.setJustification((String) formItems.get(10)); 
				app.setFile1(input1);
				app.setFile2(input2);
				formItems.clear();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		record = application.saveApplicationData(app);
		
                                                    
	return record;  
    
}
}
