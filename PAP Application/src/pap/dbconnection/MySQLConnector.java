package pap.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Class used for connecting to the database.
 * @author jaymezing
 */
public class MySQLConnector {
    //JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/"
            + "pap?useUnicode=true&useJDBCCompliantTimezoneShift"
            + "=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Manila";
    
    //Database credentials
    private static final String USER = "root";
    private static final String PASS = "password";
    //tDuwXMyyNwhLD7Jw
    private static Connection conn = null;

    /**
     *Opens a connection to the database.
     */
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
    
    /**
     *Closes the connection from the database.
     */
    public static void closeConnection(){
        try{
            if(conn!=null)
            conn.close();
        }catch(SQLException se){
            new Throwable(se);
        }
        System.out.println("Connection closed");
    }
    
    /**
     *Returns the created Connection.
     * @return Connection conn
     */
    public static Connection getConnection(){
        return conn;
    }
    
    /**
     *Main class to test the class.
     * @param args
     */
    public static void main(String[] args){
        openConnection();
        closeConnection();
    }
}