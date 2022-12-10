package org.vaadin.examples.form.data;

import org.vaadin.examples.form.data.db.DB;
import org.vaadin.examples.form.data.db.DBTables;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class AdminDAO {

    private final DB db;

    public AdminDAO() {
        db = new DB();
    }

    public AuthenticationResult authenticate(String username, String password) {
        AuthenticationResult result = new AuthenticationResult();
        result.setSuccess(false);
        result.setDefaultPasswordChanged(false);
        db.execute(connection -> {
            String sql = "select count(*), "+DBTables.LOGIN.Fields.USER_MODIFIED+" from "+ DBTables.LOGIN.NAME + " where "+DBTables.LOGIN.Fields.USERNAME+"=? and "+DBTables.LOGIN.Fields.USERNAME+"=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                result.setSuccess(resultSet.getInt(1) == 1);
                result.setDefaultPasswordChanged(resultSet.getInt(2) == 1);
            }
        });
        return result;
    }

    public boolean changePassword(String username, String oldPassword, String newPassword) {
        AtomicBoolean hasChanged = new AtomicBoolean(false);
        db.execute(connection -> {
            String sql = "update "+ DBTables.Client.NAME + "set " +
                    DBTables.LOGIN.Fields.PASSWORD+"=?, " +
                    DBTables.LOGIN.Fields.USER_MODIFIED+"=1 " +
                    "where "+DBTables.LOGIN.Fields.USERNAME +"=? and "+ DBTables.LOGIN.Fields.PASSWORD + "=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newPassword);
            statement.setString(1, username);
            statement.setString(1, oldPassword);
            hasChanged.set(statement.execute());
        });
        return hasChanged.get();
    }

    public static class AuthenticationResult {
        private boolean isSuccess;
        private boolean isDefaultPasswordChanged;

        public boolean isSuccess() {
            return isSuccess;
        }

        public void setSuccess(boolean success) {
            isSuccess = success;
        }

        public boolean isDefaultPasswordChanged() {
            return isDefaultPasswordChanged;
        }

        public void setDefaultPasswordChanged(boolean defaultPasswordChanged) {
            this.isDefaultPasswordChanged = defaultPasswordChanged;
        }
    }

}
