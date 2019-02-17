import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class App {

    private final static Random RANDOM = new Random();

    private List<Person> p = new ArrayList<>();
    private List<Food> f = new ArrayList<>();

    public void start() {
        populateFood(50);

        IntStream.range(0, 5).forEach(this::createPerson);

        p.forEach(Person::feed);

        p.stream()
                .map(Person::listOfHungryAnimals)
                .flatMap(List::stream)
                .map(Animal::getName)
                .forEach(System.out::println);
    }

    private void createPerson(int i) {
        lenght
        String pesel = "123456798" + i;
        List<Food> availableFoods = returnRandomFoods(lenght);
        List<Animal> animals = returnAnimals(pesel);
        Person person = new Person(pesel, availableFoods, animals);
        p.add(person);
    }

    public List<Animal> returnAnimals(String owner) {
        List<Animal> animals = new ArrayList<>();
        int size = RANDOM.nextInt(5);
        for (int i = 0; i < size; i++) {
            List<Food> favAnimalFoods = returnRandomFoods(8);
            Animal animal = new Animal("Animal " + i, favAnimalFoods, owner);
            animals.add(animal);
        }
        return animals;
    }

    public List<Food> returnRandomFoods(int length) {
        List<Food> foods = new ArrayList<>();
        int size = RANDOM.nextInt(length);
        for (int i = 0; i < size; i++) {
            int no = RANDOM.nextInt(f.size());
            Food food = f.get(no);
            foods.add(food);
        }
        return foods;
    }

    public void populateFood(int size) {
        for (int i = 0; i < size; i++) {
            Food food = new Food("Food " + i);
            f.add(food);
//            f.add(new Food("Food " + i));
        }
    }

}
