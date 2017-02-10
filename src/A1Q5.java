
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating new city called lego city
        City legoCity = new City();
        //creating walls to represent karel's house in lego city
        new Wall(legoCity,2,3,Direction.NORTH);
        new Wall(legoCity,2,3,Direction.EAST);
        new Wall(legoCity,2,3,Direction.WEST);
        new Wall(legoCity,3,3,Direction.EAST);
        new Wall(legoCity,3,3,Direction.SOUTH);
        //creating the things on the roads that represent karel's grocheries
        new Thing(legoCity,0,0);
        new Thing(legoCity,1,0);
        new Thing(legoCity,1,1);
        new Thing(legoCity,1,2);
        new Thing(legoCity,2,2);
        //creating robot karel labeled with a "K"
        Robot karel = new Robot(legoCity,3,3,Direction.EAST);
        karel.setLabel("K");
        //creating robot maria labeled with a "M"
        Robot maria = new Robot(legoCity,0,1,Direction.WEST);
        maria.setLabel("M");
        //turning karel around
        karel.turnLeft();
        karel.turnLeft();
        //moveing maria
        maria.move();
        //moveing karel
        karel.move();
        //makeing maria pick up the object
        maria.pickThing();
        //turning karel right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //turning maria left
        maria.turnLeft();
        //moveing karel
        karel.move();
        //moveing maria
        maria.move();
        //makeing karel pick up the object
        karel.pickThing();
        //makeing maria pick up the object
        maria.pickThing();
        //moveing karel
        karel.move();
        //makeing maria turn left
        maria.turnLeft();
        //makeing karel pick up the object
        karel.pickThing();
        //moveing maria
        maria.move();
        //turning karel left
        karel.turnLeft();
        //makeing maria pick thing up
        maria.pickThing();
        
        
        
        
        
        
    }
}
