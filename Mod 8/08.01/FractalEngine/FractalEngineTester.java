/**
 *This is a program that draws cool triagnle fractal patterns. 
 * 
 * �FLVS 2008
 * Assignment 08.01 
 * @author Brendon Ho
 * @version 7/17/17
 */

import java.awt.*;
class FractalEngine
{
    FractalEngine()       //default constructor for Fractal class
    {
    }
    
    //write the set up drawing method here
    
    
    //write the drawFractal method here
    public static char drawFractal(String movement, Turtle myrtle){
        //set the stuff up for the loop
        String sub = "";
        char wow = '+';
        int counter = 0;
        
        //for loop
        for (int n=0;n<movement.length();n++){
             
            //the if else statements
            wow = movement.charAt(counter++);
            if(wow == 'F'){
                 myrtle.forward(10);
            }else if(wow == '+'){
                 myrtle.turnRight();
                 
            }else if(wow == '-'){
                 myrtle.turnLeft();
                 
            }else{
                 counter++;
            }
        }
        
        //return the char
        return wow;
    }//end of method
}//end of class

//public class
public class FractalEngineTester
{
    public static void main(String[] args)
    {
       //create objects for the world, the turtle, and the fractal class here
       World worldObj = new World(); //creates the world
       Turtle myrtle = new Turtle(320,240,worldObj);
       FractalEngine fe = new FractalEngine();
       myrtle.setHeading(90);
       
       int lineLength = 100;    //change the line length as needed
       
       //the following series of drawing rules are supplied to help test your program.
       //only one can be uncommented at a time.
       String drawingRule = "F";
       //String rule = "F-F+F+F-F";
       String rule = "F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F";
       //String rule = "F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F-F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F+F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F+F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F-F-F+F+F-F-F-F+F+F-F+F-F+F+F-F+F-F+F+F-F-F-F+F+F-F";
       
       char cool = fe.drawFractal(rule, myrtle);
       
    }//end of method
}//end of class