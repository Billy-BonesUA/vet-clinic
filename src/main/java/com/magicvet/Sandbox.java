package main.java.com.magicvet;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.model.Cat;
import java.util.Arrays;
import java.util.Comparator;


public class Sandbox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.M, Pet.HealthState.Severe_Degree),
                new Dog(Dog.Size.S, Pet.HealthState.Moderate_Severity),
                new Dog(Dog.Size.L, Pet.HealthState.Good_Health),
                new Dog(Dog.Size.XL, Pet.HealthState.Moderate_Severity),
                new Dog(Dog.Size.XS, Pet.HealthState.Good_Health),
                new Dog(Dog.Size.M, Pet.HealthState.Severe_Degree),
                new Dog(Dog.Size.XL, Pet.HealthState.Moderate_Severity)
        };


        Arrays.sort(dogs, Comparator.comparingInt(o -> o.getHealthState().getHealState()));

        for (Dog dog : dogs) {
            System.out.println(dog.getHealthState() + ": Size = " + dog.getSize());
        }
        System.out.println(new Cat());
    }
}

