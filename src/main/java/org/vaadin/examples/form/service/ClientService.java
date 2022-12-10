package org.vaadin.examples.form.service;

import org.vaadin.examples.form.data.ClientDAO;
import org.vaadin.examples.form.data.model.Client;
import org.vaadin.examples.form.service.common.Response;
import org.vaadin.examples.form.service.common.ResponseStatus;

import java.util.List;
import java.util.Optional;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class ClientService {

    private final ClientDAO clientDAO;

    public ClientService() {
        clientDAO = new ClientDAO();
    }

    public Optional<Client> getClient(int clientId) {
        return clientDAO.getById(clientId);
    }

    public List<Client> getClients(int limit, int offset) {
        return clientDAO.list(limit, offset);
    }

    public int countClients() {
        return clientDAO.count();
    }

    public Response addClient(String firstName, String lastName, byte[] citizenshipFile) {
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setCitizenShipFile(citizenshipFile);
        boolean isCreated = clientDAO.create(client);
        Response response = new Response();
        if(isCreated) {
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("SUCCESS - Client information is added");
        } else {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage("FAILED - Unable to add Client Information");
        }
        return response;
    }

    public Response deleteClient(int clientId) {
        boolean isDeleted = clientDAO.delete(clientId);
        Response response = new Response();
        if(isDeleted) {
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("SUCCESS - Client information is added");
        } else {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage("FAILED - Unable to add Client Information");
        }
        return response;
    }
}
