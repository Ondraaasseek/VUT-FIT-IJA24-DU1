package ija.ija2023.homework1.room;

import ija.ija2023.homework1.common.Environment;
import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Robot;

public class Room extends Object implements Environment {

    private int rows;
    private int cols;
    private char[][] map;
    private Room(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.map = new char[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                map[i][j] = '0';
            }
        }
    }
    public static Room create(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rozmery mistnosti musi byt vetsi nez 0");
        }
        return new Room(rows, cols);
    }
    public boolean addRobot(Robot robot) {
        if(robot == null) {
            return false;
        }
        if(!containsPosition(robot.getPosition())){
            return false;
        }
        if(map[robot.getPosition().getRow()][robot.getPosition().getCol()] != '0') {
            return false;
        }
        map[robot.getPosition().getRow()][robot.getPosition().getCol()] = 'R';
        return true;
    }

    public boolean containsPosition(int row, int col) {
        if (row < 0 || row >= this.rows || col < 0 || col >= this.cols) {
            return false;
        }
        return true;
    }

    public boolean createObstacleAt(int row, int col) {
        if (containsPosition(row, col)) {
            if (map[row][col] != '0') {
                return false;
            }
            map[row][col] = 'O';
            return true;
        }
        return false;
    }

    public boolean obstacleAt(int row, int col) {
        if (containsPosition(row, col)) {
            return map[row][col] == 'O';
        }
        return false;
    }

    public boolean obstacleAt(Position p) {
        if (p == null) {
            return false;
        }
        return obstacleAt(p.getRow(), p.getCol());
    }

    public boolean robotAt(Position p) {
        if (p == null) {
            return false;
        }
        if (containsPosition(p)) {
            return map[p.getRow()][p.getCol()] == 'R';
        }
        return false;
    }

    public boolean containsPosition(Position pos) {
        return containsPosition(pos.getRow(), pos.getCol());
    }
}