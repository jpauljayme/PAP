package pap.domain;

import java.util.Date;

/**
 *Class that specifies the privilege/type of a user.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class PersonType {
    private int personTypeID;
    private String personType;
    private Date addedDate;
    private int addedBy;
    private Date updatedDate;
    private int updatedBy;
    
    /**
     *Constructor with parameters.
     * @param personTypeID
     * @param personType
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updatedBy
     */
    public PersonType(int personTypeID, String personType, Date addedDate, int addedBy,
            Date updatedDate, int updatedBy){
        this.personTypeID = personTypeID;
        this.personType = personType;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        
    }
    
    /**
     *Default constructor.
     */
    public PersonType(){
        this.personTypeID = 0;
        this.personType = "Person";
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedDate = new Date();
        this.updatedBy = 0;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the PersonType ID
     * @return the personTypeID
     */
    public int getPersonTypeID() {
        return personTypeID;
    }

    /**
     * Returns the PersonType name
     * @return the personType
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Returns the date when the PersonType was added
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who added the PersonType
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the PersonType was updated
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Returns the ID of the entity who updated the personType
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the PersonType name
     * @param personType the personType to set
     */
    public void setPersonType(String personType) {
        this.personType = personType;
    }

    /**
     * Sets the date when the PersonType was added
     * @param addedDate the addedDate to set
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who added the PersonType
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the PersonType was updated
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Sets the ID of the entity who updated the personType
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
