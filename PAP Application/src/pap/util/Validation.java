package pap.util;

import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.joda.time.format.*;

/**
 * Contains methods for validation of data.
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class Validation {

    /**
     * Validates dates.
     *
     * @param strDate date to be checked
     * @param format allowed date format
     * @return true if valid date else returns false
     */
    public static boolean validateDate(String strDate, String format) {
        org.joda.time.DateTime date = null;
        boolean ret;
        try {
            DateTimeFormatter fmt = DateTimeFormat.forPattern(format);
            date = fmt.parseDateTime(strDate);
            ret = true;
        } catch (Exception e) {
            ret = false;
        }
        return ret;
    }

    /**
     * Validates email address
     *
     * @param email email to be checked.
     * @return true if valid email else returns false
     */
    public static boolean isValidEmailAddress(String email) {
        boolean result;
        if(email.length() > GlobalConstants.MAX_LENGTH_EMAIL){
           return false; 
        }
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            result = true;
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
        return !(phoneNo.trim().length() > GlobalConstants.MAX_LENGTH_CONTACTNUMBER)
                && phoneNo.matches(GlobalConstants.CONTACTNUMBER_REGEX); //return false if nothing matches the input

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
        return !firstName.isEmpty() && firstName.length() > GlobalConstants.MAX_LENGTH_FIRSTNAME
                && Pattern.matches(GlobalConstants.NAME_REGEX, firstName)
                && !middleName.isEmpty() && middleName.length() > GlobalConstants.MAX_LENGTH_MIDDLENAME
                && Pattern.matches(GlobalConstants.NAME_REGEX, middleName)
                && !lastName.isEmpty() && lastName.length() > GlobalConstants.MAX_LENGTH_LASTNAME
                && Pattern.matches(GlobalConstants.NAME_REGEX, lastName);
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
     * Checks if string is empty
     *
     * @param s string to be checked
     * @return true if string is empty else false
     */
    public static boolean empty(final String s) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().isEmpty();
    }
    
    /**
     * Checks if string is in the max length bounds
     *
     * @param s string to be checked
     * @param maxLength maximum length of target string
     * @return true if string exceeds maximum length else false
     */
    public static boolean validateString(final String s, int maxLength){
        return s.length() > maxLength;
    }
    
    public static void main(String args[]) {
        //validateDate("10-02-201-");
        //System.out.print(validateDate("10-02-2012 ", GlobalConstants.DATE_FORMAT2));
        System.out.print(validateContactNumber("0932544218"));
    }

}
