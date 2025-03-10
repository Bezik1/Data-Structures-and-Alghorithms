package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T array[];
    private int pos = 0;

    public ArrayIterator(T anArray[]) {
        array = anArray;
    }

    public boolean hasNext() {
        return pos < array.length;
    }

    public T next() throws NoSuchElementException {
        if (hasNext())
            return array[pos++];
        else
            throw new NoSuchElementException();
    }
    public void remove() {
        if (!hasNext()) throw new java.util.NoSuchElementException();

        array[pos-1] = null;
        for(int i=pos; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        pos++;
    }
}
