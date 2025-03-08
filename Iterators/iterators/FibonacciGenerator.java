package iterators;

import java.util.Iterator;

public final class FibonacciGenerator implements Iterator<Integer> {
    private int secondElement = 1;
    private int firstElement = 0;

    public FibonacciGenerator() {}

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        int nextElement = secondElement + firstElement;

        secondElement = firstElement;
        firstElement = nextElement;

        return nextElement;
    }
}
