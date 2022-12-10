package org.vaadin.examples.form.data.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ranjit Kaliraj on 12/3/22
 */
public class DB {

    private final String URL = "jdbc:sqlite:data.db";

    public void execute(DBConnectionProvider connectionProvider) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL);
            connectionProvider.execute(connection);
        }
        catch(SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if(connection != null)
                    connection.close();
            }
            catch(SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }

    @FunctionalInterface
    public interface DBConnectionProvider {
        public void execute(Connection connection) throws SQLException;
    }

}