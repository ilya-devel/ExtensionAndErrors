package sem3.homeworks.appExceptions;

public class CopyStringException extends Exception {
    @Override
    public String getMessage() {
        return "[CAUTION] В базе уже есть идентичная строка, данный ввод пропускаем";
    }
}
