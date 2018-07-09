package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *Class that defines address of the customer.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class Address implements Serializable {
    @Id
    @Column(name="AddressID")
    private int addressID;
    @Column(name="Floor")
    private String floor;
    @Column(name="RoomNumber")
    private int roomNumber;
    @Column(name="BuildingName")
    private String buildingName;
    @Column(name="AddedBy")
    private int addedBy;
    @Column(name="AddedDate")
    private Date addedDate;
    @Column(name="UpdatedBy")
    private int updatedBy;
    @Column(name="UpdatedDate")
    private Date updatedDate;
    
    /**
     *Default constructor.
     */
    public Address(){
        this.addressID = 0;
        this.floor = "";
        this.roomNumber = 0;
        this.buildingName = "";
        this.addedBy = 0;
        this.updatedBy = 0;
    }
    
    /**
     *Constructor that accepts parameters.
     * 
     * @param floor
     * @param roomNumber
     * @param buildingName
     * @param addedBy
     * @param updatedBy
     */

    public Address(String floor, int roomNumber, 
                   String buildingName,
                   int addedBy, int updatedBy){
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
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
     * Sets the addressID of the Address
     * @param addressID
     */
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

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
     * Sets the Date when the Address was added
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
     * Sets the Date when the Address was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    public static void main(String[] args){
    
    }
    
}
