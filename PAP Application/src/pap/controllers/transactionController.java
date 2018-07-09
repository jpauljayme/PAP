/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static pap.controllers.itemTypeController.getItemType;
import pap.dbconnection.MySQLConnector;
import pap.domain.ItemType;
import static pap.functionality.getLastID.getLastInsertID;

/**
 *
 * @author Allena Denise
 */
public class transactionController {
    
    public static int insertTransaction(int personID, int addedBy, double clothingWeight, double beddingsWeight, String transactionType){
        
        ItemType clothes = getItemType("Clothes");
        ItemType beddings = getItemType("Bedding");
        int interval = (transactionType.equals("Regular")? 2:1);
        
        double totalAmount = (clothingWeight * clothes.getItemTypePrice()) + (beddingsWeight * beddings.getItemTypePrice());
        
        try{
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "INSERT INTO transactions (PersonID, AddedBy, ClothingWeight, BeddingsWeight, TotalAmount, TransactionType, ReceivedDate) VALUES (?,?,?,?,?,?, (DATE_ADD(CURRENT_TIMESTAMP , INTERVAL ? DAY)))";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, personID);
                statement.setInt(2, addedBy);
                statement.setDouble(3, clothingWeight);
                statement.setDouble(4, beddingsWeight);
                statement.setDouble(5, totalAmount);
                statement.setString(6, transactionType);
                statement.setInt(7, interval);
                statement.execute();
                
                int id = getLastInsertID(connection);
                
                MySQLConnector.closeConnection();
                return id;
            }
        }catch(SQLException e){
        }
        return 0;
    }
    
    public static void main(String[] args){
        System.out.println(insertTransaction(2, 2, 4.4, 0, "Rushed"));
        System.out.println(insertTransaction(2, 2, 4.4, 0, "Regular"));
    }
}
