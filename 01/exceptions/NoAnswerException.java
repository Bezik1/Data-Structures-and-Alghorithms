package exceptions;

public class NoAnswerException extends Exception {
    @Override
    public String getMessage() {
        return "No Answer Exception!";
    }
}