package main.java.com.magicvet.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
    final static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    final private static String NAME_PATTERN = "^[a-zA-Z]{2,}+(-[a-zA-Z]{2,}+)?";

       public static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return  matcher.matches();
    }
    public static boolean isFirstNamelValid(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return  matcher.matches();
    }
    public static boolean isLastNamelValid(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        return  matcher.matches();
    }
}


