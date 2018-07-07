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
    private String addedBy;
    private Date addedDate;
    private String updatedBy;
    private Date updatedDate;
    private static int addressCount = 1;
    
    /**
     *Default constructor.
     */
    public Address(){
        this.addressID = addressCount++;
        this.floor = "";
        this.roomNumber = 0;
        this.buildingName = "";
        this.addedDate = new Date();
        this.addedBy = "";
        this.updatedBy = "";
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
    public Address(String floor, int roomNumber, 
            String buildingName, Date addedDate,
            String addedBy, Date updatedDate, String updatedBy){
        addressID = addressCount++;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    
}
