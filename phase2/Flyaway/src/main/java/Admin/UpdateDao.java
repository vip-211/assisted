package Admin;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Information.DBConnection;


public class UpdateDao {

    public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
        boolean status = false;

        try(Connection con=DBConnection.getMyConnection();
        
        PreparedStatement pr=con.prepareStatement("UPDATE admin SET password=? where username=?"))
        		{
        		
        	
        	 pr.setString(1, loginBean.getUsername());
              pr.setString(2, loginBean.getPassword());
             
              pr.executeUpdate();
              System.out.println(pr);
              
         }
         catch(Exception e)
         {
              System.out.println(e);
         }
        return true;
    }

////    private void printSQLException(SQLException ex) {
////        for (Throwable e: ex) {
////            if (e instanceof SQLException) {
////                e.printStackTrace(System.err);
////                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
////                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
////                System.err.println("Message: " + e.getMessage());
////                Throwable t = ex.getCause();
////                while (t != null) {
////                    System.out.println("Cause: " + t);
////                    t = t.getCause();
////                }
//            }
//        }
    }
