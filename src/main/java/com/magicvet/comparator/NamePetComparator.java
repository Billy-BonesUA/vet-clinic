package main.java.com.magicvet.comparator;
import main.java.com.magicvet.model.Pet;

import java.util.Comparator;

public class NamePetComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet pet1, Pet pet2) {
        String name1 = pet1 != null ? pet1.getName() : "Null";
        String name2 = pet2 != null ? pet2.getName() : "Null";

        return name1.compareTo(name2);
    }
  }
