package com.revature.java.najib.services;

import java.util.List;

import javax.servlet.http.Part;

import com.revature.java.najib.pojos.Application;

public interface ApplicationProcessingService {
	int processApplication(Application app, List<String> forItems, Part f1, Part f2);

}