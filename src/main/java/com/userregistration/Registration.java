package com.userregistration;

import java.util.regex.Pattern;

public class Registration {

    public static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";

    public boolean registeredFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
