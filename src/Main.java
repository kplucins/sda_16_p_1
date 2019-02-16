import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public void test() {
        Main.mapToString(1);
    }

    public static void main(String[] args) {
    App app = new App();
    app.start();
    }

    public static String mapToString(int i) {
        return String.format("'%d'", i);
    }

    public static void callToUserName(Consumer<String> cons) {
        //TODO pobieranie z bazy użytkownika
        //TODO pobieranie jego name
        String name = "Uzytkownik";
        cons.accept(name);
        name = "ndjsnds";
        //TODO
    }

}
