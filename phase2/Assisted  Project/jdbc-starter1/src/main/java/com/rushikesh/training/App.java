package com.rushikesh.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/mphasis27Dec";
	
	public static final String USERNAME = "root";
	
	public static final String PASSWORD = "";
	
	String qry;
	
	Statement theStatemnent;
	
	ResultSet theResultSet;
	
	
    public static void main( String[] args )
    {
     

    	try {
//        	1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. Try to establish the connection to database
			Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
			
			App theApp = new App();
			
//			Get a reference to the Statement
			theApp.theStatemnent = dbCon.createStatement();
			
			//getCountOfStudents(dbCon);
			
			theApp.getAllStudents(dbCon);
			
			
//			System.out.println("Successfully connected to the database now ...");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Some issues : " + e.getMessage());
		}
    	
    }






	private void getAllStudents(Connection dbCon) throws SQLException {
		//			Write the query to fetch all records from table:students
					qry = "select * from students";
					
		//			Execute the query
					theResultSet = theStatemnent.executeQuery(qry);
					
		//			Traverse through the results
					while(theResultSet.next()) {
						System.out.print("ID: " + theResultSet.getString("id"));
						System.out.print(", Name :" + theResultSet.getString("name"));
						System.out.println(" from " + theResultSet.getString("location"));
					}
	}
    
    
    


    
//    A Method to get count of students
	private void getCountOfStudents(Connection dbCon) throws SQLException {
		
		//			Write the query to fetch number of rows
					qry = "select count(*) from students";
					
					
		//			Execute the query
					theResultSet = theStatemnent.executeQuery(qry);
					
					theResultSet.next();
					
					int countOfStudents = theResultSet.getInt(1);
					
					System.out.println("Number of students : " + countOfStudents);
	}
}

