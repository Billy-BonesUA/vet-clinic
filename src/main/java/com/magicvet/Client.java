package main.java.com.magicvet;

public class Client {
    String firstName;
    String lastName;
    String email;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLastName() {

        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getEmail() {
        return email;
    }
}
