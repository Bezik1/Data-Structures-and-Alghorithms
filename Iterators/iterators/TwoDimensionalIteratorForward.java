package iterators;

import java.util.Iterator;

public class TwoDimensionalIteratorForward<T> implements Iterator<T> {
    private T[][] array;
    private int height;

    private int currentRow = 0;
    private int currentColumn = 0;

    public TwoDimensionalIteratorForward(T[][] anArray) {
        this.array = anArray;
        this.height = anArray.length;

        if (height == 0) throw new IllegalStateException();
    }

    @Override
    public boolean hasNext() {
        return currentRow < height && currentColumn < array[currentRow].length;
    }

    @Override
    public T next() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        currentColumn++;

        if (currentColumn >= array[currentRow].length) {
            currentColumn = 0;
            currentRow++;
        }

        return array[currentRow][currentColumn];
    }
}
