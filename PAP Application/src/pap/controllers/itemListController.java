/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static pap.controllers.itemController.getItem;
import static pap.controllers.transactionController.getTransaction;
import pap.dbconnection.MySQLConnector;
import pap.domain.ItemList;
import static pap.functionality.dataExist.getRow;
import static pap.functionality.getLastID.getLastInsertID;

/**
 * itemList class methods and CRUD operations
 *
 * @author Allena Denise
 */
public class itemListController {

    public static int insertItemList(ItemList itemList) {
        try {
            MySQLConnector.openConnection();

            try (Connection connection = MySQLConnector.getConnection()) {

                String query = "INSERT INTO itemList (TransactionID, ItemID) VALUES (?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, itemList.getTransactionID());
                statement.setInt(2, itemList.getItemID());
                statement.executeQuery();

                int id = getLastInsertID(connection);

                MySQLConnector.closeConnection();
                return id;
            }
        } catch (SQLException e) {
        }
        return 0;
    }

    /**
     * Validate itemList input.
     *
     * @param transactionID
     * @param itemID
     * @return Error string else "Valid"
     * @throws java.sql.SQLException
     */
    public static String validItemListInput(int transactionID, int itemID) throws SQLException {

        MySQLConnector.openConnection();
        Connection connection = MySQLConnector.getConnection();

        if (getRow(connection, "transactions", "TransactionID", transactionID) == false) {
            return ("TransactionIDDoesNotExist");
        } else if (getRow(connection, "item", "ItemID", itemID) == false) {
            return ("ItemIDDoesNotExist");
        } else {
            return ("Valid");
        }
    }

    public static void main(String[] args) throws SQLException {
//        System.out.println(insertItemList(1, 40, 2, 2));

//        System.out.println("ItemID: " + getItem(1).getItemID());
//        System.out.println("ItemTypeName: " + getItem(1).getItemTypeID());
//        System.out.println("ItemTypePrice: " + getItem(1).getItemCount());
//        System.out.println("AddedDate: " + getItem(1).getAddedDate());
//        System.out.println("AddedBy: " + getItem(1).getAddedBy());
//        System.out.println("UpdatedDate: " + getItem(1).getUpdatedDate());
//        System.out.println("UpdatedBy: " + getItem(1).getUpdatedBy());
//        System.out.println(validItemListInput(1, 1));
    }
}
