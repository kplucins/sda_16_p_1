package opt;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        new OptionalTest().test();
    }

    public void test() {

    }

    private TestOpt noOpt() {
        Long id = getLong();
        if (id != null) {
            TestOpt testOpt = mapLongToObject(id);
            if (testOpt != null && "1".equals(testOpt.name)) {
                return testOpt;
            }
        }
        return null;
    }

    private TestOpt opt() {
        return Optional.ofNullable(getLong())
                .map(this::mapLongToObject)
                .filter(c -> "1".equals(c.name))
                .orElse(null);
    }

    private TestOpt mapLongToObject(Long id) {
        TestOpt testOpt = new TestOpt();
        testOpt.name = String.valueOf(id);
        return id == 1 ? testOpt : null;
    }

    private Long getLong() {
        return 1L;
    }


    public static class TestOpt {
        private String name;
    }
}
