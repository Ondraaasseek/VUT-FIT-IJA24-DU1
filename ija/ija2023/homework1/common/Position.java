
package ija.ija2023.homework1.common;
public class Position extends Object{

    private int col;
    private int row;
    public static Position Position(int row, int col){
        Position.row = row;
        Position.col = col;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return this.col == position.getCol() && this.row == position.getRow();
    }

    int getCol(){
        return col;
    }

    int getRow(){
        return row;
    }

    int hashCode(){
        return 0;
    }

    String toString(){
        return "Position: " + Position.row + " " + Position.col;
    }
}