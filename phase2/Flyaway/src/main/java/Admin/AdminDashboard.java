package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Information.DBConnection;

/**
 * Servlet implementation class AdminDashboard
 */
@WebServlet("/admindashboard")
public class AdminDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		 PrintWriter out = response.getWriter();
         out.println("Admin Login Successfull");
         out.println("Available Filghts");
         
 		
 		try {
 			//call connection method
 			Connection con=DBConnection.getMyConnection();
 			
 			String str="select * from flightinfo";
 			
 			Statement ps=con.createStatement();
 			
 			//To execute query create object of statement
 			//java.sql.Statement ps=con.createStatement();
 			//get ResultSet
 			
 			ResultSet ans=ps.executeQuery(str);
 			char a = 1;
 			
 			while(ans.next())
 			{	while(a<2) {
 				out.println("<table border=2>");
 				out.println("<tr><th>flight_No</th><th>Source</th><th>Destination</th><th>date</th></tr>");
 				out.println("<tr>");
 			a++;	
 			}
 				out.println("<td>"+ans.getInt("flight_No")+"</td>");
 				
 				out.println("<td>"+ans.getString("arrival")+"</td>");
 				out.println("<td>"+ans.getString("departure")+"</td>");
 				out.println("<td>"+ans.getString("time")+"</td>");
 				out.println("</tr>");
 			}
 			out.println("</table>");
 			con.close();
 			out.println("<a href='logout.java'>Logout of session</a><br>");

 		}
 		catch(Exception e) 
 		{
 			e.printStackTrace();
 		}
 	}

 }