package org.vaadin.examples.form.data.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class PasswordHashUtil {

    public static String hash(String password) {
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return hashed;
    }
}
