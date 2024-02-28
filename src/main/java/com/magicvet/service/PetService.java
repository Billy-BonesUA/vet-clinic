package main.java.com.magicvet.service;
import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.model.Cat;
public class PetService {

    private static final String DOG_TYPE = "dog";
    private static final String CAT_TYPE = "cat";

    public static Pet registerNewPet() {
        Pet pet = null;
        System.out.print("Type (dog / cat): ");
        String type = Main.SCANNER.nextLine().toLowerCase();

        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)) {
            pet = buildPet(type);
        } else {
            System.out.println("Unknown pet type: " + type);
        }

        return pet;
    }



        private static Pet buildPet(String type) {

            Pet pet = type.equals(CAT_TYPE) ? new Cat() : new Dog();
            pet.setType(type);

            System.out.print("Age: ");
            pet.setAge(Main.SCANNER.nextLine());

            System.out.print("Name: ");
            pet.setName(Main.SCANNER.nextLine());

            System.out.print("Sex (male / female): ");
            pet.setSex(Main.SCANNER.nextLine().toLowerCase());

            System.out.println("Health state: (Good_Health / Moderate_Severity / Severe_Degree:)");
            String healthState = Main.SCANNER.nextLine();
            try {
                pet.setHealthState(Pet.HealthState.valueOf(healthState));
            } catch (IllegalArgumentException e) {
                pet.setHealthState(Pet.HealthState.UNKNOWN);
                System.out.println("Unable to parse value '" + healthState
                        + "'. Using default value: " + Pet.HealthState.UNKNOWN);
            }
            pet.setHealthState(Pet.HealthState.valueOf(healthState));
            if (type.equals(DOG_TYPE)) {
                System.out.print("Size (XS / S / M / L / XL): ");
                String sizeInput = Main.SCANNER.nextLine();

                try {
                    Dog.Size size = Dog.Size.valueOf(sizeInput.toUpperCase()); // Перетворення введеного розміру в enum
                    ((Dog) pet).setSize(size); // Встановлення розміру для собаки
                } catch (IllegalArgumentException e) {
                    System.out.println("Unable to parse size '" + sizeInput + "'. Using default value: " + Dog.Size.UNKNOWN);
                    ((Dog) pet).setSize(Dog.Size.UNKNOWN); // Встановлення розміру за замовчуванням у разі невідповідності
                }
            }
            return pet;

        }

    }

