package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDemo
{
	
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/Student";
	
	public static final String USERNAME = "root";
	
	public static final String PASSWORD = "";
	
	
    public static void main( String[] args )
    {
     

    	try {
//        	1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. Try to establish the connection to database
			Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
			
			System.out.println("Successfully connected to the database now ...");
			
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println("Some issues : " + e.getMessage());
		}
    	
    }
}
