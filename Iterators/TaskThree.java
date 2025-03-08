import iterators.FibonacciGenerator;

public class TaskThree {
    public static void main(String[] args) {
        FibonacciGenerator generator = new FibonacciGenerator();

        for(int i=0; i<20; i++) {
            if(generator.hasNext())
                System.out.println(generator.next());
        }
    }
}
