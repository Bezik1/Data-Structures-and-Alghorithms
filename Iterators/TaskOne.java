import java.util.Arrays;
import java.util.List;

import iterators.KthIterator;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        KthIterator<Integer> iterator = new KthIterator<>(numbers.iterator(), 3);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
