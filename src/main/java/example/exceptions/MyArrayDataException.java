package example.exceptions;

import lombok.Getter;

@Getter
public class MyArrayDataException extends Exception {
    private final int row;
    private final int column;

    public MyArrayDataException(int row, int column) {
        super("Array Exception :: Неверные данные в ячейке [" + (row + 1) + "][" + (column + 1) + "]!");
        this.row = row + 1;
        this.column = column + 1;
    }
}
