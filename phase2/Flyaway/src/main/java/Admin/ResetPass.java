package Admin;
import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;








@WebServlet("/areset")
public class ResetPass extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private UpdateDao loginDao;
    
    public void init() {
        loginDao = new UpdateDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("apass");
        String password = request.getParameter("aemail");
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                PrintWriter out = response.getWriter();
                out.println("Your password has been successfully reset !!! ");  
				 RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");  
			        rd.include(request,response); 
//                out.println("Password Reset Successful");
//            	
//                response.sendRedirect("AdminLogin.jsp");
            } 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}