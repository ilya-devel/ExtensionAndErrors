package sem3.homeworks.appExceptions;


public class SizeArrayException extends ArrayStoreException {
    @Override
    public String getMessage() {
        return "[CAUTION] Количество переданных аргументов не равно 6\n";
    }
}
