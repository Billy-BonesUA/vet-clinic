package main.java.com.magicvet.component;

import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.service.ClientService;

public class ApplicationRunner {
    private final ClientService clientService = new ClientService();

        public void run() {
        if (Authenticator.auth()) {
            Client client = ClientService.registerNewClient();

            if (client != null) {
                System.out.println("Adding a new pet.");


                clientService.registerPetForClient(client);

                System.out.println("Pet has been added.");

                System.out.println(client);
            }
        }
    }


}