import iterators.TwoDimensionalIteratorBackwards;

public class TaskSevenBackwards {
    public static void main(String[] args) {
        Integer[][] array = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {10, 11, 12, 13},
        };

        TwoDimensionalIteratorBackwards<Integer> iterator = new TwoDimensionalIteratorBackwards<>(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}