
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city
        City legoCity = new City();
        //creating a new robot in lego city starting at 2,1, facing south
        Robot karel = new Robot (legoCity,1,2,Direction.SOUTH);
        //creating walls
        new Wall(legoCity,1,2,Direction.NORTH);
        new Wall(legoCity,1,2,Direction.EAST);
        new Wall(legoCity,1,2,Direction.SOUTH);
        new Wall(legoCity,1,1,Direction.NORTH);
        new Wall(legoCity,1,1,Direction.WEST);
        new Wall(legoCity,2,1,Direction.WEST);
        new Wall(legoCity,2,1,Direction.SOUTH);
        //creating newspaper, represented by a 'thing'
        new Thing(legoCity,2,2);
        //moveing karel on top of newspaper
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        //making karel pick up the newspaper
        karel.pickThing();
        //moveing karel back to his starting postition
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
    }
}
