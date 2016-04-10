package com.packtpublishing.tddjava.ch04ship;

import java.util.List;

public class Ship {
    private final Location location;
    private Planet planet;

    public Location getLocation() {
        return this.location;
    }

    public Ship(Location location, Planet planet){
        this.location = location;
        this.planet = planet;
    }
    public Planet getPlanet(){
        return this.planet;
    }
    public boolean moveForward() { return this.location.forward(planet.getMax(), planet.getObstacles());}
    public boolean moveBackward() {
        return this.location.backward(planet.getMax());
    }
    public void turnLeft() {this.location.turnLeft();}
    public void turnRight() {this.location.turnRight();}
    public String receiveCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch(command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
            }
        }
        return commands;
    }



}
