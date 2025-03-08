package iterators;

import java.util.Iterator;

public class TwoDimensionalIteratorBackwards<T> implements Iterator<T> {
    private T[][] array;
    private int height;

    private int currentRow;
    private int currentColumn;

    public TwoDimensionalIteratorBackwards(T[][] anArray) {
        this.array = anArray;
        this.height = anArray.length;

        if (height == 0) throw new IllegalStateException();
        this.currentRow = height-1;
        this.currentColumn = anArray[this.currentRow].length;
    }

    @Override
    public boolean hasNext() {
        return currentRow >= 0 && currentColumn >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        currentColumn--;

        if (currentColumn < 0) {
            currentRow--;
            if (currentRow >= 0)
                currentColumn = array[currentRow].length - 1;
        }

        return array[currentRow][currentColumn];
    }
}
