package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet {

    public Dog() {
        super("dog"); // Встановлюємо тип тварини для поля type
    }

    private String size;

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return String.format("Dog {type: %s, sex: %s, age: %s, name: %s, size: %s}",
                getType(), getSex(), getAge(), getName(),  size);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Dog otherDog = (Dog) obj;
        return Objects.equals(size, otherDog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

}
