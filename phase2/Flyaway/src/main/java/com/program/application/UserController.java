package com.program.application;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private CDao userDao;

    public void init() {
        userDao = new CDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("Customer.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("cname");
        String lastName = request.getParameter("clname");
        String age = request.getParameter("cage");
        String email = request.getParameter("cemail");
        String gender = request.getParameter("cgender");
        String phone = request.getParameter("cnumber");
        String password = request.getParameter("cpassword");

        Customer user = new Customer();
        user.setCname(firstName);
        user.setClname(lastName);
        user.setCage(age);
        user.setCemail(email);
        user.setCgender(gender);
        user.setCphoneno(phone);
        user.setCpassword(password);
        
        

        userDao.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerRegisterd.jsp");
        dispatcher.forward(request, response);
    }
}