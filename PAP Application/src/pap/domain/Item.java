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
    private int addedBy;
    private Date updatedDate;
    private int updatedBy;
    private int itemCounter = 1;
    /**
     *Default constructor.
     */
    public Item(){
        itemID = itemCounter++;
        this.itemTypeID = 0;
        this.itemCount = 0;
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedBy = 0;
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
            int addedBy, Date updatedDate, int updateBy){
        
        this.itemID = itemID;
        this.itemTypeID = itemTypeID;
        this.itemCount = itemCount;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the Item ID
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Returns the Item Type ID
     * @return the itemTypeID
     */
    public int getItemTypeID() {
        return itemTypeID;
    }

    /**
     * Returns the number of items
     * @return the itemCount
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Returns the date the Item was created
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who added the Item
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the Item was updated
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Returns the ID of the entity who updated the Item
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the type ID of the Item
     * @param itemTypeID the itemTypeID to set
     */
    public void setItemTypeID(int itemTypeID) {
        this.itemTypeID = itemTypeID;
    }

    /**
     * Sets the number of items
     * @param itemCount the itemCount to set
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Sets the date the Item was created
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who added the Item
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the Item was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Sets the ID of the entity who updated the Item
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
