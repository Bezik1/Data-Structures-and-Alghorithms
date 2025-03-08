package iterators;

import java.util.Iterator;

public final class ShuffleIterator<T> implements Iterator<T> {
    private final Iterator<T> firstIterator;
    private final Iterator<T> secondIterator;
    private boolean shuffle = true;

    public ShuffleIterator(Iterator<T> firstIterator, Iterator<T> secondIterator) {
        this.firstIterator = firstIterator;
        this.secondIterator = secondIterator;
    }

    @Override
    public boolean hasNext() {
        if(shuffle) return firstIterator.hasNext();
        else return secondIterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) throw new java.util.NoSuchElementException();

        T nextElement;
        if(shuffle) nextElement = firstIterator.next();
        else nextElement = secondIterator.next();

        shuffle = !shuffle;
        return nextElement;
    }
}
