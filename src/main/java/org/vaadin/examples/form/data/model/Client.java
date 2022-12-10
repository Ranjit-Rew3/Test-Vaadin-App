package org.vaadin.examples.form.data.model;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private byte[] citizenShipFile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte[] getCitizenShipFile() {
        return citizenShipFile;
    }

    public void setCitizenShipFile(byte[] citizenShipFile) {
        this.citizenShipFile = citizenShipFile;
    }
}
