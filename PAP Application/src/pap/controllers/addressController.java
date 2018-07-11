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

    public static Address getAddress(int addressID) {
        Address temp = new Address();
        try {
            ResultSetMapper<Address> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();

            try (Connection connection = MySQLConnector.getConnection()) {

                String query = "SELECT * FROM address WHERE AddressID=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, addressID);
                resultSet = statement.executeQuery();
                List<Address> a = resultSetMapper.mapResultSetToObject(resultSet, Address.class);

                if (a != null) {
                    System.out.println("test6");
                    return a.get(0);
                }
            }
        } catch (SQLException e) {
        }
        return temp;
    }

    public static int insertAddress(Address address) {

        MySQLConnector.openConnection();

        try (Connection connection = MySQLConnector.getConnection()) {
            String query = "INSERT INTO address (Floor, RoomNumber, "
                    + "BuildingName, HouseNumber, Street, Barangay, "
                    + "City, AddedBy, UpdatedBy) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, address.getFloor());
            statement.setString(2, address.getRoomNumber());
            statement.setString(3, address.getBuildingName());
            statement.setString(4, address.getHouseNumber());
            statement.setString(5, address.getStreet());
            statement.setString(6, address.getBarangay());
            statement.setString(7, address.getCity());
            statement.setInt(8, address.getAddedBy());
            statement.setInt(9, address.getUpdatedBy());
            System.out.println(statement.toString());
            statement.executeUpdate();

            int id = getLastInsertID(connection);

            MySQLConnector.closeConnection();
            return id;
        }catch (SQLException e){
        }

        return 0;
    }
    public static boolean removeAddress(int addressID) {

        MySQLConnector.openConnection();

        try (Connection connection = MySQLConnector.getConnection()) {
            int ret;
            String query = "DELETE FROM address WHERE AddressID =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, addressID);
            System.out.println(statement.toString());
            ret = statement.executeUpdate();
            System.out.print("at removeaddress ret -"+ret);
            MySQLConnector.closeConnection();
            if(ret !=0){
                
                System.out.println("Successfully removed address");
                return true;
            }else{
                System.out.println("Failed to remove address");
                return false;
            }
            

            
            
        }catch (SQLException e){
        }

        return false;
    }
//    public static String validAddress(){
//    
//    }
    public static void main(String[] args) throws SQLException {
//        System.out.println("AddressID: " + getAddress(4).getAddressID());
//        System.out.println("Floor: " + getAddress(4).getFloor());
//        System.out.println("RoomNumber: " + getAddress(4).getRoomNumber());
//        System.out.println("BuildingName: " + getAddress(4).getBuildingName());
//        System.out.println("AddedBy: " + getAddress(4).getAddedBy());
//        System.out.println("UpdatedBy: " + getAddress(4).getUpdatedBy());
//        System.out.println("AddedDate: " + getAddress(4).getAddedDate());
//        System.out.println("UpdatedDate: " + getAddress(4).getUpdatedDate());

//        System.out.println(insertAddress("2", 5, "NB2", null, null, null, null,2, 2));
    }
}
