package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class KthIterator<T> implements Iterator<T> {
    private final Iterator<T> baseIterator;
    private final int k;
    private int counter;


    public KthIterator(Iterator<T> baseIterator, int k) {
        if (k <= 0) throw new IllegalArgumentException("k must be greater than 0");
        this.baseIterator = baseIterator;
        this.k = k;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        while(baseIterator.hasNext() && counter % k != k-1) {
            baseIterator.next();
            counter++;
        }
        return baseIterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();

        counter++;
        return baseIterator.next();
    }
}
