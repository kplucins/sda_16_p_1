package pl.old;

import java.util.Objects;
import java.util.Random;

public class HashCodeRandom {

    private String firstName;
    private String secondName;
    private String lastName;

    public HashCodeRandom(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeRandom that = (HashCodeRandom) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(lastName, that.lastName);
    }

    private Random random = new Random();

    @Override
    public int hashCode() {
        return random.nextInt(10);
    }
}
