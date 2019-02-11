import java.util.List;
import java.util.Objects;

public class Animal {

    private String name;
    private String ownerName;
    private List<Food> favoriteFoods;

    public Animal(int i) {
        this.name = "animal " + i;
    }

    public Animal(String name, List<Food> favoriteFoods, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.favoriteFoods = favoriteFoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<Food> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(ownerName, animal.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ownerName);
    }
}
