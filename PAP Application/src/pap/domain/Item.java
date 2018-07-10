package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *Class that defines an item.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class Item implements Serializable {
    @Id
    @Column(name="ItemID")
    private int itemID;
    @Column(name="ItemTypeID")
    private int itemTypeID;
    @Column(name="ItemCount")
    private int itemCount;
    @Column(name="AddedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date addedDate;
    @Column(name="AddedBy")
    private int addedBy;
    @Column(name="UpdatedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updatedDate;
    @Column(name="UpdatedBy")
    private int updatedBy;
    /**
     *Default constructor.
     */
    public Item(){
        itemID = 0;
        this.itemTypeID = 0;
        this.itemCount = 0;
        this.addedBy = 0;
        this.updatedBy = 0;
    }
    
    /**
     *Constructor that accepts parameters.
     * @param itemID
     * @param itemTypeID
     * @param itemCount
     * @param updatedBy
     * @param addedBy
     */
    public Item(int itemID, int itemTypeID, int itemCount,
                int addedBy, int updatedBy){
        
        this.itemID = itemID;
        this.itemTypeID = itemTypeID;
        this.itemCount = itemCount;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
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
     * Sets the ID of the Item
     * @param itemID
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

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
     * Sets the ID of the entity who added the Item
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }
    
    /**
     * Sets the Date when the Item was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who updated the Item
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    /**
     * Sets the Date when the Item was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
