
/**
 * Writing a program that makes a square face based off the Turtle .
 *
 * @author (Brendon Ho)
 * @version (7/7/17)
 */
import java.awt.*;
public class TurtleProcedural
{
    //rectangle method, it creates the face in a rectangular shape
    public static void rectangle(Turtle myrtle){
    //makes the rectangle
    myrtle.hide();
    
    myrtle.penUp();
    myrtle.setPenWidth(200);
    myrtle.setPenColor(Color.YELLOW);
    myrtle.moveTo(250,150);
    
    myrtle.penDown();
    myrtle.moveTo(400,150);
    
    myrtle.penDown();
    myrtle.moveTo(400,320);
    
    myrtle.penDown();
    myrtle.moveTo(250,320);
    
    myrtle.penDown();
    myrtle.moveTo(250,150);
    }//end of rectangle method
    
    //method for eyes and nose.
    public static void eyesnnose(Turtle myrtle, int fill, Color color, int x1, int y1, int x2, int y2, int x3, int y3){
      myrtle.hide();
    
    myrtle.penUp();
    myrtle.setPenWidth(fill);
    myrtle.setPenColor(color);
    myrtle.moveTo(x1,y1);
    
    myrtle.penDown();
    myrtle.moveTo(x2,y2);
   
    myrtle.penDown();
    myrtle.moveTo(x3,y3);
    
    myrtle.penDown();
    myrtle.moveTo(x1,y1);
    }//end of eyesnnose method
    
    //mouth method to create a rectangular mouth
    public static void mouth(Turtle myrtle){
    myrtle.hide();
    
    myrtle.penUp();
    myrtle.setPenWidth(75);
    myrtle.setPenColor(Color.WHITE);
    myrtle.moveTo(250,350);
    
    myrtle.penDown();
    myrtle.moveTo(400,350);
    }//end of mouth method
    
    //mouthline method to create the black line in the middle of the mouth
    public static void mouthLine(Turtle myrtle){
    myrtle.hide();
    
    myrtle.penUp();
    myrtle.setPenWidth(3);
    myrtle.setPenColor(Color.BLACK);
    myrtle.moveTo(215,350);
    
    myrtle.penDown();
    myrtle.moveTo(435,350);
    }//end of mouthline method
    
    //main method
    public static void main(String[] args){
        World worldObj = new World(); // has the canvas set up
        Turtle face = new Turtle(0,0,worldObj);
        
        //create the face
        rectangle(face);
        
        //create the eyes and nose using eyesnnose method
        
        //eyes
        eyesnnose(face,10, Color.RED,225,120, 200,140,250,140);
        eyesnnose(face, 10, Color.RED, 420, 120, 395, 140, 445, 140);
        
        //nose
        eyesnnose(face, 10, Color.GREEN, 322, 225, 347, 275, 297, 275);
        
        //create the mouth and mouthline
        
        //mouth
        mouth(face);
        
        //mouthline
        mouthLine(face);
    }//end of main method
}//end of class
