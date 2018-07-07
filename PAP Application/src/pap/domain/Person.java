
package pap.domain;
/**
 * Class for Person entity.
 * @author      John Paul Jayme <jpaul.jayme.com>
 * 
 *
 * 
 */
import java.util.Date;

public class Person {
    private int personID;
    private int personTypeID;
    private int addressID;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private String email;
    private String contactNumber;
    private Date addedDate;
    private int addedBy;
    private Date updatedDate;
    private int updatedBy;
    static int personCount = 1;
    
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
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updatedBy
     */
    public Person(int personID, int personTypeID, int addressID, 
            String lastName, String firstName, String middleName, Date birthDate,
            String email, String contactNumber, Date addedDate, int addedBy,
            Date updatedDate, int updatedBy){
        this.personID = personCount++;
        this.personTypeID = personTypeID;
        this.addressID = addressID;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.contactNumber = contactNumber;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        
    }
    
    /**
     *Default constructor.
     */
    public Person(){
        this.personID = personCount++;
        this.personTypeID = 0;
        this.addressID = 0;
        this.lastName = "";
        this.middleName = "";
        this.firstName = "";
        this.birthDate = new Date();
        this.email = "";
        this.contactNumber = "";
        this.addedDate = new Date();
        this.addedBy = 0;
        this.updatedDate = new Date();
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
     * Sets the date when the Person was added
     * @param addedDate the addedDate to set
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who added the Person
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the Person was updated
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Sets the ID of the entity who updated the Person
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
