import exceptions.NoAnswerException;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            int[] array = {2, 2, 2, 1, 3};
            int answer = getSecondSmallest(array);
            System.out.println(answer);
        } catch(Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public static int getSecondSmallest(int[] dataStream) throws NoAnswerException {
        int i=1;
        int currentSmallest = dataStream[0];
        int currentElement = currentSmallest;
        while(currentSmallest == currentElement) {
            if(i==dataStream.length) throw new NoAnswerException();
            currentElement = dataStream[i];
            i++;
        }

        int currentSecondSmallest = currentElement;
        if(currentElement<currentSmallest) {
            int temp = currentSmallest;
            currentSmallest = currentElement;
            currentSecondSmallest = temp;
        }

        while(i<dataStream.length) {
            int currentData = dataStream[i];

            if(currentData < currentSmallest) {
                int temp = currentSmallest;
                currentSmallest = currentData;
                currentSecondSmallest = temp;
            } else if(currentData != currentSmallest && currentData < currentSecondSmallest) {
                currentSecondSmallest = currentData;
            }
            i++;
        }
        return currentSecondSmallest;
    }
}
