class NoAnswerException extends Exception {}

public class TaskTwo {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 4, 7, 1, 5, 1, 9, };
        int answer = getSecondSmallest(array);
        System.out.println(answer);
    }

    public static int getSecondSmallest(int[] dataStream) {
        try {
            int dataStreamLength = dataStream.length;
            if(dataStreamLength < 2) throw new NoAnswerException();

            int currentSmallest = dataStream[0] < dataStream[1] ? dataStream[0] : dataStream[1];
            int currentSecondSmallest = dataStream[0] > dataStream[1] ? dataStream[0] : dataStream[1];

            for(int i=2; i<dataStreamLength; i++) {
                int currentData = dataStream[i];

                if(currentData < currentSmallest) {
                    int temp = currentSmallest;
                    currentSmallest = currentData;
                    currentSecondSmallest = temp;
                } else if(currentData < currentSecondSmallest && currentData != currentSmallest) {
                    currentSecondSmallest = currentData;
                }
            }
            return currentSecondSmallest;
        } catch(NoAnswerException exception) {
            System.err.println("No Answer Exception");
            return -1;
        }
    }
}
