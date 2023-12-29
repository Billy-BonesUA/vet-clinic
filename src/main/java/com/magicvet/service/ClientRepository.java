package main.java.com.magicvet.service;
import main.java.com.magicvet.model.Client;


import java.util.ArrayList;
public class ClientRepository {
    private static ArrayList<Client> clients = new ArrayList<>();

        public static Client findClientByEmail(String email) {
        for (Client client : clients) {
            if (client.getEmail().equals(email)) {
                return client;
            }
        }
        return null;
    }

}
