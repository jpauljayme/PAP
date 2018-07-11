package pap.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pap.dbconnection.MySQLConnector;
import pap.domain.Address;
import pap.domain.Employee;
import pap.domain.Person;
import pap.domain.PersonType;
import pap.domain.ResultSetMapper;
import static pap.functionality.dataExist.getRow;
import static pap.functionality.getLastID.getLastInsertID;
import pap.util.GlobalConstants;
import pap.util.Validation;

/**
 * Contains methods to manipulate data from view. Includes CRUD operations.
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class EmployeeController {

    private static PreparedStatement statement;
    private static List<Person> employeeList;
    private static List<PersonType> personType;

    /**
     * Creates an employee and adds it to the person table.
     *
     * @param emp employee to be added
     * @param address address related to the employee to be added
     * @return true if successful, false if unsuccessful.
     */
    public static int addEmployee(Employee emp, Address address) {

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {
            int addressID = addressController.insertAddress(address);

            String query = "INSERT INTO person(PersonTypeID, AddressID,"
                    + "FirstName, MiddleName, LastName, BirthDate, Sex, "
                    + "ContactNumber, Email, AddedBy, UpdatedBy) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

            statement = connection.prepareStatement(query);
            statement.setInt(1, emp.getPersonTypeID());
            statement.setInt(2, addressID);
            statement.setString(3, emp.getFirstName());
            statement.setString(4, emp.getMiddleName());
            statement.setString(5, emp.getLastName());
            statement.setObject(6, emp.getBirthDate());
            statement.setString(7, String.valueOf(emp.getSex()));
            statement.setString(8, emp.getContactNumber());
            statement.setString(9, emp.getEmail());
            statement.setInt(10, emp.getAddedBy());
            statement.setInt(11, emp.getUpdatedBy());

            System.out.println(statement.toString());
            statement.executeQuery();
            int id = getLastInsertID(connection);
            MySQLConnector.closeConnection();
            System.out.println("Employee reach");

            return id;

        } catch (SQLException s) {

        }
        return 0;
    }

    /**
     * Removes employee from person table
     *
     * @param empID employee ID to be removed
     * @param addressID address ID related to the employee to be removed
     * @return true if successful, false if unsuccessful.
     */
    public static boolean removeEmployee(int empID, int addressID) {
        System.out.println("employeeID - " + empID + " AddrseID - " + addressID);
        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {
            boolean retVal;
            String query = "DELETE FROM person WHERE PersonID = ?";

            statement = connection.prepareStatement(query);
            statement.setInt(1, empID);

            System.out.println(statement.toString());
            int ret = statement.executeUpdate();

            MySQLConnector.closeConnection();

            if (ret != 0) {
                //remove address as well
                retVal = addressController.removeAddress(addressID);
                System.out.println(retVal);
                //Close connection

                if (retVal != false) {
                    System.out.println("Successfully removed person");
                    return true;
                } else {
                    System.out.println("Failed to remove person");
                    return false;
                }
            }

        } catch (SQLException s) {

        }
        return false;
    }

    /**
     * Returns employee.
     *
     * @param empID employeeID to be retrieved
     * @return person inserted in a List.
     */
    public static List<Person> getEmployee(int empID) {
        ResultSet resultSet;
        ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String viewEmployee = "SELECT p.PersonID, p.PersonTypeID, "
                    + "p.AddressID, p.FirstName, p.MiddleName, "
                    + "p.LastName, p.BirthDate, p.Sex, p.ContactNumber, p.Email, p.UpdatedBy "
                    + "FROM person AS p "
                    + "WHERE p.PersonID = ? ";

            statement = connection.prepareStatement(viewEmployee);
            statement.setInt(1, empID);
            System.out.print(statement.toString());
            resultSet = statement.executeQuery();

            // simple JDBC code to run SQL query and populate resultSet - END
            employeeList = resultSetMapper.mapResultSetToObject(resultSet, Person.class);

            // print out the list retrieved from database
            if (employeeList != null) {
                System.out.println(employeeList);
                return employeeList;
            } else {
                System.out.println("ResultSet is empty. Please check if database table is empty");
            }
        } catch (SQLException s) {

        }
        return employeeList;
    }

    /**
     * Returns a list of persons from the database.
     *
     * @return person list
     */
    public static List<Person> getEmployees() {

        ResultSet resultSet;
        ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String viewEmployee = "SELECT * " 
                    + "FROM person AS p "
                    + "WHERE p.PersonTypeID = ? ";

            statement = connection.prepareStatement(viewEmployee);
            statement.setInt(1, 3);
            System.out.print(statement.toString());
            resultSet = statement.executeQuery();

            // simple JDBC code to run SQL query and populate resultSet - END
            employeeList = resultSetMapper.mapResultSetToObject(resultSet, Person.class);

            // print out the list retrieved from database
            if (employeeList != null) {
                for (Person p : employeeList) {
                    System.out.println(p);
                }
            } else {
                System.out.println("ResultSet is empty. Please check if database table is empty");
            }
        } catch (SQLException s) {

        }

        return employeeList;
    }

    /**
     * Updates employee information.
     *
     * @param emp employee to be updated
     * @param address address associated with employee
     * @return true if successful, false if unsuccessful.
     */
    public static boolean updateEmployee(Person emp, Address address) {
        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {
            boolean retAddress;
            String query = "UPDATE person SET FirstName = ? , MiddleName = ? , "
                    + "LastName = ? , BirthDate = ? , Sex = ? , ContactNumber = ? , "
                    + "Email = ? , UpdatedBy = ? WHERE PersonID = ?";

            statement = connection.prepareStatement(query);

            statement.setString(1, emp.getFirstName());
            statement.setString(2, emp.getMiddleName());
            statement.setString(3, emp.getLastName());
            statement.setObject(4, emp.getBirthDate());
            statement.setString(5, String.valueOf(emp.getSex()));
            statement.setString(6, emp.getContactNumber());
            statement.setString(7, emp.getEmail());
            statement.setInt(8, emp.getUpdatedBy());
            statement.setInt(9, emp.getPersonID());

            System.out.println(statement.toString());
            int ret = statement.executeUpdate();
            MySQLConnector.closeConnection();
            if (ret != 0) {
                retAddress = addressController.updateAddress(address, emp.getPersonTypeID());
                if (retAddress == true) {
                    System.out.println("Succesffuly updated employee and"
                            + " corresponding address");
                    return true;
                } else {
                    System.out.println("Failed to update employee and"
                            + " corresponding address");
                    return false;
                }

            } else {
                System.out.println("Failed updating employee.");
                return false;
            }

        } catch (SQLException s) {
            System.out.print(s);
        }
        return false;
    }

    /**
     * Validates input from the view.
     *
     * @param firstName
     * @param middleName
     * @param lastName
     * @param birthDate
     * @param sex
     * @param email
     * @param contactNumber
     * @param addedBy
     * @return 
     *
     */
    public static String validateInput(String firstName, String middleName,
            String lastName, String birthDate, char sex, String email,
            String contactNumber, int addedBy) {
        //Validate addedBy ID
        
        MySQLConnector.openConnection();
        Connection connection = MySQLConnector.getConnection();
        
        try {
            if(getRow(connection, "person", "PersonID", addedBy) == false){
                return("InvalidAddedPerson");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Validate name fields.	         //Validate name fields.
         if (Validation.validateName(firstName, middleName, lastName) == false) {
            System.out.println(GlobalConstants.NAME_SUCCESS);
         }else {	   
            return(GlobalConstants.NAME_ERROR);
         }
        //Validate birthdate	
        if (Validation.validateDate(birthDate, GlobalConstants.DATE_FORMAT) == true) {	
            System.out.println(GlobalConstants.DATE_SUCCESS);	
        } else {	
            return(GlobalConstants.DATE_ERROR);	
        }	
	
        //Validate sex	
        if (Validation.validateSex(sex) == true) {	
            System.out.println(GlobalConstants.SEX_SUCCESS);	
        } else {	
            return(GlobalConstants.SEX_ERROR);	
        }	
	
        //Validate email	
        if (Validation.isValidEmailAddress(email) == true) {	
            System.out.println(GlobalConstants.EMAIL_SUCCESS);	
        } else {	
            return(GlobalConstants.EMAIL_ERROR);	
        }	
	
        //validate contact number	
        if (Validation.validateContactNumber(contactNumber)) {	
            System.out.println(GlobalConstants.CONTACTNUMBER_SUCCESS);	
        } else {	
            return(GlobalConstants.CONTACTNUMBER_SUCCESS);	
        }
        return("Valid");
    }

    /**
     * Returns employee.
     *
     * @param username Username that will be used in the query.
     * @return person inserted in a List.
     */
    public static Person getPersonByUsername(String username) {
        ResultSet resultSet;
        ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String query = "SELECT p.PersonTypeID, p.PersonID, p.FirstName, p.MiddleName, "
                    + "p.LastName, p.BirthDate, p.Sex, p.ContactNumber, "
                    + "p.Email, p.UpdatedBy FROM person p "
                    + "INNER JOIN credentials c "
                    + "WHERE "
                    + "c.Username = ? "
                    + "AND "
                    + "c.PersonID = p.PersonID";

            statement = connection.prepareStatement(query);
            statement.setString(1, username);
//            System.out.println(statement.toString());
            resultSet = statement.executeQuery();

            // simple JDBC code to run SQL query and populate resultSet - END
            employeeList = resultSetMapper.mapResultSetToObject(resultSet, Person.class);

            // print out the list retrieved from database
            if (employeeList != null) {
//                System.out.println(employeeList.get(0).getPersonID());
                return employeeList.get(0);

            } else {
                System.out.println("getPersonByUsername ResultSet is empty. Please check if database table is empty");
            }
        } catch (SQLException s) {

        }
        return new Person();
    }


    /**
     * Returns employee.
     *
     * @param empID Username that will be used in the query.
     * @return person inserted in a List.
     */
    public static Person getPersonByID(int empID) {
        ResultSet resultSet;
        ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String query = "SELECT p.PersonTypeID, p.PersonID, p.FirstName, p.MiddleName, "
                    + "p.LastName, p.BirthDate, p.Sex, p.ContactNumber, "
                    + "p.Email, p.UpdatedBy FROM person p "
                    + "WHERE "
                    + "p.PersonID = ?";

            statement = connection.prepareStatement(query);
            statement.setInt(1, empID);
            System.out.println(statement.toString());
            resultSet = statement.executeQuery();

            // simple JDBC code to run SQL query and populate resultSet - END
            employeeList = resultSetMapper.mapResultSetToObject(resultSet, Person.class);

            // print out the list retrieved from database
            if (employeeList != null) {
                System.out.println(employeeList.get(0).getPersonID());
                return employeeList.get(0);

            } else {
                System.out.println("getPersonByUsername ResultSet is empty. Please check if database table is empty");
            }
        } catch (SQLException s) {

        }
        return new Person();
    }
    
    /**
     * Returns persontype of specified personType ID
     *
     * @param personTypeID
     * @return PersonType
     */
    public static PersonType getPersonType(int personTypeID) {
        ResultSet resultSet;
        ResultSetMapper<PersonType> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String query = "SELECT * FROM persontype WHERE PersonTypeID=?";

            statement = connection.prepareStatement(query);
            statement.setInt(1, personTypeID);
            System.out.println(statement.toString());
            resultSet = statement.executeQuery();

            // simple JDBC code to run SQL query and populate resultSet - END
            personType = resultSetMapper.mapResultSetToObject(resultSet, PersonType.class);

            // print out the list retrieved from database
            if (personType != null) {
                return personType.get(0);

            } else {
                System.out.println("getPersonType ResultSet is empty. Please check if database table is empty");
            }
        } catch (SQLException s) {

        }
        return new PersonType();
    }

    /**
     * Checks if to be inserted person object exists in the database.
     *
     * @param person
     * @return true if person already exists else false
     */
    public static boolean ifPersonExists(Person person) {
        ResultSet resultSet;
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {
            String query = "SELECT FirstName, MiddleName, LastName, BirthDate, "
                    + "Sex FROM person "
                    + "WHERE FirstName = ? AND MiddleName = ? AND LastName = ? "
                    + "AND BirthDate = ? AND Sex = ?";

            statement = connection.prepareStatement(query);
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getMiddleName());
            statement.setString(3, person.getLastName());
            statement.setString(4, person.getBirthDate());
            statement.setString(5, String.valueOf(person.getSex()));
            System.out.println(statement.toString());
            resultSet = statement.executeQuery();
            boolean ret = resultSet.next();
            MySQLConnector.closeConnection();
            if (ret == true) {
                System.out.println("Employee already exists in the database!!");
                return false;
            } else {
                System.out.println("Employee does not exist in the database!!");
                return true;
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return false;
    }

    /**
     * Sample main method for checking methods
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        //Address a = new Address(null, null, null, "123", "No Street", "Tintay", "Cebu City", 2, 2);

        // String bdate = "1996-12-30";
        // LocalDate birthDate = LocalDate.parse(bdate, formatter);
        // Employee e = new Employee(3, "New name", "new mid", "new Lim", bdate, 'M',
        // "new_marbeen@gmail,com", "+639325442218", 2, 2);
        //addEmployee(e, a);
        //List l = getEmployees();
        //List l = getEmployee(7);
        /*if (l.isEmpty() == false) {
            System.out.println("Successfully retrieved employee");
            Person emp = (Person) l.get(0);
            boolean ret = removeEmployee(emp.getPersonID(), emp.getAddressID());
            if (ret != false) {
                System.out.println("Successfully removed person");
            } else {
                System.out.println("Failed to remove person");
            }
        }*/
        //  List l = getEmployee(7);
        //Person p = (Person) l.get(0);
//        p.setFirstName("UPDATED FN");
//        p.setMiddleName("UPDATED MN");
//        p.setLastName("YASS KWEEN");
//        p.setEmail("UPDATED@gmail.com");
//        p.setContactNumber("09325442218");
//        Address a = addressController.getAddress(p.getAddressID());
//        a.setBarangay("UPDATED");
//        a.setCity("shiity");
//        a.setHouseNumber("69");
//        a.setStreet("Hoee STREET");
//        System.out.println(updateEmployee(p, a));
        // getPersonByUsername("dante");
//        System.out.println("blam: "+getPersonByUsername("dante").getPersonID());
//        System.out.println("blam: "+getPersonType(3).getPersonType());
        //System.out.println(ifEmployeeExists(e));
    }
}
