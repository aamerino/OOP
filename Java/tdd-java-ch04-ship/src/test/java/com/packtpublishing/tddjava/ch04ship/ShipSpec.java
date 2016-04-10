package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

@Test
public class ShipSpec {

    private Ship ship;
    private Location location;
    private Planet planet;

    @BeforeMethod
    public void beforeTest() {
        Point max = new Point(50, 50);
        location = new Location(new Point(21, 13), Direction.NORTH);
        List<Point> obstacles = new ArrayList<>();
        obstacles.add(new Point(44, 44));
        obstacles.add(new Point(45, 46));
        planet = new Planet(max, obstacles);
        ship = new Ship(location, planet);
    }

    public void whenInstantiatedThenLocationIsSet() {
        assertEquals(ship.getLocation(), location);
    }

    public void getLocationOfShip(){
        assertEquals(location, ship.getLocation());
    }
    public void whenMoveForwardThenForward() {
        Location expected = location.copy();
        expected.forward();
        ship.moveForward();
        assertEquals(ship.getLocation(), expected);
    }

    public void whenMoveBackwardThenBackward() {
        Location expected = location.copy();
        expected.backward();
        ship.moveBackward();
        assertEquals(ship.getLocation(), expected);
    }
    public void whenMoveLeftThenLeft(){
        Location expected = location.copy();
        expected.turnLeft();
        ship.turnLeft();
        assertEquals(ship.getLocation(), expected);
    }

    public void whenTurnRightThenRight() {
        Location expected = location.copy();
        expected.turnRight();
        ship.turnRight();
        assertEquals(ship.getLocation(), expected);
    }

    public void whenReceiveCommandsFThenForward() {
        Location expected = location.copy();
        expected.forward();
        ship.receiveCommands("f");
        assertEquals(ship.getLocation(), expected);
    }

    public void whenReceiveCommandsThenAllAreExecuted() {
        Location expected = location.copy();
        expected.turnRight();
        expected.forward();
        expected.turnLeft();
        expected.backward();
        ship.receiveCommands("rflb");
        assertEquals(ship.getLocation(), expected);
    }

    public void whenInstantiatedThenPlanetIsStored() {
        assertEquals(ship.getPlanet(), planet);
    }

    public void overpassEastBoundary() {
        location.setDirection(Direction.EAST);
        location.getPoint().setX(planet.getMax().getX());
        ship.receiveCommands("f");
        assertEquals(location.getX(), 1);
    }


    public void ifTriesToMoveForwardAndFindsObstacleReturnFalse(){
        List<Point> obstacles = new ArrayList<>();
        obstacles.add(new Point(location.getX() + 1, location.getY()+1));
        ship.getPlanet().setObstacles(obstacles);
        assertFalse(ship.moveForward());
    }

}



