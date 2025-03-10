public class TaskThree {
    public static void main(String[] args) {
        int[] permutation = {2, 3, 4, 1, };
        System.out.println(nextPermutation(permutation));

        for(int i=0; i<permutation.length; i++) {
            System.out.print(" " + permutation[i] + " ");
        }
    }

    public static boolean nextPermutation(int[] permutation) {
        // TODO
        // Implement finding element that is smaller than current max from the end
        // Swap this element with the previous one
        // Reverse elements from our element index+1 to the last element



        // int maxIndex = permutation.length;
        // int index = permutation.length-2;

        // while(index >= 0 && permutation[index] >= permutation[index+1]) index--;
        // if(index < 0) return false;

        // int targetIndex = maxIndex - 1;
        // while(permutation[index] >= permutation[targetIndex]) targetIndex--;
        // if(targetIndex < 0) return false;

        int counter = permutation.length;
        while(counter > 0) {
            int maxIndex = permutation.length;
            int index = permutation.length-2;
            while(index >= 0 && permutation[index] >= permutation[index+1]) index--;
            if(index < 0) return false;

            int targetIndex = maxIndex - 1;
            while(permutation[index] >= permutation[targetIndex]) targetIndex--;
            if(targetIndex < 0) return false;
            if(index < 0) return false;

            int temp = permutation[index];
            permutation[index] = permutation[targetIndex];
            permutation[targetIndex] = temp;

            counter--;
        }

        return true;
    }
}
