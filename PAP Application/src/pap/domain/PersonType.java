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
    private String addedBy;
    private Date updatedDate;
    private String updatedBy;
    
    /**
     *Constructor with parameters.
     * @param personTypeID
     * @param personType
     * @param addedDate
     * @param addedBy
     * @param updatedDate
     * @param updatedBy
     */
    public PersonType(int personTypeID, String personType, Date addedDate, String addedBy,
            Date updatedDate, String updatedBy){
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
        this.addedBy = "";
        this.updatedDate = new Date();
        this.updatedBy = "";
    }
}
