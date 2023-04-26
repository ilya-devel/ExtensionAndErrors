package sem3.homeworks.appExceptions;

public class InvalidDateException extends RuntimeException {

    @Override
    public String getMessage() {
        return "[CAUTION] Не верно указана дата\n";
    }
}
