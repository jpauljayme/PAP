package pap.domain;

/**
 *Class that stores the id's of related transaction and item.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class ItemList {
    private int itemListID;
    private int transactionID;
    private int itemID;
    
    /**
     *Default constructor.
     */
    public ItemList(){
        this.itemID = 0;
        this.itemListID = 0;
        this.transactionID = 0;
    }
    
    /**
     *Constructor with parameters.
     * @param itemID
     * @param itemListID
     * @param transactionID
     */
    public ItemList(int itemID, int itemListID, int transactionID){
        this.itemID = itemID;
        this.itemListID = itemListID;
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
