import exceptions.NoAnswerException;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            int[] array = {1, 1, 2, 1, 3};
            int answer = getSecondSmallest(array);
            System.out.println(answer);
        } catch(Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public static int getSecondSmallest(int[] dataStream) throws NoAnswerException {
        int dataStreamLength = dataStream.length;
        if(dataStreamLength < 2) throw new NoAnswerException();

        int currentSmallest = dataStream[0];
        int currentSecondSmallest = dataStream[0];

        for(int i=0; i<dataStreamLength; i++) {
            int currentData = dataStream[i];

            if(currentData < currentSmallest) {
                int temp = currentSmallest;
                currentSmallest = currentData;
                currentSecondSmallest = temp;
            } else if(currentData != currentSmallest && (currentData < currentSecondSmallest || currentSmallest == currentSecondSmallest) ) {
                currentSecondSmallest = currentData;
            }
        }
        if(currentSmallest == currentSecondSmallest) throw new NoAnswerException();

        return currentSecondSmallest;
    }
}
