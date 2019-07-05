package com.revature.java.najib.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private static String url;
	private static String username;
	private static String password;
	private static final String CREDEDNTIALS = "credentials.properties";
	private static ConnectionFactory cf;
	//static Logger logger = Logger.getLogger(ConnectionFactory.class);
	
	public static synchronized Connection getConnection() {
		if(cf == null) {
			cf = new ConnectionFactory();
		}
		return cf.createConnection();
	}
	
	private ConnectionFactory(){
		Properties p = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		try {
			InputStream f = loader.getResourceAsStream(CREDEDNTIALS);
			p.load(f);
			url = p.getProperty("url");
			username = p.getProperty("user");
			password = p.getProperty("pass");
			System.out.println();
		}catch (FileNotFoundException e) {
			System.out.println(e);
			//logger.error(e);
		}catch(IOException e) {
			System.out.println(e);
			////logger.error(e);
			//logger.error(url);
		}
	}
	
	private Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, password);
			}catch(SQLException e) {
				System.out.println(e);
				//logger.error(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
				//logger.error(e);
			}
		return conn;
	}

}
