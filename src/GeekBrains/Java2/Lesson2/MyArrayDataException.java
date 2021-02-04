package GeekBrains.Java2.Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message, Throwable ex) {
        super(message, ex);
    }

    public MyArrayDataException(String message) {
        super(message);
    }
}
