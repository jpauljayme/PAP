/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.functionality;
import pap.hash.MD5;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.NoSuchAlgorithmException;
import pap.dbconnection.MySQLConnector;
/**
 *
 * @author Allena Denise
 */
public class login {
    
    public static String checkCredentials(String username, String password) throws SQLException, NoSuchAlgorithmException{
        MySQLConnector.openConnection();
        Connection conn = MySQLConnector.getConnection();

        Statement st = conn.createStatement();
        String query = "SELECT * FROM credentials WHERE Username='"+ username +"'";
        ResultSet rs = st.executeQuery(query);
        
        if(!rs.isBeforeFirst()){
            MySQLConnector.closeConnection();
            return ("InvalidUsername");
        }
        
        rs.next();
        if(rs.getString("UserPassword").equals(MD5.hash(password))){
            MySQLConnector.closeConnection();
            return ("True");
        }else{
            MySQLConnector.closeConnection();
            return ("InvalidPassword");
        }
    }
    
    public static void main(String args[]) throws SQLException, NoSuchAlgorithmException{
        System.out.println(checkCredentials("dante", "password"));
    }
}
