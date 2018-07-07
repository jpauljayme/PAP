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
    private String addedBy;
    private Date updatedDate;
    private String updatedBy;
    
    /**
     *Default constructor.
     */
    public ItemType(){
        this.itemTypeID = 0;
        this.itemTypeName = "";
        this.itemTypePrice = 0;
        this.addedDate = new Date();
        this.addedBy = "";
        this.updatedBy = "";
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
            String addedBy, Date updatedDate, String updateBy){
        
        this.itemTypeID = itemTypeID;
        this.itemTypeName = itemTypeName;
        this.itemTypePrice = itemTypePrice;
        this.addedDate = new Date();
        this.addedBy = "";
        this.updatedBy = "";
        this.updatedDate = new Date();
    }
}
