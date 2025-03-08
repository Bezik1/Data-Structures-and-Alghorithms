import iterators.PrimesGenerator;

public class TaskFiveA {
    public static void main(String[] args) {
        PrimesGenerator generator = new PrimesGenerator(50);

        while(generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
}
