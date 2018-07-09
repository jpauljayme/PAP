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
import pap.domain.Address;
import pap.domain.ResultSetMapper;
import static pap.functionality.getLastID.getLastInsertID;

/**
 *
 * @author Allena Denise
 */
public class addressController {
    
    public static Address getAddress(int addressID){
        Address temp = new Address();
        try{
            ResultSetMapper<Address> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM address WHERE AddressID=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, addressID);
                resultSet = statement.executeQuery();
                List<Address> a = resultSetMapper.mapRersultSetToObject(resultSet, Address.class);
                
                if(a != null){
                    System.out.println("test6");
                    return a.get(0);
                }
            }
        }catch(SQLException e){
        }
        return temp;
    }
    
    public static int insertAddress(String floor, int roomNumber, String buildingName, int addedBy, int updatedBy) throws SQLException{
        try{
            
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                
                String query = "INSERT INTO address (Floor, RoomNumber, BuildingName, AddedBy, UpdatedBy) VALUES (?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, floor);
                statement.setInt(2, roomNumber);
                statement.setString(3, buildingName);
                statement.setInt(4, addedBy);
                statement.setInt(5, updatedBy);
                statement.execute();
                
                int id = getLastInsertID(connection);
                
                MySQLConnector.closeConnection();
                return id;
            }
        }catch (SQLException e){
        }
        return 0;
    }
    
//    public static String validAddress(){
//    
//    }
    
    public static void main(String[] args) throws SQLException{
//        System.out.println("AddressID: " + getAddress(4).getAddressID());
//        System.out.println("Floor: " + getAddress(4).getFloor());
//        System.out.println("RoomNumber: " + getAddress(4).getRoomNumber());
//        System.out.println("BuildingName: " + getAddress(4).getBuildingName());
//        System.out.println("AddedBy: " + getAddress(4).getAddedBy());
//        System.out.println("UpdatedBy: " + getAddress(4).getUpdatedBy());
//        System.out.println("AddedDate: " + getAddress(4).getAddedDate());
//        System.out.println("UpdatedDate: " + getAddress(4).getUpdatedDate());
        
//        System.out.println(insertAddress("2", 5, "NB2", 2, 2));
    }
}
