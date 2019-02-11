package pl.old;

import java.util.EmptyStackException;

public class CustomStack<T> {

    private int containerSize = 20;
    private Object[] container = new Object[containerSize];
    private int position = -1;

    public T pop() {
        if (position == -1) {
            throw new EmptyStackException();
        }
        T element = (T) container[position];
        container[position] = null;
        position--;
        return element;
    }

    public T peek() {
        if (position == -1) {
            throw new EmptyStackException();
        }
        return  (T) container[position];
    }

    public void push(T t) {
        if (t == null) {
            throw new RuntimeException();
        }
        position++;
        if (position > container.length - 1) {
            Object[] c = new Object[container.length + containerSize];
            for (int i = 0; i < container.length; i++) {
                c[i] = container[i];
            }
            container = c;
        }
        container[position] = t;
    }

    public boolean isEmpty() {
        return position == -1;
    }
}
