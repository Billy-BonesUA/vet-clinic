package main.java.com.magicvet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.com.magicvet.Valid.*;

public class Main {

    static String PASSWORD = "default";
    static Scanner SCANNER = new Scanner(System.in);
    private static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static String FIRSTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    private static String LASTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
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
        System.out.println("Please provide client details.");

        // Введення email
        System.out.print("Email: ");
        String email = SCANNER.nextLine();

        // Перевірка валідності email
        if (!Valid.isEmailValid(email)) {
            System.out.println("Provided email is invalid.");
            return;
        }

        // Створення об'єкта клієнта
        Client client = new Client();
        // Встановлення email клієнта
        client.setEmail(email);

        // Введення ім'я клієнта
        System.out.print("First name: ");
        String firstName = SCANNER.nextLine();

        // Перевірка валідності імені
        if (!Valid.isFirstNamelValid(firstName)) {
            System.out.println("Provided first name is invalid.");
            return;
        }

        // Введення прізвища клієнта
        System.out.print("Last name: ");
        String lastName = SCANNER.nextLine();

        // Перевірка валідності прізвища
        if (!Valid.isLastNamelValid(lastName)) {
            System.out.println("Provided last name is invalid.");
            return;
        }

        // Встановлення імені та прізвища клієнта
        client.setFirstName(firstName);
        client.setLastName(lastName);

        // Виведення інформації про нового клієнта
        System.out.println("New client: " + client.firstName + " " + client.lastName + " (" + client.email + ")");
    }


}

  /*  private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return  matcher.matches();
    }*/
