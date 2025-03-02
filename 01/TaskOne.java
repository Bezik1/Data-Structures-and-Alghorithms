import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner depthScanner = new Scanner(System.in);
        int depth = depthScanner.nextInt();
        depthScanner.close();

        int[] previousLine = {1};
        printLine(previousLine);
        for(int i=0; i<depth; i++) {
            previousLine = NextPascalLine(previousLine);
            printLine(previousLine);
        }
    }

    public static void printLine(int[] line) {
        for(int i=0; i<line.length; i++) {
            System.out.print(" " + line[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] NextPascalLine(int[] previousLine) {
        if(previousLine.length == 1) return new int[]{1, 2, 1, };

        int[] newLine = new int[previousLine.length+1];
        newLine[0] = 1;
        newLine[previousLine.length] = 1;
        for(int i=0; i<previousLine.length-1; i++) {
            newLine[i+1] = previousLine[i] + previousLine[i+1];
        }
        return newLine;
    }
}