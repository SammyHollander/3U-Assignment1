
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating new city called lego city
        City legoCity = new City();
        //creating walls in lego city
        new Wall(legoCity,0,1,Direction.WEST);
        new Wall(legoCity,1,1,Direction.WEST);
        new Wall(legoCity,1,1,Direction.SOUTH);
        // Creating new robot in city lego city called karel1
        //karel1 starts at 0,1 facing SOUTH
        Robot karel1 = new Robot(legoCity,0,1,Direction.SOUTH);
        // Creating new robot in city lego city called karel2
        Robot karel2 = new Robot(legoCity,0,0,Direction.SOUTH);
        //moveing karel1
        karel1.move();
        //moveing karel2
        karel2.move();
        //turning karel1
        karel1.turnLeft();
        //moveing karel2
        karel2.move();
        //moveing karel1
        karel1.move();
        //turning karel2
        karel2.turnLeft();
        //turning karel1 right
        karel1.turnLeft();
        karel1.turnLeft();
        karel1.turnLeft();
        //moveing karel2
        karel2.move();
        //moveing karel1 to end position
        karel1.move();
        karel1.turnLeft();
        karel1.turnLeft();
        karel1.turnLeft();
        karel1.move();
        
        
        
    }
}
