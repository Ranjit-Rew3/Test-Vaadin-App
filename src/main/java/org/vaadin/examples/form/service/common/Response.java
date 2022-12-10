package org.vaadin.examples.form.service.common;

import java.util.Optional;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class Response {
    private ResponseStatus status;
    private String message;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
