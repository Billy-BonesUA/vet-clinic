package main.java.com.magicvet.comparator;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;
import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet pet1, Pet pet2) {
            if(pet1 instanceof Dog&& pet2 instanceof Dog){
                Dog dog1 = (Dog) pet1;
                Dog dog2 = (Dog) pet2;

                return convertSize(dog1.getSize()) - convertSize(dog2.getSize());
            } else if (pet1 instanceof Pet && pet2 instanceof Pet) {
                // Перевірка, чи обидва об'єкти є екземплярами Pet
                Pet petValue1 = (Pet) pet1;
                Pet petValue2 = (Pet) pet2;

                // Перевірка, чи age є числом
                if (isNumeric(petValue1.getAge()) && isNumeric(petValue2.getAge())) {
                    // Логіка порівняння за віком
                    return Integer.parseInt(petValue1.getAge()) - Integer.parseInt(petValue2.getAge());
                } else {
                    // Логіка порівняння для інших типів Pet (наприклад, за іменем)
                    return petValue1.getName().compareTo(petValue2.getName());
                }
            } else {
                // Логіка порівняння для інших випадків
                return 0; // Повернення нуля або іншого значення, залежно від вашого випадку
            }
    }

    // Метод для перевірки, чи рядок є числом
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

        private static int convertSize(String size) {
        return switch (size) {
            case Dog.XS -> 1;
            case Dog.S -> 2;
            case Dog.M -> 3;
            case Dog.L -> 4;
            case Dog.XL -> 5;
            default -> 0;
        };
    }
}
