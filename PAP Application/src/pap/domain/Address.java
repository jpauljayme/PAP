package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

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
    private String roomNumber;
    @Column(name="BuildingName")
    private String buildingName;
    @Column(name="HouseNumber")
    private String houseNumber;
    @Column(name="Street")
    private String street;
    @Column(name="Barangay")
    private String barangay;
    @Column(name="City")
    private String city;
    @Column(name="AddedBy")
    private int addedBy;
    @Column(name="AddedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date addedDate;
    @Column(name="UpdatedBy")
    private int updatedBy;
    @Column(name="UpdatedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updatedDate;
    
    /**
     *Default constructor.
     */
    public Address(){
        this.addressID = 0;
        this.floor = "";
        this.roomNumber = "";
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
     * @param houseNumber
     * @param street
     * @param barangay
     * @param city
     */

    public Address(String floor, String roomNumber, String buildingName,
            String houseNumber, String street, String barangay, String city,
            int addedBy, int updatedBy){
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        this.houseNumber = houseNumber;
        this.street = street;
        this.barangay = barangay;
        this.city = city;
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
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Returns the building name
     * @return the buildingName
     */
    public String getBuildingName() {
        return buildingName;
    }
    
    /**
     * Returns the house number
     * @return the houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }
    
    /**
     * Returns the street
     * @return the street
     */
    public String getStreet() {
        return street;
    }
    
    /**
     * Returns the barangay
     * @return the barangay
     */
    public String getBarangay() {
        return barangay;
    }
    
    /**
     * Returns the city
     * @return the city
     */
    public String getCity() {
        return city;
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
    public void setRoomNumber(String roomNumber) {
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
     * Sets the house number of the Address
     * @param houseNumber
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    /**
     * Sets the street of the Address
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }
    
    /**
     * Sets the barangay of the Address
     * @param barangay
     */
    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }
    
    /**
     * Sets the city of the Address
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
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
