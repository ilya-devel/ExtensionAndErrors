package sem3.homeworks.appExceptions;

public class InvalidGenderException extends Exception {
    @Override
    public String getMessage() {
        return "[CAUTION] Не верно указан пол, необходимо указать f или m\n";
    }
}
