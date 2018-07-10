/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pap.dbconnection.MySQLConnector;
import pap.domain.Item;
import pap.domain.ResultSetMapper;
import static pap.functionality.getLastID.getLastInsertID;

/**
 *
 * @author Allena Denise
 */
public class itemController {
    public static Item getItem(int itemID){
        Item temp = new Item();
        
        try{
            ResultSetMapper<Item> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM item WHERE ItemID=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, itemID);
                resultSet = statement.executeQuery();
                List<Item> item = resultSetMapper.mapResultSetToObject(resultSet, Item.class);
                
                if(item != null){
                    return item.get(0);
                }
            }
        }catch(SQLException e){
        }
        return temp;
    }
    
    public static int insertItem(int itemTypeID, int itemCount, int addedBy, int updatedBy){
        try{
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                
                String query = "INSERT INTO item (ItemTypeID, ItemCount, AddedBy, UpdatedBy) VALUES (?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, itemTypeID);
                statement.setInt(2, itemCount);
                statement.setInt(3, addedBy);
                statement.setInt(4, updatedBy);
                statement.execute();
                
                int id = getLastInsertID(connection);

                MySQLConnector.closeConnection();
                return id;
            }
        }catch (SQLException e){
        }
        return 0;
    }
    
    public static void main(String[] args) throws SQLException{
//        System.out.println(insertItem(1, 40, 2, 2));

//        System.out.println("ItemID: " + getItem(1).getItemID());
//        System.out.println("ItemTypeName: " + getItem(1).getItemTypeID());
//        System.out.println("ItemTypePrice: " + getItem(1).getItemCount());
//        System.out.println("AddedDate: " + getItem(1).getAddedDate());
//        System.out.println("AddedBy: " + getItem(1).getAddedBy());
//        System.out.println("UpdatedDate: " + getItem(1).getUpdatedDate());
//        System.out.println("UpdatedBy: " + getItem(1).getUpdatedBy());
    }
}
