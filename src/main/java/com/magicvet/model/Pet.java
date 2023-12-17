package main.java.com.magicvet.model;

import java.util.Objects;

public class Pet {

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    @Override
    public String toString() {
        return String.format("Pet {type: %s, sex: %s, age: %s, name: %s, ownerName: %s}",
                type, sex, age, name, ownerName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pet otherPet = (Pet) obj;
        return Objects.equals(type, otherPet.type) &&
                Objects.equals(sex, otherPet.sex) &&
                Objects.equals(age, otherPet.age) &&
                Objects.equals(name, otherPet.name) &&
                Objects.equals(ownerName, otherPet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName);
    }
}

