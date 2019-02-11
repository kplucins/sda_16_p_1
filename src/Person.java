import java.util.List;
import java.util.Objects;

public class Person {

    private String pesel;
    private List<Food> availableFoods;
    private List<Animal> animals;

    public Person(String pesel, List<Food> availableFoods, List<Animal> animals) {
        this.pesel = pesel;
        this.availableFoods = availableFoods;
        this.animals = animals;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public List<Food> getAvailableFoods() {
        return availableFoods;
    }

    public void setAvailableFoods(List<Food> availableFoods) {
        this.availableFoods = availableFoods;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
