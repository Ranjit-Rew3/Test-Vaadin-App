package org.vaadin.examples.form.ui.client;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import org.vaadin.examples.form.service.ClientService;
import org.vaadin.examples.form.service.common.Response;
import org.vaadin.examples.form.service.common.ResponseStatus;
import org.vaadin.examples.form.ui.components.AvatarField;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
@Route("client-form")
public class ClientFormHome extends Div implements RouterLayout {

    private TextField firstNameField;
    private TextField lastNameField;
    private AvatarField citizenshipField;

    public ClientFormHome() {

        this.setSizeFull();

        H3 title = new H3("Customer form");

        firstNameField = new TextField("First Name");
        lastNameField = new TextField("Last Name");
        citizenshipField = new AvatarField("Select Avatar image");


        Button submitButton = new Button("Submit Form");
        submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        FormLayout formLayout = new FormLayout(title, firstNameField, lastNameField, citizenshipField, submitButton);

        // Restrict maximum width and center on page
        formLayout.setMaxWidth("500px");
        formLayout.getStyle().set("margin", "0 auto");

        // Allow the form layout to be responsive. On device widths 0-490px we have one
        // column, then we have two. Field labels are always on top of the fields.
        formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 1, FormLayout.ResponsiveStep.LabelsPosition.TOP),
                new FormLayout.ResponsiveStep("490px", 2, FormLayout.ResponsiveStep.LabelsPosition.TOP));

        // These components take full width regardless if we use one column or two (it
        // just looks better that way)
        formLayout.setColspan(title, 2);
        formLayout.setColspan(firstNameField, 2);
        formLayout.setColspan(lastNameField, 2);
        formLayout.setColspan(citizenshipField, 2);
        formLayout.setColspan(submitButton, 2);

        // Add the form to the page
        add(formLayout);

        submitButton.addClickListener(e-> {
            ClientService clientService = new ClientService();
            Response response = clientService.addClient(firstNameField.getValue(), lastNameField.getValue(), citizenshipField.getValue().getImage());
            if(response.getStatus() == ResponseStatus.SUCCESS) {
                Notification.show(response.getMessage(), 500, Notification.Position.TOP_CENTER)
                        .addThemeVariants(NotificationVariant.LUMO_SUCCESS);
                firstNameField.clear();
                lastNameField.clear();
                citizenshipField.clear();
            } else {
                Notification.show(response.getMessage(), 500, Notification.Position.TOP_CENTER)
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
            }
        });
    }
}
