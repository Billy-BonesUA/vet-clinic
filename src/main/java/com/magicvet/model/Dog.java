package main.java.com.magicvet.model;


import java.util.Objects;

public class Dog extends Pet {
    private Size size;

    public Dog() {
        this.size = Size.UNKNOWN;
    }
    public Dog(Size size) {
        this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }
    public enum Size {

        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);

        private final int value;

        Size(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public Dog(Size size, HealthState healthState) {
        setHealthState(healthState);
        this.size = size;
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
