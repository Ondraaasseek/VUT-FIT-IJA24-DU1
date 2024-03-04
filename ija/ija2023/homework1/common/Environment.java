package ija.ija2023.homework1.common;
interface Enviroment {
    public boolean addRobot(Robot robot);
    public boolean containsPosition(int row, int col);
    public boolean createObstacleAt(int row, int col);
    public boolean obstacleAt(int row, int col);
    public boolean obstacleAt(Position p);
    public boolean robotAt(Position p);
    public boolean containsPosition(Position pos);
}