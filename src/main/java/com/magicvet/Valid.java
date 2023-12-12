package main.java.com.magicvet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
    private static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static String FIRSTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    private static String LASTNAME_PATTERN = "^[a-zA-Z-]{3,}$";

    public static void main(String[] args) {

    }
    public static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return  matcher.matches();
    }
    public static boolean isFirstNamelValid(String firstName) {
        Pattern pattern = Pattern.compile(FIRSTNAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return  matcher.matches();
    }
    public static boolean isLastNamelValid(String lastName) {
        Pattern pattern = Pattern.compile(LASTNAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        return  matcher.matches();
    }
}
