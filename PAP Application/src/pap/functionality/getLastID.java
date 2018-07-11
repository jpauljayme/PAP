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
public class getLastID {
    
    public static int getLastInsertID(Connection connection) throws SQLException{
        ResultSet rs;
        String query = "SELECT LAST_INSERT_ID()";
        PreparedStatement statement = connection.prepareStatement(query);
        rs = statement.executeQuery();
        rs.next();
        
        return rs.getInt(1);
    }
}
