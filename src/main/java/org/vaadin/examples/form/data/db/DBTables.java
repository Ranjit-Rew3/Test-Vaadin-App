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
            public static final String EMAIL = "email";
            public static final String MOBILE_NUMBER = "mobile_number";
            public static final String GENDER = "gender";
            public static final String DISTRICT = "district";
            public static final String ADDRESS = "address";
            public static final String PROVINCE = "province";
            public static final String DOB_IN_AD ="dob_in_ad";
            public static final String DOB_IN_BS = "dob_in_bs";
            public static final String FATHER_FIRST_NAME ="father_first_name";
            public static final String FATHER_LAST_NAME ="father_last_name";
            public static final String MOTHER_FIRST_NAME = "mother_first_name";
            public static final String MOTHER_LAST_NAME = "mother_last_name";
            public static final String NIN = "nin";
            public static final String CITIZENSHIP_NUMBER ="citizenship_number";
            public static final String ISSUE_DISTRICT = "issue_district";
            public static final String DATE_OF_ISSUE = "date_of_issue";
            public static final String APPLICANT_PROVINCE = "applicant_province";
            public static final String APPLICANT_DISTRICT = "applicant_district";
            public static final String APPLICANT_MUNICIPALITY = "applicant_municipality";
            public static final String APPLICANT_WARD_NO = "applicant_ward_no";
            public static final String APPLICANT_VILLAGE = "applicant_village";
            public static final String CONTACT_FIRST_NAME = "contact_first_name";
            public static final String CONTACT_LAST_NAME = "contact_last_name";
            public static final String CONTACT_DISTRICT = "contact_district";
            public static final String CONTACT_PROVINCE = "contact_province";
            public static final String CONTACT_MUNICIPALITY = "contact_municipality";
            public static final String CONTACT_WARD_NUMBER = "contact_ward_number";
            public static final String CONTACT_VILLAGE = "contact_village";
            public static final String CITIZENSHIP_FRONT = "citizenship_front";
            public static final String CITIZENSHIP_BACK = "citizenship_back";
            public static final String MARRIAGE_CERTIFICATE = "marriage_certificate";
            public static final String IS_NEW = "is_new";
            public static final String IS_RENEWED = "is_renewed";
            public static final String IS_LOST = "is_lost";
            public static final String IS_DAMAGED = "is_damaged";
            public static final String FROM = "from";
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
