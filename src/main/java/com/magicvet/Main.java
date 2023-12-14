package main.java.com.magicvet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.com.magicvet.Valid.*;

public class Main {

    static String PASSWORD = "d";
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }

    static void run() {
        if(auth()){
            registerNewClient();
        }
    }
    static boolean auth(){
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password.");
            }
        }

        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Application has been blocked.");
        return accepted;
    }
    static void registerNewClient() {
        Client client = new Client();
        System.out.println("Please provide client details.");
        String email = InputReader.readEmail();
        if (Valid.isEmailValid(email)) {
            client.setEmail(email);
        } else {
            System.out.println("Exiting registration due to invalid email.");
            return;
        }

        client.setFirstName(InputReader.read("Enter your first name: ", "Provided first name is invalid.", Valid::isFirstNamelValid));

        client.setLastName(InputReader.read("Enter your last name: ", "Provided last name is invalid.", Valid::isLastNamelValid));
        System.out.println("New client: "
                + client.getFirstName() + ' '
                + client.getLastName() + " ("
                + client.getEmail() + ")");
    }
}
interface Validator {
    boolean isValid(String value);
}





