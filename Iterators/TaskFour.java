import java.util.Arrays;
import java.util.List;

import iterators.FibonacciGenerator;
import iterators.KthIterator;
import iterators.ShuffleIterator;

public class TaskFour {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0, 1);
        ShuffleIterator<Integer> iterator = new ShuffleIterator<Integer>(
            new FibonacciGenerator(),
            new KthIterator<>(numbers.iterator(), 2)
        );

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
