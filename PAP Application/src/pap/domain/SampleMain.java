package pap.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pap.dbconnection.MySQLConnector;

/**
 *Sample Main Class for resultset mapper.
 * @author      John Paul Jayme <jpaul.jayme.com>
 *
 */
public class SampleMain {

    public static void main(String... args) {

        try {
            ResultSetMapper<Person> resultSetMapper = new ResultSetMapper<>();
            ResultSet resultSet = null;
            // simple JDBC code to run SQL query and populate resultSet - START
            MySQLConnector.openConnection();
            try (Connection connection = MySQLConnector.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM person");
                resultSet = statement.executeQuery();
                // simple JDBC code to run SQL query and populate resultSet - END
                List<Person> pojoList = resultSetMapper.mapResultSetToObject(resultSet, Person.class);
                // print out the list retrieved from database
                if (pojoList != null) {
                    for (Person p : pojoList) {
                        System.out.println(p);
                    }
                } else {
                    System.out.println("ResultSet is empty. Please check if database table is empty");
                }
            }
        } catch (SQLException e) {
        }

    }
}
