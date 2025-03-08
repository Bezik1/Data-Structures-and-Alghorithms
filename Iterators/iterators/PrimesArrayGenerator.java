package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class PrimesArrayGenerator implements Iterator<Integer> {
    private int n;
    private int index;
    private boolean[] primes;

    public PrimesArrayGenerator(int n) {
        this.n = n;
        this.index = 0;
        this.primes = erastotenesSieve(n);
    }

    @Override
    public boolean hasNext() {
        int nextIndex = index + 1;
        while (nextIndex <= n && !this.primes[nextIndex]) {
            nextIndex++;
        }
        return nextIndex <= n;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();

        index++;
        while (!this.primes[index]) {
            index++;
        }
        return index;
    }

    private boolean[] erastotenesSieve(int n) {
        boolean[] primeArray = new boolean[n+1];
        for (int i=2; i<=n; i++) {
            primeArray[i] = true;
        }

        for (int i=2; i*i<n; i++) {
            if (primeArray[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    primeArray[j] = false;
                }
            }
        }
        return primeArray;
    }
}
