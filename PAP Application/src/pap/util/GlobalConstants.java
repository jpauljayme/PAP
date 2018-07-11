package pap.util;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Global constants that will be used in different views and classes.
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class GlobalConstants {

    //Different regex used for validation
    public static String NAME_REGEX = "[A-Za-zÑñ]+";
    public static String NUMBER_REGEX = "[0-9]+";
    public static String DATE_REGEX = "[0-9\\-]+";
    public static String CONTACTNUMBER_REGEX = "^\\+?[0-9]+";

    //Accepted Date format
    //ublic static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM-dd-yyyy");
    public static String DATE_FORMAT = "MM-dd-yyyy";
    //Different pop up messages used in warnings.
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

    //maximum string length for person string fields
    public static int MAX_LENGTH_FIRSTNAME = 30;
    public static int MAX_LENGTH_MIDDLENAME = 15;
    public static int MAX_LENGTH_LASTNAME = 20;
    public static int MAX_LENGTH_BIRTHDATE = 10;
    public static int MAX_LENGTH_CONTACTNUMBER = 15;
    public static int MAX_LENGTH_EMAIL = 40;

    //maximum string length for address string fields
    public static int MAX_LENGTH_FLOOR = 15;
    public static int MAX_LENGTH_ROOMNUMBER = 10;
    public static int MAX_LENGTH_BUILDINGNAME = 30;
    public static int MAX_LENGTH_HOUSENUMBER = 10;
    public static int MAX_LENGTH_STREET = 20;
    public static int MAX_LENGTH_BARANGAY = 15;
    public static int MAX_LENGTH_CITY = 15;

    //maximum length for password
    public static int MAX_LENGTH_PASSWORD = 32;

    //maximum length for username
    public static int MAX_LENGTH_USERNAME = 20;

    //maximum length for PersonType
    public static int MAX_LENGTH_PERSONTYPE = 8;

    //transaction types - RUSHED, REGULAR
    public static int MAX_LENGTH_TRANSACTIONTYPE = 7;

    //item type name - BEDDINGS, CLOTHING
    public static int MAX_LENGTH_ITEMTYPENAME = 8;
}
