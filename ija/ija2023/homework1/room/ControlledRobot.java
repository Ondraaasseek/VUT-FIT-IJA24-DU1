package ija.ija2023.homework1.room;

import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Environment;
import ija.ija2023.homework1.common.Robot;

public class ControlledRobot extends Object implements Robot {
    private Environment room;
    private Position position;
    private int angle;
    public ControlledRobot(Environment room, Position position) {
        this.position = position;
        this.room = room;
        this.angle = 0;
    }

    public static ControlledRobot create(Environment room, Position position) {
        if (room == null || position == null) {
            return null;
        }
        if (!room.containsPosition(position.getRow(), position.getCol())) {
            return null;
        }
        ControlledRobot robot = new ControlledRobot(room, position);
        if (!room.addRobot(robot)) {
            return null;
        }
        return robot;
    }

    public int angle() {
        return this.angle;
    }

    public boolean canMove() {
        switch (this.angle) {
            case 0:
                Position pos = Position.create(this.position.getRow() - 1, this.position.getCol());
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 45:
                pos = Position.create(this.position.getRow() - 1, this.position.getCol() + 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 90:
                pos = Position.create(this.position.getRow(), this.position.getCol() + 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 135:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol() + 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 180:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol());
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 225:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol() - 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 270:
                pos = Position.create(this.position.getRow(), this.position.getCol() - 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
            case 315:
                pos = Position.create(this.position.getRow() - 1, this.position.getCol() - 1);
                if (this.room.containsPosition(pos) && !this.room.obstacleAt(pos) && !this.room.robotAt(pos)) {
                    return true;
                }
                break;
        }
        return false;
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean move() {
        switch(this.angle){
            case 0:
                Position pos = Position.create(this.position.getRow() - 1, this.position.getCol());
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 45:
                pos = Position.create(this.position.getRow() - 1, this.position.getCol() + 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 90:
                pos = Position.create(this.position.getRow(), this.position.getCol() + 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 135:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol() + 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 180:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol());
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 225:
                pos = Position.create(this.position.getRow() + 1, this.position.getCol() - 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 270:
                pos = Position.create(this.position.getRow(), this.position.getCol() - 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
            case 315:
                pos = Position.create(this.position.getRow() - 1, this.position.getCol() - 1);
                if (this.canMove()) {
                    this.position = pos;
                    return true;
                }
                break;
        }
        return false;
    }

    public void turn() {
        this.angle = (this.angle + 45) % 360;
    }
}