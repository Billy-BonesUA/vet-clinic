package main.java.com.magicvet.model;


import java.util.Objects;

public class Dog extends Pet {
    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";
    public Dog() {
        super("dog");
    }

    private String size;


    public Dog(String size) {
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }


    @Override
    public String toString() {
        return String.format("Dog {type: %s, sex: %s, age: %s, name: %s, size: %s, ownerName: %s}",
                getType(), getSex(), getAge(), getName(),  size, getOwnerName());
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
