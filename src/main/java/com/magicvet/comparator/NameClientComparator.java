package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Client;

import java.util.Comparator;

public class NameClientComparator implements Comparator<Client>{
            @Override
        public int compare(Client client1, Client client2) {
            String name1 = client1 != null ? client1.getFirstName() : "Null";
            String name2 = client2 != null ? client2.getFirstName() : "Null";

            return name1.compareTo(name2);
        }
    }
