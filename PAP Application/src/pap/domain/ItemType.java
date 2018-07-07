package pap.domain;

import java.util.Date;

/**
 *Class that describes the item type.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class ItemType {
    private int itemTypeID;
    private String itemTypeName;
    private float itemTypePrice;
    private Date addedDate;
    private int addedBy;
    private Date updatedDate;
    private int updatedBy;
    
    /**
     *Default constructor.
     */
    public ItemType(){
        this.itemTypeID = 0;
        this.itemTypeName = "";
        this.itemTypePrice = 0;
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedBy = 0;
        this.updatedDate = new Date();
    }
    
    /**
     *Constructor with parameters.
     * @param itemTypeID
     * @param itemTypeName
     * @param itemTypePrice
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updateBy
     */
    public ItemType(int itemTypeID, String itemTypeName, float itemTypePrice, Date addedDate,
                    int addedBy, Date updatedDate, int updateBy){
        
        this.itemTypeID = itemTypeID;
        this.itemTypeName = itemTypeName;
        this.itemTypePrice = itemTypePrice;
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedBy = 0;
        this.updatedDate = new Date();
    }

    /*
     * GETTERS
     */
    
    /**
     * Returns the ID of the ItemType
     * @return the itemTypeID
     */
    public int getItemTypeID() {
        return itemTypeID;
    }

    /**
     * Returns the ItemType name
     * @return the itemTypeName
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * Return the price of the ItemType
     * @return the itemTypePrice
     */
    public float getItemTypePrice() {
        return itemTypePrice;
    }

    /**
     * Returns the date when the ItemType was added
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who added the ItemType
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the ItemType was updated
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Returns the ID of the entity who updated the ItemType
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the name of the ItemType
     * @param itemTypeName the itemTypeName to set
     */
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    /**
     * Sets the price of the ItemType
     * @param itemTypePrice the itemTypePrice to set
     */
    public void setItemTypePrice(float itemTypePrice) {
        this.itemTypePrice = itemTypePrice;
    }

    /**
     * Sets the date when the ItemType was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who added the ItemType
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the ItemType was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Sets the ID of the entity who updated the ItemType
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
