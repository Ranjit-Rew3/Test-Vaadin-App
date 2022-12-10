package org.vaadin.examples.form.data.db;

/**
 * @author Ranjit Kaliraj on 12/4/22
 */
public class DBTables {

    public static class Client {
        public static final String NAME = "client";
        public static class Fields {
            public static final String ID = "ID";
            public static final String FIRST_NAME = "first_name";
            public static final String LAST_NAME = "last_name";
            public static final String CITIZEN_SHIP_FILE = "citizen_ship_file";
        }
    }

    public static class LOGIN {
        public static final String NAME = "login";
        public static class Fields {
            public static final String ID = "ID";
            public static final String USERNAME = "username";
            public static final String PASSWORD = "password";
            public static final String USER_MODIFIED = "user_modified";
        }
    }

}
