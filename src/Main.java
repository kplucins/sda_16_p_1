import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public void test() {
        Main.mapToString(1);
    }

    public static void main(String[] args) {
        String str = IntStream.range(0, 20)
                    .mapToObj(Main::mapToString)
                    .collect(Collectors.joining(";", "{", "}"));
        System.out.println(str);
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
