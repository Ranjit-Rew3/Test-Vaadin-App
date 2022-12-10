package org.vaadin.examples.form.data;

import org.vaadin.examples.form.data.db.DB;
import org.vaadin.examples.form.data.db.DBTables;
import org.vaadin.examples.form.data.utils.PasswordHashUtil;

import java.sql.Statement;

/**
 * DB Setup utility. You can add this in application bootstrap hook to initialize database and create default data.
 *
 * @author Ranjit Kaliraj on 12/4/22
 */
public class DBSetup {

    public static final String DEFAULT_LOGIN_USERNAME = "admin";

    private final DB db;

    public DBSetup() {
        db = new DB();
    }

    /**
     * Clear all database data and create new tables, default data.
     * Default user credential created is - admin/admin.
     */
    public void resetDB() {

        System.out.println("Resetting database...");
        db.execute(connection -> {
            Statement statement = connection.createStatement();
            System.out.println("Deleting existing tables...");
            statement.executeUpdate("drop table if exists "+ DBTables.Client.NAME);
            statement.executeUpdate("drop table if exists "+ DBTables.LOGIN.NAME);

            System.out.println("Creating new table for client...");
            statement.executeUpdate("create table "+DBTables.Client.NAME+" (" +
                    DBTables.Client.Fields.ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    DBTables.Client.Fields.FIRST_NAME+" text, " +
                    DBTables.Client.Fields.LAST_NAME+" text, " +
                    DBTables.Client.Fields.CITIZEN_SHIP_FILE +" blob)");

            System.out.println("Creating new table for login...");
            statement.executeUpdate("create table "+DBTables.LOGIN.NAME+" (" +
                    DBTables.LOGIN.Fields.ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    DBTables.LOGIN.Fields.USERNAME+" text not null, " +
                    DBTables.LOGIN.Fields.PASSWORD+" char(20) not null," +
                    DBTables.LOGIN.Fields.USER_MODIFIED+" INTEGER)");

            System.out.println("Adding default login users...");
            String username = DEFAULT_LOGIN_USERNAME;
            String password = PasswordHashUtil.hash("admin");
            statement.executeUpdate("insert into "+DBTables.LOGIN.NAME+"("+DBTables.LOGIN.Fields.USERNAME+", "+DBTables.LOGIN.Fields.PASSWORD+", "+DBTables.LOGIN.Fields.USER_MODIFIED+") values('"+username+"', '"+password+"', 0)");

            System.out.println("Resetting database completed.");
        });
    }

}
