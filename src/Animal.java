import java.util.List;
import java.util.Objects;

public class Animal {

    private String name;
    private List<Food> favoriteFoods;
    private Food food;

    public Animal(int i) {
        this.name = "animal " + i;
    }

    public Animal(String name, List<Food> favoriteFoods) {
        this.name = name;
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

    public void feedAnimal(Food food) {
        this.food = food;
    }

    public boolean isHungry() {
        return food == null;
    }

    public boolean isMyFavourite(Food food) {
        //return favoriteFoods.contains(food);
        return favoriteFoods.stream()
                .anyMatch(food::equals);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
