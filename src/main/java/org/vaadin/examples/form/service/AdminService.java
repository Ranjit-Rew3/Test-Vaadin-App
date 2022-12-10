package org.vaadin.examples.form.service;

import org.apache.commons.lang3.tuple.Pair;
import org.vaadin.examples.form.data.AdminDAO;
import org.vaadin.examples.form.data.DBSetup;
import org.vaadin.examples.form.data.utils.PasswordHashUtil;
import org.vaadin.examples.form.service.common.Response;
import org.vaadin.examples.form.service.common.ResponseStatus;

/**
 * Admin service.
 * Note, this is single user based admin service.
 *
 * @author Ranjit Kaliraj on 12/4/22
 */
public class AdminService {

    private final AdminDAO adminDAO;
    private final DBSetup dbSetup;

    public AdminService() {
        adminDAO = new AdminDAO();
        dbSetup = new DBSetup();
    }

    /**
     * Authenticate user.
     * @param password - Password to authorized.
     * @return - Authentication response along with flag to indicate if default password has been changed by user or not.
     */
    public Pair<Response, Boolean> authenticate(String password) {
        String hashed = PasswordHashUtil.hash(password);
        AdminDAO.AuthenticationResult authenticationResult = adminDAO.authenticate(DBSetup.DEFAULT_LOGIN_USERNAME, hashed);
        Response response = new Response();
        boolean isDefaultPasswordChanged = false;
        if(authenticationResult.isSuccess()) {
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("SUCCESS - User has been authenticated");
            isDefaultPasswordChanged = authenticationResult.isDefaultPasswordChanged();
        } else {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage("FAILED - Username/Password is invalid");
        }
        return Pair.of(response, isDefaultPasswordChanged);
    }

    /**
     * Change user password.
     * @param oldPassword - Old password to change.
     * @param newPassword - new password for replace.
     * @return - Change password response.
     */
    public Response changePassword(String oldPassword, String newPassword) {
        String hashed1 = PasswordHashUtil.hash(oldPassword);
        String hashed2 = PasswordHashUtil.hash(newPassword);
        boolean isChanged = adminDAO.changePassword(DBSetup.DEFAULT_LOGIN_USERNAME, hashed1, hashed2);
        Response response = new Response();
        if(isChanged) {
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("SUCCESS - Password has been changed");
        } else {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage("FAILED - Unable to change password");
        }
        return response;
    }

    public void resetApp() {
        dbSetup.resetDB();
    }

}
