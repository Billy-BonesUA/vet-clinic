package main.java.com.magicvet.service;
import main.java.com.magicvet.model.Pet;

import java.util.ArrayList;

public class PetRepository {
    private static ArrayList<Pet> pets = new ArrayList<>();

    public static void addPet(Pet pet) {
        if (!pets.contains(pet)) {
            pets.add(pet);
        } else {
            System.out.println("Pet with the same details already exists.");
        }
    }
}
