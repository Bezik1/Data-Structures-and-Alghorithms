import iterators.SubsequenceGenerator;

public class TaskTwo {
    public static void main(String[] args) {
        SubsequenceGenerator generator = new SubsequenceGenerator(5);


        for(int i=0; i<20; i++) {
            if(generator.hasNext())
                System.out.println(generator.next());
        }
    }
}
