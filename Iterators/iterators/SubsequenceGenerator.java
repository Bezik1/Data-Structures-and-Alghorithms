package iterators;

import java.util.Iterator;

public final class SubsequenceGenerator implements Iterator<Integer> {
    private int currentElement;

    public SubsequenceGenerator(int firstElement) {
        this.currentElement = firstElement;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new java.util.NoSuchElementException();

        return currentElement++;
    }
}