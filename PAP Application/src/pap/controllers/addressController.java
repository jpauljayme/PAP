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
import pap.util.GlobalConstants;
import pap.util.Validation;

/**
 * CRUD Operations for address and validation
 *
 * @author Allena Denise, John Paul Jayme
 */
public class addressController {

    /**
     * Returns address information
     *
     * @param addressID
     *
     * @return address information
     */
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

    /**
     * Insert address information to table
     *
     * @param address
     *
     * @return true if successful insertion else false
     */
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
            
            if(id != 0){
                System.out.print("Address Succesffuly inserted into the person table");
                return id;
            }else{
                System.out.print("Address Succesffuly inserted into the person table");
                return id;
            }
        } catch (SQLException e) {
        }

        return 0;
    }

    /**
     * removes address info related to a person
     *
     * @param addressID
     *
     * @return true if successful removal else false
     */
    public static boolean removeAddress(int addressID) {

        MySQLConnector.openConnection();

        try (Connection connection = MySQLConnector.getConnection()) {
            int ret;
            String query = "DELETE FROM address WHERE AddressID =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, addressID);
            System.out.println(statement.toString());
            ret = statement.executeUpdate();
            System.out.print("at removeaddress ret -" + ret);
            MySQLConnector.closeConnection();
            if (ret != 0) {

                System.out.println("Successfully removed address");
                return true;
            } else {
                System.out.println("Failed to remove address");
                return false;
            }

        } catch (SQLException e) {
        }

        return false;
    }

    /**
     * Updates address information
     *
     * @param address
     * @param personTypeID
     *
     * @return true if successful update else false
     */
    public static boolean updateAddress(Address address, int personTypeID) {
        MySQLConnector.openConnection();

        try (Connection connection = MySQLConnector.getConnection()) {

            int ret;
            String query = "UPDATE address SET Floor = ? , RoomNumber = ?, "
                    + "BuildingName = ? , HouseNumber = ? , Street = ? , "
                    + "Barangay = ? , City = ? , UpdatedBy = ? "
                    + "WHERE AddressID = ? ";
            PreparedStatement statement = connection.prepareStatement(query);
            System.out.println(personTypeID);
            if (personTypeID == 3) {
                statement.setString(1, null);
                statement.setString(2, null);
                statement.setString(3, null);
                statement.setString(4, address.getHouseNumber());
                statement.setString(5, address.getStreet());
                statement.setString(6, address.getBarangay());
                statement.setString(7, address.getCity());
            } else if (personTypeID == 4) {
                statement.setString(1, address.getFloor());
                statement.setString(2, address.getRoomNumber());
                statement.setString(3, address.getBuildingName());
                statement.setString(4, null);
                statement.setString(5, null);
                statement.setString(6, null);
                statement.setString(7, null);
            }

            statement.setInt(8, address.getUpdatedBy());
            statement.setInt(9, address.getAddressID());

            System.out.println(statement.toString());
            ret = statement.executeUpdate();
            MySQLConnector.closeConnection();

            if (ret != 0) {
                System.out.println("Successfully updated address!");
                return true;
            } else {
                System.out.println("Failed to update address!");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    /**
     * Validates address input of employee
     *
     * @param houseNumber
     * @param street
     * @param barangay
     * @param city
     * @return true if valid address else false
     */
    public static boolean validateEmployeeAddress(String houseNumber, String street, String barangay,
            String city) {

        return !Validation.empty(houseNumber) && !Validation.validateString(houseNumber,
                GlobalConstants.MAX_LENGTH_HOUSENUMBER)
                && !Validation.empty(street) && !Validation.validateString(street,
                GlobalConstants.MAX_LENGTH_STREET)
                && !Validation.empty(city) && !Validation.validateString(city,
                GlobalConstants.MAX_LENGTH_CITY);

    }

    /**
     * Validates address input of customer
     *
     * @param floor
     * @param roomNumber
     * @param buildingName
     *
     * @return true if valid address else false
     */
    public static boolean validateCustomerAddress(String floor, String roomNumber,
            String buildingName) {
        return !Validation.empty(floor) && !Validation.validateString(floor,
                GlobalConstants.MAX_LENGTH_FLOOR) && !Validation.empty(roomNumber)
                && !Validation.validateString(roomNumber, GlobalConstants.MAX_LENGTH_ROOMNUMBER)
                && !Validation.empty(buildingName) && !Validation.validateString(buildingName,
                GlobalConstants.MAX_LENGTH_BUILDINGNAME);
    }

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
