package ija.ija2023.homework1.common;
public interface Robot {
    int angle();
    boolean canMove();
    Position getPositin();
    boolean move();
    void turn();
}