package pap.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class Validation {

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

    public static boolean validateContactNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        return phoneNo.matches(GlobalConstants.CONTACTNUMBER_REGEX); //return false if nothing matches the input

    }

    public static boolean validateName(String firstName, String middleName, String lastName) {
        return !firstName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, firstName)
                && !middleName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, middleName)
                && !lastName.isEmpty() && Pattern.matches(GlobalConstants.NAME_REGEX, lastName);
    }

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

    public static void main(String args[]) {
        validateJavaDate("");
        validateJavaDate("12-29-2016");
        validateJavaDate("1a-29-2016");
        validateJavaDate("12,29,2016");
    }
}
