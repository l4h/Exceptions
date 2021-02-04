package GeekBrains.Java2.Lesson2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException() {
        super("MyArraySizeException message");
    }
}
