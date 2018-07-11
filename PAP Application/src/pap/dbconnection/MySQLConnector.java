/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.dbconnection;

/**
 *
 * @author jaymezing
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    //JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pap?"
            + "useUnicode=true&useJDBCCompliantTimezoneShift=true"
            + "&useLegacyDatetimeCode=false&serverTimezone=Asia/Manila";
    
    //Database credentials
    private static final String USER = "root";
    private static final String PASS = "password";
    private static Connection conn = null;

    
    public static void openConnection(){
        try{
            //Register JDBC driver
            Class.forName(JDBC_DRIVER);         
            //Open a connection
            System.out.print("Connecting to a selected database... ");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Success!");     
        }catch(Exception e){
            //Handle errors for JDBC
            e.printStackTrace();
        }
        
    }
    
    public static void closeConnection(){
        try{
            if(conn!=null)
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
        System.out.println("Connection closed");
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public static void main(String[] args){
        openConnection();
        closeConnection();
    }
}