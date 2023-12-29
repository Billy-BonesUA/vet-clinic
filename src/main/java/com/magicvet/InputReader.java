package main.java.com.magicvet;
import main.java.com.magicvet.service.Valid;
import main.java.com.magicvet.service.Validator;

import java.util.Scanner;

public class InputReader {
    private static Scanner SCANNER = new Scanner(System.in);

    public static String readEmail() {
        return read("Enter your email: ", "Provided email is invalid.", Valid::isEmailValid);
    }

    public static String read(String prompt, String invalidMessage, Validator validator) {
        String option = "yes";
        do {
            System.out.print(prompt);
            String value = SCANNER.nextLine();
            if (validator.isValid(value)) {
                return value;
            } else {
                System.out.println(invalidMessage);
                System.out.print("Do you want to continue? (yes/no): ");
                option = SCANNER.nextLine();
            }
        } while (option.equalsIgnoreCase("yes"));

        return "NoData";
    }
}
