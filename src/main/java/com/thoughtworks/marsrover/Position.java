package com.thoughtworks.marsrover;

import lombok.Builder;

import java.util.Arrays;

@Builder
public class Position {
    private Integer x;
    private Integer y;
    private Direction direction;

    public void forward() {
        switch (direction) {
            case N:
                y += 1;
                break;
            case S:
                y -= 1;
                break;
            case W:
                x -= 1;
                break;
            case E:
                x += 1;
                break;
        }

    }

    public void turnLeft() {
        int indexOfDirction = Arrays.asList(Direction.values()).indexOf(direction);
        if (indexOfDirction + 1 < Direction.values().length) {
            direction = Direction.values()[indexOfDirction + 1];
        } else {
            direction = Direction.N;
        }
    }

    public void turnRight() {
        int indexOfDirction = Arrays.asList(Direction.values()).indexOf(direction);
        if (indexOfDirction != 0) {
            direction = Direction.values()[indexOfDirction - 1];
        } else {
            direction = Direction.E;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
