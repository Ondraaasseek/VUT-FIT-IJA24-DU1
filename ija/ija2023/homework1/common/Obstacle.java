package ija.ija2023.homework1.common;

import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Environment;
public class Obstacle extends Object{
    Environment env;
    Position pos;
    public Obstacle(Enviroment env, Position pos){
        this.env = env;
        this.pos = pos;
    }

    public Position getPosition(){
        return this.pos;
    }
}