package pap.util;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *Global constants that will be used in different views and classes.
 * @author John Paul Jayme jpaul.jayme.com
 */
public class GlobalConstants {

    public static String NAME_REGEX = "[A-Za-zÑñ]+";
    public static String NUMBER_REGEX = "[0-9]+";
    public static String CONTACTNUMBER_REGEX = "^\\+?[0-9]+";
    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM-dd-yyyy");
    public static String NAME_ERROR = "Invalid string for name field.";
    public static String NAME_SUCCESS = "Valid name field format.";
    public static String DATE_ERROR = "Invalid date format.";
    public static String DATE_EMPTY_ERROR = "Missing date.";
    public static String DATE_SUCCESS = "Valid date format.";
    public static String SEX_SUCCESS = "Valid sex input.";
    public static String SEX_ERROR = "Invalid sex input.";
    public static String EMAIL_SUCCESS = "Valid email format.";
    public static String EMAIL_ERROR = "Invalid email format.";
    public static String CONTACTNUMBER_SUCCESS = "Valid contact number format.";
    public static String CONTACTNUMBER_ERROR = "Invalid contact number format.";

}
