package com.simplilearn.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoJDBC
 */
@WebServlet("/list")
public class ProductData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();
		
		try {
			InputStream in= getServletContext().getResourceAsStream
					("/WEB-INF/application.properties");
			Properties props= new Properties();
			props.load(in);
			
			DatabaseConfig obj=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"),
					props.getProperty("password"));
			Connection conn=obj.getConnection();
			response.setContentType("text/html");  
			
			
			if(conn!=null)
				out.print("");
			 Statement stmt = obj.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// ResultSet rs = stmt.executeQuery("select * from eproduct"); 
			 String id= request.getParameter("productId");
			 
				ResultSet rs = stmt.executeQuery("select * from eproduct where ID = " +id );
			
				
				
				 while (rs.next()) 
	             {  
					 String s = rs.getString("ID");
					 if(id.equals(s))
					 {
					
	                 String n = rs.getString("name");  
	                 String nm = rs.getString("price");  
	                
	                 Timestamp d =rs.getTimestamp("date_added");
	                 String hdd = rs.getString("parts_hdd");
	                 String cpu = rs.getString("parts_cpu");
	                 String ram = rs.getString("parts_hdd");
	                 
	                 out.println("ID No-" + s +"<br> Model- " +  n  + "<br> Price- "+ nm + "<br> Date & Time- " + d + "<br> Storage- "  + hdd + "<br> RAM -" + ram +"<br> Processor type- " + cpu);   
					 }
					 
				
					 
	               }
				 
					out.println("Please Enter the Valid Id");  
					 RequestDispatcher rd=request.getRequestDispatcher("index.html");  
				        rd.include(request,response);  
			 
				 out.close();  

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
