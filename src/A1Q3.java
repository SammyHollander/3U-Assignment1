
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creating new city called lego city
        City legoCity = new City();
        // Creating new robot in city lego city called karel
        //karel is starting at 3,0, facing EAST
        Robot karel = new Robot(legoCity,3,0,Direction.EAST);
        //creating walls to form a 'mountain'
        new Wall(legoCity,3,2,Direction.WEST);
        new Wall(legoCity,3,2,Direction.NORTH);
        new Wall(legoCity,2,3,Direction.WEST);
        new Wall(legoCity,1,3,Direction.WEST);
        new Wall(legoCity,1,3,Direction.NORTH);
        new Wall(legoCity,1,3,Direction.EAST);
        new Wall(legoCity,2,4,Direction.NORTH);
        new Wall(legoCity,2,4,Direction.EAST);
        new Wall(legoCity,3,4,Direction.EAST);
        //creating new 'flag' represented by a thing on 3,1 in lego city
        new Thing(legoCity,3,1);
        //moveing karel to on top of flag
        karel.move();
        //makeing karel pick up the flag
        karel.pickThing();
        //makeing karel climb to top of mountain
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        //makeing karel drop the flag
        karel.putThing();
        //makeing karel climb down the mountain
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
    }
}
