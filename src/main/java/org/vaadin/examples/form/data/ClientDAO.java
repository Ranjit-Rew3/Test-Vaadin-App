package org.vaadin.examples.form.data;

import org.vaadin.examples.form.data.db.DB;
import org.vaadin.examples.form.data.db.DBTables;
import org.vaadin.examples.form.data.model.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class ClientDAO {

    private final DB db;

    public ClientDAO() {
        db = new DB();
    }

    public boolean create(Client client) {
        AtomicBoolean isCreated = new AtomicBoolean(false);
        db.execute(connection -> {
            String sql = "insert into "+ DBTables.Client.NAME +"(" +
                    DBTables.Client.Fields.FIRST_NAME +"," +
                    DBTables.Client.Fields.LAST_NAME +"," +
                    DBTables.Client.Fields.CITIZEN_SHIP_FILE +
                    ") values(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, client.getFirstName());
            statement.setString(2, client.getLastName());
            statement.setBytes(3, client.getCitizenShipFile());
            isCreated.set(statement.execute());
        });
        return isCreated.get();
    }

    public boolean delete(int id) {
        AtomicBoolean isDeleted = new AtomicBoolean(false);
        db.execute(connection -> {
            String sql = "delete from "+ DBTables.Client.NAME + "where "+DBTables.Client.Fields.ID +" = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            isDeleted.set(statement.execute());
        });
        return isDeleted.get();
    }

    public List<Client> list(int limit, int offset) {
        List<Client> result = new ArrayList<>();
        db.execute(connection -> {
            String sql = "select * from "+ DBTables.Client.NAME + " limit ? " + " offset ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, limit);
            statement.setInt(2, offset);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Client client = resultSetToClient(resultSet);
                result.add(client);
            }
        });
        return result;
    }

    public int count() {
        AtomicInteger count = new AtomicInteger(0);
        db.execute(connection -> {
            String sql = "select count(*) from "+ DBTables.Client.NAME;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count.set(resultSet.getInt(1));
            }
        });
        return count.get();
    }

    public Optional<Client> getById(int clientId) {
        AtomicReference<Client> result = new AtomicReference<>(null);
        db.execute(connection -> {
            String sql = "select * from "+ DBTables.Client.NAME + " where ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, clientId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Client client = resultSetToClient(resultSet);
                result.set(client);
            }
        });
        return Optional.ofNullable(result.get());
    }

    private Client resultSetToClient(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String firstName = resultSet.getString(2);
        String lastName = resultSet.getString(3);
        byte[] citizenshipFile = resultSet.getBytes(4);

        Client client = new Client();
        client.setId(id);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setCitizenShipFile(citizenshipFile);

        return client;
    }

}
