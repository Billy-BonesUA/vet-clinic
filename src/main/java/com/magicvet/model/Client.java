package main.java.com.magicvet.model;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Client {
    private static final DateTimeFormatter FORMATTER_CLIENT = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String firstName;
    private String lastName;
    private String email;
    private Pet pet;
    private List<Pet> pets = new ArrayList<>();
    private final LocalDateTime registrationDateClient = LocalDateTime.now();
    private Location location;
    @Override
    public String toString() {
        return "Client {"
                + "\n\tfirstName = " + firstName
                + ", lastName = " + lastName
                + ", email = " + email
                + ", location = " + location
                + ",\n\tpet = " + pet
                +  ", registrationDateClient = " + registrationDateClient.format(FORMATTER_CLIENT)
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, pet);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Pet getPet() {
        return pet;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public enum Location {
        KYIV, LVIV, ODESA
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        if (pet != null) {
            pet.setOwnerName(firstName + " " + lastName);
        }
    }
}