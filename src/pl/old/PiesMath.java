package pl.old;

public class PiesMath extends MathAbstract<Pies> {

    @Override
    protected Integer map(Pies pies) {
        return pies.getAge();
    }
}
