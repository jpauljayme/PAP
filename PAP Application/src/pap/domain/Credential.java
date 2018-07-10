package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *Class forcCredential of a user in the system,
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
@Entity
public class Credential implements Serializable {
    @Id
    @Column(name="CredentialsID")
    private int credentialsID;
    @Column(name="PersonID")
    private int personID;
    @Column(name="Username")
    private String username;
    @Column(name="UserPassword")
    private String userPassword;
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
    public Credential(){
        this.credentialsID = 0;
        this.username = "";
        this.userPassword = "";
        this.addedBy = 0;
        this.updatedBy = 0;
    }
    
    /**
     *Constructor that accepts parameters.
     * @param credentialsID
     * @param username
     * @param password
     * @param addedBy
     * @param updatedBy
     */
    public Credential(int credentialsID, String username, String password,
                      int addedBy, int updatedBy){
        this.credentialsID = credentialsID;
        this.username = username;
        this.userPassword = password;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the Credential ID
     * @return the credentialID
     */
    public int getCredentialsID() {
        return credentialsID;
    }

    /**
     * Returns the username
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns a hashed password
     * @return the password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @return the personID
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }
    
        
    /*
     * SETTERS
     */
    
    /**
     * @param credentialsID
     */
    public void setCredentialsID(int credentialsID) {
        this.credentialsID = credentialsID;
    }

    /**
     * @param personID the personID to set
     */
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    /**
     * Sets the username field
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }
    
    /**
     * Sets the Date when the Credential was added
     * @param addedDate
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    /**
     * Sets the Date when the Credential was updated
     * @param updatedDate
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
