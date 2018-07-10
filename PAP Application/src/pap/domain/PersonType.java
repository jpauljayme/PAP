package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *Class that specifies the privilege/type of a user.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class PersonType implements Serializable {
    @Id
    @Column(name="PersonTypeID")
    private int personTypeID;
    @Column(name="PersonType")
    private String personType;
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
     *Constructor with parameters.
     * @param personTypeID
     * @param personType
     * @param addedBy
     * @param updatedBy
     */
    public PersonType(int personTypeID, String personType, 
                      int addedBy, int updatedBy){
        this.personTypeID = personTypeID;
        this.personType = personType;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        
    }
    
    /**
     *Default constructor.
     */
    public PersonType(){
        this.personTypeID = 0;
        this.personType = "Person";
        this.addedBy = 0;
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
     * Sets the PersonType ID
     * @param personTypeID the personTypeID to set
     */
    public void setPersonTypeID(int personTypeID) {
        this.personTypeID = personTypeID;
    }

    /**
     * Sets the PersonType name
     * @param personType the personType to set
     */
    public void setPersonType(String personType) {
        this.personType = personType;
    }

    /**
     * Sets the ID of the entity who added the PersonType
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }
    
    /**
     * Sets the Date when the PersonType was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who updated the personType
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    /**
     * Sets the Date when the PersonType was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
