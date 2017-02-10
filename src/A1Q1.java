
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating new city called lego city
        City legoCity = new City();
        // Creating new robot in city lego city called karel
        //karel is starting on street 0, av, 2 facing WEST
        Robot karel = new Robot(legoCity,0,2,Direction. WEST);
        //creating a series of new walls to form a 2x2 square from 1,2 to 2,1
        new Wall (legoCity,1,2,Direction.NORTH);
        new Wall (legoCity,1,1,Direction.NORTH);
        new Wall (legoCity,1,1,Direction.WEST);
        new Wall (legoCity,2,1,Direction.WEST);
        new Wall (legoCity,2,1,Direction.SOUTH);
        new Wall (legoCity,2,2,Direction.SOUTH);
        new Wall (legoCity,2,2,Direction.EAST);
        new Wall (legoCity,1,2,Direction.EAST);
        //moving robot karel counterclockwise around the square of walls
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
    }
}
