package org.vaadin.examples.form.ui.admin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.examples.form.data.model.Client;
import org.vaadin.examples.form.service.ClientService;

import java.util.List;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
@Route("admin/clients")
public class Clients extends Div {

    public Clients() {
        ClientGrid grid = new ClientGrid();
        List<Client> items = new ClientService().getClients(50, 0);
        grid.setItems(items);

        this.add(grid);
    }
}
