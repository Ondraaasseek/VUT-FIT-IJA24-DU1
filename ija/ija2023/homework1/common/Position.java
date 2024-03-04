package ija.ija2023.homework1.common;

public class Position extends Object {

    private int col;
    private int row;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static Position create(int row, int col) {
        return new Position(row, col);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return this.col == position.getCol() && this.row == position.getRow();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public int hashCode() {
        return 17 * row + col;
    }

    @Override
    public String toString() {
        return "Position: (" + row + ", " + col + ")";
    }
}