package com.thoughtworks.marsrover;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MarsRoverTest {

    @Test
    public void given_one_commend() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        marsRover.run("M");
        MarsRover result = new MarsRover(0, 1, Direction.N);

        assertEquals(marsRover.toString(), result.toString());
    }
}