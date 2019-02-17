package pl.old;

public class MainSecond {

    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze() {
            @Override
            public String getType() {
                return null;
            }
        };
        System.out.println(zwierze);
    }

}
