package main.java.com.magicvet.model;

import java.util.Objects;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class Pet {
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthState healthState;
    private final LocalDateTime registrationDate = LocalDateTime.now();
    public Pet(String type) {
        this.type = type;
    }
    public Pet() {
    }

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

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
    public void setHealthState(HealthState healthState){
        this.healthState = healthState;
    }

    public HealthState getHealthState(){
        return healthState;
    }
    @Override
    public String toString() {
        return String.format("Pet {type: %s, sex: %s, age: %s, name: %s, ownerName: %s,registrationDatePet: %s}",
                type, sex, age, name, ownerName, registrationDate.format(FORMATTER));
    }

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
    public enum HealthState{
        Good_Health(1),
        Moderate_Severity(2),
        Severe_Degree(3),
        UNKNOWN(0);

        private int value;

        HealthState(int value){
            this.value = value;
        }

        public int getHealState(){
            return value;
        }
    }
}


