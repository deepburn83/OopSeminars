package seminar001.main.list;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] values;
    int index;


    public ArrayIterator(E[] values) {
        this.values = values;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
