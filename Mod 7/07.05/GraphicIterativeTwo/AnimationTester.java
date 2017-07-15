
/**
 * Write a description of class AnimationTester here.
 *
 * @author Brendon Ho
 * @version 7/10/17
 */
import java.awt.*;
import java.awt.Color;
import java.util.Random;

//animation class
class Animation{
   public static void drawImage(Turtle myrtle, int move, int distance,int angle,int sleepTime)
    {
        move = 1; //sets move = 1
        int current = 1; //sets i = 1 
        
        while(current <= 360 )
        {
            //below draws a square and repeats it to create a nice image
            myrtle.show();
            myrtle.setPenColor(Color.RED);
            myrtle.penDown();
            myrtle.turn(move);
            
            myrtle.forward(distance);
            myrtle.turn(angle);
            
            
            myrtle.forward(distance);
            myrtle.turn(angle);
            
            
            myrtle.forward(distance);
            
            
            myrtle.penUp(); //lifts the pen up
            
            
            move=move+1; //adds 1 to move
            current++; //adds 1 to i
            
            
        }//end of loop
    }//end of method
}//end of class

public class AnimationTester extends Animation{
    public static void main(String[] args){
        World worldObj = new World(); //creates a new world
        Turtle turt = new Turtle(320,240,worldObj); //creates the turtle
        
        drawImage(turt,1,100,60,100); //drawImage with filled in parameters
    }//end of method
}//end of class

