package org.vaadin.examples.form.ui.admin;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.StreamResource;
import org.vaadin.examples.form.data.model.Client;

import java.io.ByteArrayInputStream;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class ClientGrid extends Grid<Client> {

    public ClientGrid() {
        this.addColumn(data-> data.getFirstName()).setHeader("First Name");
        this.addColumn(data-> data.getLastName()).setHeader("First Name");
        this.addComponentColumn(data-> {
            data.getCitizenShipFile();
            Image image = new Image();
            image.setHeight("80px");
            image.setHeight("100px");
            image.setSrc(new StreamResource("", () -> new ByteArrayInputStream(data.getCitizenShipFile())));
            return image;
        }).setHeader("Citizenship");
    }
}
