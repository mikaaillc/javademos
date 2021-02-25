
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class DbHelper {
    private String userName="root";
    private String password="2323Mk--";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErroMessage(SQLException exception){
        System.out.println("Error"+exception.getMessage());
        System.out.println("Error code:"+exception.getErrorCode());
    }
    
}
