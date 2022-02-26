package validation;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





@WebServlet("/clogin")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private LoginDao loginDao;
    
    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("cemail");
        String password = request.getParameter("cpassword");
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                response.sendRedirect("Logined.jsp");
            } else {
                HttpSession session = request.getSession();
                
                PrintWriter out=response.getWriter();
                out.println("Please Enter the Valid Id & Password");  
				 RequestDispatcher rd=request.getRequestDispatcher("CustomerLogin.jsp");  
			        rd.include(request,response); 
             
                //session.setAttribute("user", username);
                //response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}