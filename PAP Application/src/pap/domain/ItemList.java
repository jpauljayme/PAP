package pap.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *Class that stores the id's of related transaction and item.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class ItemList implements Serializable {
    @Id
    @Column(name="ItemListID")
    private int itemListID;
    @Column(name="TransactionID")
    private int transactionID;
    @Column(name="ItemID")
    private int itemID;
    
    /**
     *Default constructor.
     */
    public ItemList(){
        this.itemListID = 0;
        this.itemID = 0;
        this.transactionID = 0;
    }
    
    /**
     *Constructor with parameters.
     * @param itemID
     * @param transactionID
     */
    public ItemList(int itemID, int transactionID){
        this.itemID = itemID;
        this.transactionID = transactionID;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the ItemList ID
     * @return the itemListID
     */
    public int getItemListID() {
        return itemListID;
    }

    /**
     * Returns the Transaction ID of the ItemList
     * @return the transactionID
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Returns the Item ID of the ItemList
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }
    
    
    /*
     * SETTERS
     */
    
    /**
     * Sets the ItemList ID of the ItemList
     * @param itemListID the itemID to set
     */
    public void setItemListID(int itemListID) {
        this.itemListID = itemListID;
    }

    /**
     * Sets the Transaction ID of the ItemList
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * Sets the Item ID of the ItemList
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
