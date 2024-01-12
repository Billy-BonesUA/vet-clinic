package main.java.com.magicvet.service;
import main.java.com.magicvet.InputReader;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;

import static main.java.com.magicvet.service.ClientRepository.findClientByEmail;


public class ClientService {

    public static Client registerNewClient() {
        Client client = new Client();
        System.out.println("Please provide client details.");
        String email = InputReader.readEmail();
        Client existingClient = findClientByEmail(email);
        if (existingClient != null) {
            System.out.println("Client with this email already exists.");
            System.out.println("Existing client: "
                    + existingClient.getFirstName() + ' '
                    + existingClient.getLastName() + " ("
                    + existingClient.getEmail() + ")");
        } else {
            if (Valid.isEmailValid(email)) {
                client.setEmail(email);
            } else {
                System.out.println("Exiting registration due to invalid email.");
                return null;
            }

            client.setFirstName(InputReader.read("Enter your first name: ", "Provided first name is invalid.", Valid::isFirstNamelValid));

            client.setLastName(InputReader.read("Enter your last name: ", "Provided last name is invalid.", Valid::isLastNamelValid));
            System.out.println("New client: "
                    + client.getFirstName() + ' '
                    + client.getLastName() + " ("
                    + client.getEmail() + ")");


        }
        return client;
    }

    public static void registerPetForClient(Client client) {

        String email = client.getEmail();
        Client existingClient = findClientByEmail(email);

        if (existingClient != null) {
            System.out.println("Client with this email already exists.");
            System.out.println("Existing client: "
                    + existingClient.getFirstName() + ' '
                    + existingClient.getLastName() + " ("
                    + existingClient.getEmail() + ")");

            if (existingClient.getPet() != null) {

                System.out.println("Existing pet: " + existingClient.getPet());
            } else {
                System.out.println("Adding a new pet.");
                Pet pet = PetService.registerNewPet();

                if (pet != null) {
                    existingClient.setPet(pet);
                    pet.setOwnerName(existingClient.getFirstName() + " " + existingClient.getLastName());
                    PetRepository.addPet(pet);
                    System.out.println("Pet has been added.");
                } else {
                    System.out.println("Pet registration canceled.");
                }
            }
        } else {
           Pet pet = PetService.registerNewPet();
            if (pet != null) {
                client.setPet(pet);
                pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                PetRepository.addPet(pet);

            } else {
                System.out.println("Pet registration canceled.");
            }
        }
    }
}