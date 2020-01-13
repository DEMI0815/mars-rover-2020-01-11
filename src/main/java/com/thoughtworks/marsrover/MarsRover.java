package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover {
    private Position position;

    public MarsRover(Integer x, Integer y, Direction direction) {
        this.position = Position.builder().x(x).y(y).direction(direction).build();
    }

    public void excute(Commend commend) {
        switch (commend) {
            case M:
                position.forward();
                break;
            case L:
                position.turnLeft();
                break;
            case R:
                position.turnRight();
                break;
        }
    }

    public List<Commend> getCommendList(String commends) {
        return Arrays.stream(commends.split("")).map(Commend::valueOf).collect(Collectors.toList());
    }

    public void run(String commends) {
        getCommendList(commends).forEach(this::excute);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "position=" + position +
                '}';
    }
}
