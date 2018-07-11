package pap.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import pap.dbconnection.MySQLConnector;
import pap.domain.Address;
import pap.domain.Employee;
import pap.domain.Person;
import pap.domain.ResultSetMapper;

/**
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class EmployeeController {

    private static PreparedStatement statement;
    private static List<Person> employeeList;

    /**
     * Creates an employee and adds it to the person table.
     *
     * @param emp employee to be added
     * @param address address related to the employee to be added
     * @return true if successful, false if unsuccessful.
     */
    public static boolean addEmployee(Employee emp, Address address) {

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {
            int addressID = addressController.insertAddress(address);
            System.out.println(addressID);
            java.sql.Date sqlBirthDate = java.sql.Date.valueOf(emp.getBirthDate());

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
            int ret = statement.executeUpdate();
            MySQLConnector.closeConnection();

            if (ret != 0) {
                System.out.print("Succesffuly inserted into the person table");
                return true;
            } else {
                System.out.print("Unsuccesful in inserting.");
                return false;
            }

        } catch (SQLException s) {

        }
        return false;
    }

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

    public static List<Person> getEmployee(int empID) {
        ResultSet resultSet;
        ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();

        // simple JDBC code to run SQL query and populate resultSet - START
        MySQLConnector.openConnection();
        try (Connection connection = MySQLConnector.getConnection()) {

            String viewEmployee = "SELECT p.PersonID, p.AddressID, p.FirstName, p.MiddleName, "
                    + "p.LastName, p.BirthDate, p.Sex, p.ContactNumber, p.Email "
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

            String viewEmployee = "SELECT p.PersonID, p.FirstName, p.MiddleName, "
                    + "p.LastName, p.BirthDate, p.Sex, p.ContactNumber, p.Email "
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

    public static void main(String[] args) throws SQLException {
        Address a = new Address(null, null, null, "123", "No Street", "Tintay", "Cebu City", 2, 2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        String bdate = "1996-12-30";
        // LocalDate birthDate = LocalDate.parse(bdate, formatter);
        Employee e = new Employee(3, "Marvin", "Aaa", "Lim", bdate, 'M',
                "marbeen@gmail,com", "+639325442218", 2, 2);
        //addEmployee(e, a);
        //List l = getEmployees();
        List l = getEmployee(8);
        if (l.isEmpty() == false) {
            System.out.println("Successfully retrieved employee");
            Person emp = (Person) l.get(0);
            boolean ret = removeEmployee(emp.getPersonID(), emp.getAddressID());
            if (ret != false) {
                System.out.println("Successfully removed person");
            } else {
                System.out.println("Failed to remove person");
            }
        }

    }
}
