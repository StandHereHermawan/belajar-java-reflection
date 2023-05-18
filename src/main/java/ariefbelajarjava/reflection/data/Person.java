package ariefbelajarjava.reflection.data;

import ariefbelajarjava.reflection.annotation.NotBlank;

import java.io.Serializable;

public final class Person implements NameAble, Serializable {

    @NotBlank
    private String firstName;

    @NotBlank(allowEmptyString = true)
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
