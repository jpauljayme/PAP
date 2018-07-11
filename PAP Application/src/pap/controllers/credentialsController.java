/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.controllers;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pap.dbconnection.MySQLConnector;
import pap.domain.Credential;
import pap.domain.Person;
import pap.domain.ResultSetMapper;
import static pap.functionality.dataExist.getRow;
import static pap.functionality.getLastID.getLastInsertID;
import pap.hash.MD5;
import pap.util.GlobalConstants;
import pap.util.Validation;

/**
 *CRUD operations for credentials class. Includes validation.
 * @author Allena Denise
 */
public class credentialsController {

    /**
     * Checks credential info
     *
     * @param username
     * @param password
     * @return "Valid" or "Invalid" string
     * @throws java.security.NoSuchAlgorithmException
     */    
    
    public static String checkCredentials(String username, String password) throws NoSuchAlgorithmException{
        try {
            ResultSetMapper<Credential> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try (Connection connection = MySQLConnector.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM credentials WHERE Username=?");
                statement.setString(1, username);
                
                resultSet = statement.executeQuery();
                List<Credential> c = resultSetMapper.mapResultSetToObject(resultSet, Credential.class);
                
                MySQLConnector.closeConnection();
                
                if (c != null) {
                    Credential user = c.get(0);
                    if(user.getUserPassword().equals(MD5.hash(password))){
                        return ("Valid");
                    }else{
                        return ("InvalidPassword");
                    }
                }
            }
        } catch (SQLException e) {
        }
        return ("InvalidUsername");
    }
    
    public static Credential getCredentials(int personID) throws NoSuchAlgorithmException{
        try {
            ResultSetMapper<Credential> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try (Connection connection = MySQLConnector.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM credentials WHERE PersonID=?");
                statement.setInt(1, personID);
                
                resultSet = statement.executeQuery();
                List<Credential> c = resultSetMapper.mapResultSetToObject(resultSet, Credential.class);
                
                MySQLConnector.closeConnection();
                
                if (c != null) {
                    return c.get(0);
                }
            }
        } catch (SQLException e) {
        }
        return new Credential();
    }


    /**
     * Insert credentials to credentials table
     *
     * @param credential
     * @param credential
     *
     * @return credential ID
     */       
    public static int insertCredentials(Credential credential) throws NoSuchAlgorithmException{
        try{
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                
                String query = "INSERT INTO credentials (PersonID, Username, UserPassword, AddedBy, UpdatedBy) VALUES (?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, credential.getPersonID());
                statement.setString(2, credential.getUsername());
                statement.setString(3, MD5.hash(credential.getUserPassword()));
                statement.setInt(4, credential.getAddedBy());
                statement.setInt(5, credential.getUpdatedBy());
                statement.execute();
                
                int id = getLastInsertID(connection);
                
                MySQLConnector.closeConnection();
                return id;
            }
        }catch (SQLException e){
        }
        return 0;
    }


    /**
     * Update credentials information
     *
     * @param oldUsername
     * @param credential
     * @throws java.security.NoSuchAlgorithmException
     * 
     */       
    public static void updateCredentials(String oldUsername, Credential credential) throws NoSuchAlgorithmException{
        try{
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                String query = "UPDATE credentials SET Username=?, UserPassword=?, UpdatedBy=? WHERE Username=?";
                
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, credential.getUsername());
                statement.setString(2, MD5.hash(credential.getUserPassword()));
                statement.setInt(3, credential.getUpdatedBy());
                statement.setString(4, oldUsername);
                
                statement.execute();

                MySQLConnector.closeConnection();
            }
        }catch (SQLException e){
        }
    }
 

    /**
     * Deletes credential info from credentials table
     *
     * @param credentialsID
     * 
     * 
     */       
    public static void deleteCredentials(int credentialsID){
        try{
            MySQLConnector.openConnection();

            try(Connection connection = MySQLConnector.getConnection()) {
                String query = "DELETE FROM credentials WHERE CredentialsID=?";
                
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, credentialsID);
                
                statement.execute();

                MySQLConnector.closeConnection();
            }
        }catch (SQLException e){
        }
    }

    /**
     * Validates credential info before insertion
     *
     * @param username
     * @param password
     * @param addedBy
     *
     * @return credential ID
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.sql.SQLException
     */      
    public static String validCredentialInsert(String username,
            String password, int addedBy) throws NoSuchAlgorithmException, SQLException{
        
        MySQLConnector.openConnection();
        Connection connection = MySQLConnector.getConnection();
        //Check if string is empty before calling this
        
        
        if(username.contains(" ")){
            return ("ContainsWhitespace");
        }else if(Validation.empty(username) && Validation.empty(password)){
            return ("Empty username or password");
        }
        else if(Validation.validateString(username, GlobalConstants.MAX_LENGTH_USERNAME)
                && Validation.validateString(password, GlobalConstants.MAX_LENGTH_PASSWORD)){
            return ("UsernamePasswordOverflow");
        }else if(getRow(connection, "person", "PersonID", addedBy) == false){
            return ("AddedByDoesNotExist");
        }else if(getRow(connection, "credentials", "Username", username) == true){
            return ("UsernameTaken");
        }else{
            return ("Valid");
        } 
    }
    
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException{
        System.out.println(checkCredentials("dante", "password"));
//        updateCredentials("dante1","dante2", "password", 2);
//        deleteCredentials(3);
//        System.out.println(validCredentialInsert("da", "password", 2));
//        System.out.println(insertCredentials(2, "username", "password", 2, 2));
    }
}
