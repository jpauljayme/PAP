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
}
