package pap.domain;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class Employee extends Person{
    
    public Employee(int personTypeID, int addressID,
            String lastName, String firstName, String middleName, String birthDate,
            char sex, String email, String contactNumber, int addedBy, int updatedBy){
        
        super(personTypeID, addressID, lastName, firstName, middleName,
                birthDate, sex, email, contactNumber, addedBy, updatedBy);
    }
    
    
}
