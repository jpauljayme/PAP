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
import pap.domain.Transactions;
import static pap.functionality.getLastID.getLastInsertID;

/**
 *
 * @author Allena Denise
 */
public class transactionController {
    
    public static int insertTransaction(Transactions transactions){
        
        ItemType clothes = getItemType("Clothes");
        ItemType beddings = getItemType("Bedding");
        int interval = (transactions.getTransactionType().equals("Regular")? 2:1);
        
        double totalAmount = (transactions.getClothingWeight() * clothes.getItemTypePrice()) +
                             (transactions.getBeddingsWeight() * beddings.getItemTypePrice());
        
        try{
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "INSERT INTO transactions (PersonID, AddedBy, ClothingWeight, BeddingsWeight, TotalAmount, TransactionType, ReceivedDate) VALUES (?,?,?,?,?,?, (DATE_ADD(CURRENT_TIMESTAMP , INTERVAL ? DAY)))";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, transactions.getPersonID());
                statement.setInt(2, transactions.getAddedBy());
                statement.setDouble(3, transactions.getClothingWeight());
                statement.setDouble(4, transactions.getBeddingsWeight());
                statement.setDouble(5, totalAmount);
                statement.setString(6, transactions.getTransactionType());
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
//        System.out.println(insertTransaction(2, 2, 4.4, 0, "Rushed"));
//        System.out.println(insertTransaction(2, 2, 4.4, 0, "Regular"));
    }
}
