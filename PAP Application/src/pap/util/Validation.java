package pap.util;

import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *Contains methods for validation of data.
 * @author John Paul Jayme jpaul.jayme.com
 */
public class Validation {

    /**
     * Validates dates. 
     *
     * @param strDate date to be checked
     * @return true if valid date else returns false
     */    
    public static boolean validateJavaDate(String strDate) {
        /* Check if date is 'null' */
        if (strDate.trim().equals("")) {
            System.out.println(GlobalConstants.DATE_ERROR);
            return false;
        } /* Date is not 'null' */ else {
            /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            //SimpleDateFormat sdfrmt = new SimpleDateFormat("MM-dd-yyyy");
            GlobalConstants.DATE_FORMAT.setLenient(false);
            /* Create Date object
	     * parse the string into date 
             */
            try {
                Date javaDate = GlobalConstants.DATE_FORMAT.parse(strDate);
                System.out.println(strDate + GlobalConstants.DATE_SUCCESS);
            } /* Date format is invalid */ catch (ParseException e) {
                System.out.println(strDate + GlobalConstants.DATE_ERROR);
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    /**
     * Validates email address
     *
     * @param email email to be checked.
     * @return true if valid email else returns false
     */      
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    /**
     * Validates contact number
     *
     * @param phoneNo contact number to be checked
     * @return true if valid contact number else returns false
     */      
    public static boolean validateContactNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        return phoneNo.matches(GlobalConstants.CONTACTNUMBER_REGEX); //return false if nothing matches the input

    }
    
    /**
     * Validates name fields.
     *
     * @param firstName represents first name
     * @param middleName represents middle name
     * @param lastName represents last name
     * @return true if all name fields are valid else returns false
     */  
    public static boolean validateName(String firstName, String middleName, String lastName) {
        return !firstName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, firstName)
                && !middleName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, middleName)
                && !lastName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, lastName);
    }

    /**
     * Validates sex.
     *
     * @param sex sex to be checked
     * @return true if valid sex else returns false
     */      
    public static boolean validateSex(char sex) {
        boolean ret;
        switch (sex) {
            case 'M':
            case 'm':
            case 'F':
            case 'f':
                ret = true;
                break;
            default:
                ret = false;
        }
        return ret;
    }
    /**
     * Validates strings
     *
     * @param s string to be checked
     * @return true if string is empty else false
     */  
    public static boolean empty(final String s) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().isEmpty();
    }

    
    public static void main(String args[]) {
    }
}
