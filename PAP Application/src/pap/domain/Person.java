
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
    private String addedBy;
    private Date updatedDate;
    private String updatedBy;
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
            String email, String contactNumber, Date addedDate, String addedBy,
            Date updatedDate, String updatedBy){
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
        this.addedBy = "";
        this.updatedDate = new Date();
        this.updatedBy = "";
    }
}
