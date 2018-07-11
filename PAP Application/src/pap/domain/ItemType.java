package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *Class that describes the item type.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class ItemType implements Serializable {
    @Id
    @Column(name="ItemTypeID")
    private int itemTypeID;
    @Column(name="ItemTypeName")
    private String itemTypeName;
    @Column(name="ItemTypePrice")
    private float itemTypePrice;
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
    public ItemType(){
        this.itemTypeID = 0;
        this.itemTypeName = null;
        this.itemTypePrice = 0;
        this.addedBy = 0;
        this.updatedBy = 0;
    }
    
    /**
     *Constructor with parameters.
     * @param itemTypeName
     * @param itemTypePrice
     * @param addedBy
     * @param updatedBy
     */
    public ItemType(String itemTypeName, float itemTypePrice, int addedBy, int updatedBy){
        this.itemTypeName = itemTypeName;
        this.itemTypePrice = itemTypePrice;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
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
     * Sets the ID of the ItemType
     * @param itemTypeID the itemTypeID to set
     */
    public void setItemTypeID(int itemTypeID) {
        this.itemTypeID = itemTypeID;
    }

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
     * Sets the ID of the entity who added the ItemType
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }
    
    /**
     * Sets the Date when the ItemType was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who updated the ItemType
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    /**
     * Sets the Date when the ItemType was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
