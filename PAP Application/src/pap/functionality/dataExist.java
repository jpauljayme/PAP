/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.functionality;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Allena Denise
 */
public class dataExist {
    
    public static boolean getRow(Connection connection, String table, String column, int id) throws SQLException{
        
        String query = "SELECT * FROM %s WHERE %s=?";
        query = String.format(query, table, column);
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        
        return rs.next();
    }
    
    public static boolean getRow(Connection connection, String table, String column, String data) throws SQLException{
        
        String query = "SELECT * FROM %s WHERE %s=?";
        query = String.format(query, table, column);
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, data);
        ResultSet rs = statement.executeQuery();
        
        return rs.next();
    }
}
