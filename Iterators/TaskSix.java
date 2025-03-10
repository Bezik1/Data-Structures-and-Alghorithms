import iterators.ArrayIterator;

public class TaskSix {
    public static void main(String[] args) {
        Integer[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayIterator<Integer> iterator = new ArrayIterator<>(array);

        int i = 0;
        while (iterator.hasNext()) {
            if(i==1) {
                iterator.remove();
            }
            System.out.println(iterator.next());
            i++;
        }
    }
}
