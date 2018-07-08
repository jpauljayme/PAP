package pap.domain;

import java.util.Date;

/**
 *Class that defines address of the customer.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class Address {

    private int addressID;
    private String floor;
    private int roomNumber;
    private String buildingName;
    private int addedBy;
    private Date addedDate;
    private int updatedBy;
    private Date updatedDate;
    
    /**
     *Default constructor.
     */
    public Address(){
        this.addressID = 0;
        this.floor = "";
        this.roomNumber = 0;
        this.buildingName = "";
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedBy = 0;
        this.updatedDate = new Date();
    }
    
    /**
     *Constructor that accepts parameters.
     * 
     * @param floor
     * @param roomNumber
     * @param buildingName
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updatedBy
     */
    public Address(int addressID, String floor, int roomNumber, 
            String buildingName, Date addedDate,
            int addedBy, Date updatedDate, int updatedBy){
        addressID = addressID;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the Address ID
     * @return the addressID
     */
    public int getAddressID() {
        return addressID;
    }

    /**
     * Returns the building floor
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Returns the room number
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Returns the  building name
     * @return the buildingName
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Returns the ID of the entity who added the Address
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the Address was added
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who updated the Added
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Returns the date of the last time the Address was updated
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the floor of the Address
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * Sets the room number of the Address
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Sets the building name of the Address
     * @param buildingName the buildingName to set
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Sets the field to the ID of the entity who added the Address
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the Address was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the field to the ID of the entity who updated the Address
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Sets the date to when the Address was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    
}
