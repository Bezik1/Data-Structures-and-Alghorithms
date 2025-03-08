package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class PrimesGenerator implements Iterator<Integer> {
    private int n;
    private int currentElement;

    public PrimesGenerator(int n) {
        this.n = n;
        this.currentElement = 2;
    }

    @Override
    public boolean hasNext() {
        int nextElement = currentElement+1;

        while(!isPrime(nextElement)) {
            if(nextElement > this.n) return false;
            nextElement += 1;
        }
        return true;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();

        int nextElement = currentElement+1;

        while(!isPrime(nextElement)) {
            nextElement += 1;
        }
        currentElement = nextElement;
        return currentElement;
    }

    private boolean isPrime(int number) {
        if(number < 2) return false;

        for(int i=2; i<(int) Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
