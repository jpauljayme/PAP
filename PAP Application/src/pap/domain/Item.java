package pap.domain;

import java.util.Date;

/**
 *Class that defines an item.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class Item {
    private int itemID;
    private int itemTypeID;
    private int itemCount;
    private Date addedDate;
    private String addedBy;
    private Date updatedDate;
    private String updatedBy;
    private int itemCounter = 1;
    /**
     *Default constructor.
     */
    public Item(){
        itemID = itemCounter++;
        this.itemTypeID = 0;
        this.itemCount = 0;
        this.addedDate = new Date();
        this.addedBy = "";
        this.updatedBy = "";
        this.updatedDate = new Date();
    }
    
    /**
     *Constructor that accepts parameters.
     * @param itemID
     * @param itemTypeID
     * @param itemCount
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updateBy
     */
    public Item(int itemID, int itemTypeID, int itemCount, Date addedDate,
            String addedBy, Date updatedDate, String updateBy){
        
        this.itemID = itemID;
        this.itemTypeID = itemTypeID;
        this.itemCount = itemCount;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
}
