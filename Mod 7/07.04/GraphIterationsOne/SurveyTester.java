
/**
 * Write a description of class Survey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
//tester class
class Survey{
    public static void bar(Turtle myrtle, int x1, int x2, int y1, int y2){
        myrtle.hide();
        myrtle.penUp();
        myrtle.setPenWidth(10);
        myrtle.setPenColor(Color.RED);
        myrtle.moveTo(x1,y1);
        myrtle.penDown();
        myrtle.moveTo(x2,y2);
    }
}

//Public Survey class
public class SurveyTester
{
    public static void main(String[] args){
        World worldObj = new World();
        //Picture pix = new Picture("Graph.png");
        //worldObj.setPicture(pix);
        Turtle b = new Turtle(0,0, worldObj);
        
        Survey surv= new Survey();
        
        //Print into system the world
        System.out.println(worldObj);
        
    }
}
