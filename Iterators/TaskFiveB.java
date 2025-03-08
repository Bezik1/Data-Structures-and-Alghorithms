import iterators.PrimesArrayGenerator;

public class TaskFiveB {
    public static void main(String[] args) {
        PrimesArrayGenerator generator = new PrimesArrayGenerator(50);

        while(generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
}
