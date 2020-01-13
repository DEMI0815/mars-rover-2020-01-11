package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    private MarsRover marsRover = new MarsRover(0, 0, Direction.N);

    @Test
    public void given_one_commend() {
        marsRover.run("M");
        MarsRover result = new MarsRover(0, 1, Direction.N);

        assertEquals(marsRover.toString(), result.toString());
    }

    @Test
    public void given_more_than_one_commends() {
        marsRover.run("RMLMRM");
        MarsRover result = new MarsRover(2, 1, Direction.E);

        assertEquals(marsRover.toString(), result.toString());
    }
}