package pap.controllers;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pap.dbconnection.MySQLConnector;
import pap.domain.ItemType;
import pap.domain.ResultSetMapper;
import static pap.functionality.getLastID.getLastInsertID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allena Denise
 */
public class itemTypeController {
    
    public static ItemType getItemType(int itemTypeID){
        ItemType temp = new ItemType();
        
        try{
            ResultSetMapper<ItemType> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM itemtype WHERE ItemTypeID=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, itemTypeID);
                resultSet = statement.executeQuery();
                List<ItemType> item = resultSetMapper.mapResultSetToObject(resultSet, ItemType.class);
                
                if(item != null){
                    System.out.println("test6");
                    return item.get(0);
                }
            }
        }catch(SQLException e){
        }
        return temp;
    }
    
    public static ItemType getItemType(String itemTypeName){
        ItemType temp = new ItemType();
        
        try{
            ResultSetMapper<ItemType> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM itemtype WHERE ItemTypeName=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, itemTypeName);
                resultSet = statement.executeQuery();
                List<ItemType> item = resultSetMapper.mapResultSetToObject(resultSet, ItemType.class);
                
                if(item != null){
                    System.out.println("test6");
                    return item.get(0);
                }
            }
        }catch(SQLException e){
        }
        return temp;
    }
    
    public static int insertItemType(String itemTypeName, float itemTypePrice, int addedBy, int updatedBy){
        try{
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                
                String query = "INSERT INTO itemtype (ItemTypeName, ItemTypePrice, AddedBy, UpdatedBy) VALUES (?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, itemTypeName);
                statement.setFloat(2, itemTypePrice);
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
//        System.out.println(insertItemType("Bedding", 40, 2, 2));

        System.out.println("ItemTypeID: " + getItemType("Clothes").getItemTypeID());
        System.out.println("ItemTypeName: " + getItemType("Clothes").getItemTypeName());
        System.out.println("ItemTypePrice: " + getItemType("Clothes").getItemTypePrice());
        System.out.println("AddedDate: " + getItemType("Clothes").getAddedDate());
        System.out.println("AddedBy: " + getItemType("Clothes").getAddedBy());
        System.out.println("UpdatedDate: " + getItemType("Clothes").getUpdatedDate());
        System.out.println("UpdatedBy: " + getItemType("Clothes").getUpdatedBy());
    }
}
