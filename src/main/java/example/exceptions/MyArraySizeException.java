package example.exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Array Exception :: Неверный размер массива!");
    }
}
