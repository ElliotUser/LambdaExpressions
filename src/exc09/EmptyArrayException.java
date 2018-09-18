package exc09;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Массив пуст");
    }
}
