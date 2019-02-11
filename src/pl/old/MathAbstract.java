package pl.old;

public abstract class MathAbstract<E> {

    protected abstract Integer map(E e);

    public Integer plus(E e1, E e2) {
        return map(e1) + map(e2);
    }

}
