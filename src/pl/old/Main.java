package pl.old;

import java.util.*;

public class Main {

    private Object object = new Object();

    private Map<Object, Object> map = new HashMap<>();
    private List<Object> keys = new ArrayList<>();

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        put();
        check();
    }

    private void put() {
        for (int i = 0; i < 10000; i++) {
            Object testKey =
                    new HashCodeRandom("fm" + i,
                            "fm" + i, "fm" + i);
            map.put(testKey, object);
            keys.add(testKey);
        }
    }

    private void check() {
        long notFound = keys.stream()
                .sorted((o1, o2) -> 0)
                .map(map::get)
                .filter(Objects::isNull)
                .count();

        keys.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        for (int i = 0; i < keys.size(); i++) {
            if (map.get(keys.get(i)) == null) {
                notFound++;
            }
        }
//        System.out.println(String.format("Found: %d, Not found: %d", found, notFound));
    }
}
