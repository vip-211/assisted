package Information;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchinfo
 */
@WebServlet("/searchinfo")
public class searchinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source=request.getParameter("source");
		String destination=request.getParameter("desti");
		PrintWriter out=response.getWriter();
		
		try {
			//call connection method
			Connection con=DBConnection.getMyConnection();
			
			String str="select * from flightinfo where departure='"+destination+"' and arrival='"+source+"'";
			
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
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}