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
import java.util.ArrayList;
import java.util.List;
import static pap.controllers.itemTypeController.getItemType;
import pap.dbconnection.MySQLConnector;
import pap.domain.ItemType;
import pap.domain.Person;
import pap.domain.ResultSetMapper;
import pap.domain.Transactions;
import static pap.functionality.dataExist.getRow;
import static pap.functionality.getLastID.getLastInsertID;
import pap.util.GlobalConstants;
import pap.util.Validation;

/**
 *CRUD Operations for transaction. Contains various methods for validation etc.
 * @author Allena Denise
 */
public class transactionController {

    /**
     * Retrieves transaction from transaction table.
     * 
     * @return list of transactions
     */    
    public static List<Transactions> getTransaction(){
        List<Transactions> result = new ArrayList<>();
        
        try{
            ResultSetMapper<Transactions> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM transactions INNER JOIN Person ON transactions.PersonID = person.PersonID ORDER BY TransactionID DESC";
                PreparedStatement statement = connection.prepareStatement(query);
                resultSet = statement.executeQuery();
                
                result = resultSetMapper.mapResultSetToObject(resultSet, Transactions.class);
                
            }
        }catch(SQLException e){
        }
        return result;
    } 

    /**
     * Retrieves transaction row from transaction table.
     *
     * 
     * @return Transaction object
     */    
    public static Transactions getTransaction(int transactionID){
        Transactions temp = new Transactions();
        
        try{
            ResultSetMapper<Transactions> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT * FROM transactions WHERE TransactionID=?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, transactionID);
                resultSet = statement.executeQuery();
                List<Transactions> transaction = resultSetMapper.mapResultSetToObject(resultSet, Transactions.class);
                
                if(transaction != null){
                    return transaction.get(0);
                }
            }
        }catch(SQLException e){
        }
        return temp;
    }
    
    /**
     * Retrieves a list of transactions
     *
     * @param sortBy
     * @param orderBy
     * @return list of transactions
     */    
    public static List<Transactions> getTransaction(String sortBy, String orderBy){
        List<Transactions> result = new ArrayList<>();
        
        try{
            ResultSetMapper<Transactions> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet;
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "SELECT CONCAT(person.FirstName, person.MiddleName, person.LastName) AS FullName, transactions.* FROM transactions INNER JOIN person ON transactions.PersonID = person.PersonID ORDER BY %s %s";
                query = String.format(query, sortBy, orderBy);
                PreparedStatement statement = connection.prepareStatement(query);
                resultSet = statement.executeQuery();
                
                result = resultSetMapper.mapResultSetToObject(resultSet, Transactions.class);
                
            }
        }catch(SQLException e){
        }
        return result;
    }

    /**
     * Inserts transaction object to transaction table
     *
     * @param transactions
     * 
     * @return id of newly inserted transaction
     */    
    public static int insertTransaction(Transactions transactions){
        
        ItemType clothes = getItemType("Clothes");
        ItemType beddings = getItemType("Bedding");
        int interval = (transactions.getTransactionType().equals("Regular")? 2:1);
        
        try{
            MySQLConnector.openConnection();
            
            try(Connection connection = MySQLConnector.getConnection()){
                
                String query = "INSERT INTO transactions (PersonID, AddedBy, ClothingWeight, BeddingsWeight, TotalAmount, TransactionType, ReceivedDate) VALUES (?,?,?,?,?,?, (DATE_ADD(CURRENT_TIMESTAMP , INTERVAL ? DAY)))";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, transactions.getPersonID());
                statement.setInt(2, transactions.getAddedBy());
                statement.setDouble(3, transactions.getClothingWeight());
                statement.setDouble(4, transactions.getBeddingsWeight());
                statement.setDouble(5, transactions.getTotalAmount());
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

    /**
     * Validation for transaction input
     *
     * @param personID
     * @param transactionType
     * @param addedBy
     * @param clothingWeight
     * @param beddingsWeight
     * 
     * @return String of error, else a Valid string
     */    
    public static String validTransactionInput(int personID, String transactionType
            ,int addedBy, double clothingWeight, double beddingsWeight) throws SQLException{
        
        MySQLConnector.openConnection();
        Connection connection = MySQLConnector.getConnection();
        if(Validation.validateString(transactionType, GlobalConstants.MAX_LENGTH_TRANSACTIONTYPE)){
            return ("Invalid transaction type length.");
        }else if(getRow(connection, "person", "PersonID", personID) == false){
            return ("PersonIDDoesNotExist");
        }else if(getRow(connection, "transactions", "TransactionType", transactionType) == false){
            return ("TransactionTypeDoesNotExist");
        }else if(getRow(connection, "person", "PersonID", addedBy) == false){
            return ("AddedByDoesNotExist");
        }else if(clothingWeight < 0){
            return ("InvalidClothingWeight");
        }else if(beddingsWeight < 0){
            return ("InvalidBeddingsWeight");
        }else{
            return ("Valid");
        }
    }
    
    public static void main(String[] args) throws SQLException{
//        System.out.println(insertTransaction(2, 2, 4.4, 0, "Rushed"));
//        System.out.println(insertTransaction(2, 2, 4.4, 0, "Regular"));
//        System.out.println(getTransaction("FullName", "ASC"));

//        System.out.println(getTransaction("FullName", "DESC").get(0).getTransactionID());
//        System.out.println(validTransactionInput(3, "Regular", 2, 0, 0));
    }
}
