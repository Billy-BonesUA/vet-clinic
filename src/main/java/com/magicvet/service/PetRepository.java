package main.java.com.magicvet.service;
import main.java.com.magicvet.model.Pet;

import java.util.ArrayList;
public class PetRepository {
    private static ArrayList<Pet> pets = new ArrayList<>();

    public static void addPet(Pet pet) {
        pets.add(pet);
    }

}
