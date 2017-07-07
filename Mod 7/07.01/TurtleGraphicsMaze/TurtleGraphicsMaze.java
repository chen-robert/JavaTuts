
/**
 * Get the turtle around the maze using methods and numbers.
 *
 * @author (Brendon Ho)
 * @version (7/7/17)
 */
import java.awt.*;
public class TurtleGraphicsMaze
{
    public static void main(String[] args)
    {
        
        Picture pictureObj = new Picture("Maze_Background.png");    //create a Picture object for the maze background image
        World worldObj = new World();                               //create a World object to draw in
        worldObj.setPicture(pictureObj);                            //set the maze background image in the World object
        
        //Initial Postition
        Turtle myrtle = new Turtle(91,139, worldObj);               //create a Turtle object starting at coordinate (19,139) in the World object
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();                                              //show the Turtle object
        
        //Position 2
        Turtle myrtle2 = new Turtle(236, 139, worldObj);
        myrtle.setHeight(10);                                       //set myrtle's height at 10 pixels
        myrtle.setWidth(10);                                        //set myrtle's width at 10 pixels
        myrtle.setHeading(180);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();  
        
        //Position 3
        Turtle myrtle3 = new Turtle(236,186,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();
        
        //Position 4
        Turtle myrtle4 = new Turtle(501,186,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show(); 
        
        //Position 5
        Turtle myrtle5 = new Turtle(355,262,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();  
        
        //Position 6
        Turtle myrtle6 = new Turtle(355,368,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();  
        
        //Position 7
        Turtle myrtle7 = new Turtle(155,368,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();  
        
        //the rest of the code goes here
        
        //move forward 145
        myrtle.forward(145);
        System.out.println("forward 145");
        
        //turn left
        myrtle.turnRight();
        System.out.println("turn left");
        
        //move forward 50
        myrtle.forward(50);
        System.out.println("forward 50");
        
        //turn left
        myrtle.turnLeft();
        System.out.println("turn left");
        
        //move forward 265
        myrtle.forward(Math.max(100,265));
        System.out.println("forward " + Math.max(100,265));
        
        //turn right 152 degrees
        myrtle.turn(152);
        System.out.println("turned 152 degrees");
        
        //move forward 163
        myrtle.forward(Math.abs(-163));
        System.out.println("forward " + Math.abs(-163));
        
        //turn left 62 degrees
        myrtle.turn(-62);
        System.out.println("turn -62 degrees");
        
        //move forward 105
        double powa = Math.pow(105,2);
        myrtle.forward(Math.abs(-105));
        System.out.println("forward " + Math.sqrt(powa));
        
        //turn right
        myrtle.turnRight();
        System.out.println("turn right");
        
        //move forward 200 to finish
        myrtle.forward(Math.min(200,100010));
        System.out.println("forward " + Math.min(200, 100010));
        
        //FINALLY!!
        System.out.println("\nWHOO HOOO");
        
        
        
        //Total calcucations
        int tote = 145 + 50 + Math.max(100,265) + Math.abs(-163) + Math.abs(-105) + Math.min(200, 100050);
        System.out.println("\nTotal distance: " + tote);
        
        //Total x calculations
        int totex = (236-91) + (501-236) + (501-355) + (355-155);
        System.out.println("\nTotal X distance" + totex);
        
        //Total y calculations
        int totey = (186-139) + (262-186) + (368-262);
        System.out.println("\nTotal Y distance" + totey);
        
        System.out.println("\n" + worldObj);
    }
}
