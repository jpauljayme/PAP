
package pap.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Class for Person entity.
 * @author      John Paul Jayme <jpaul.jayme.com>
 * 
 *
 * 
 */
import java.util.Date;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {
    @Id
    @Column(name="PersonID")
    private int personID;
    @Column(name="PersonTypeID")
    private int personTypeID;
    @Column(name="AddressID")
    private int addressID;
    @Column(name="LastName")
    private String lastName;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="MiddleName")
    private String middleName;
    @Column(name="BirthDate")
    private Date birthDate;
    @Column(name="Email")
    private String email;
    @Column(name="ContactNumber")
    private String contactNumber;
    @Column(name="AddedDate")
    private Date addedDate;
    @Column(name="AddedBy")
    private int addedBy;
    @Column(name="UpdatedDate")
    private Date updatedDate;
    @Column(name="UpdatedBy")
    private int updatedBy;
    
    /**
     *Constructor with parameters.
     * @param personID
     * @param personTypeID
     * @param addressID
     * @param lastName
     * @param firstName
     * @param middleName
     * @param birthDate
     * @param email
     * @param contactNumber
     * @param addedBy
     * @param updatedBy
     */
    public Person(int personID, int personTypeID, int addressID, 
                  String lastName, String firstName, String middleName, Date birthDate,
                  String email, String contactNumber, Date addedDate, int addedBy,
                  Date updatedDate, int updatedBy){
        this.personID = personID;
        this.personTypeID = personTypeID;
        this.addressID = addressID;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.contactNumber = contactNumber;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
        
    }
    
    /**
     *Default constructor.
     */
    public Person(){
        this.personID = 0;
        this.personTypeID = 0;
        this.addressID = 0;
        this.lastName = "";
        this.middleName = "";
        this.firstName = "";
        this.birthDate = new Date();
        this.email = "";
        this.contactNumber = "";
        this.addedBy = 0;
        this.updatedBy = 0;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the Person's ID
     * @return the personID
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * Returns the Person's PersonType ID
     * @return the personTypeID
     */
    public int getPersonTypeID() {
        return personTypeID;
    }

    /**
     * Returns the Person's Address ID
     * @return the addressID
     */
    public int getAddressID() {
        return addressID;
    }

    /**
     * Returns the Person's last name
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the Person's first name
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the Person's middle name
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Returns the Person's date of birth
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Returns the Person's email address
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the Person's contact number
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Returns the date when the Person was added
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who added the Person
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the Person was updated
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Returns the ID of the entity who updated the Person
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the Person's PersonType ID
     * @param personTypeID the personTypeID to set
     */
    public void setPersonTypeID(int personTypeID) {
        this.personTypeID = personTypeID;
    }

    /**
     * Sets the Person's Address ID
     * @param addressID the addressID to set
     */
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    /**
     * Sets the Person's last name
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the Person's first name
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the Person's middle name
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Sets the Person's date of birth
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Sets the Person's email address
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the Person's contact number
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Sets the ID of the entity who added the Person
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the ID of the entity who updated the Person
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
