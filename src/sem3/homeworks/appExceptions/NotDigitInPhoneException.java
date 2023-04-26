package sem3.homeworks.appExceptions;

public class NotDigitInPhoneException extends Exception {
    @Override
    public String getMessage() {
        return "[CAUTION] В номере присутствуют отличные от числа символы\n";
    }
}
