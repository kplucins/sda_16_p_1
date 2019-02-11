package pl.old;

public class StringMath extends MathAbstract<String> {

    @Override
    protected Integer map(String s) {
        return Integer.valueOf(s);
    }
}
