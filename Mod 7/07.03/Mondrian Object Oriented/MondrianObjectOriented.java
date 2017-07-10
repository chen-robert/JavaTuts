
/**
 * Create the Mondrian art using turtle graphics.
 *
 * @author (Brendon Ho)
 * @version (7/7/17)
 */
import java.awt.*;


class MondrianCreatorClass{
    MondrianCreatorClass(){
    }
    public static void lineOrBlock(Turtle myrtle, Color color,int Thickness, int x1, int y1, int x2, int y2){
        //setup the turtle
        myrtle.hide();
        myrtle.penUp();
        myrtle.setPenWidth(Thickness);
        myrtle.setPenColor(color);
        
        //draw
        myrtle.moveTo(x1, y1);
        myrtle.penDown();
        myrtle.moveTo(x2, y2); 
    }
}
public class MondrianObjectOriented
{
    public static void main(String[] args){
        //get the class going
        MondrianCreatorClass mcc = new MondrianCreatorClass();
        
        //sets up world and turtle
        World worldObj = new World();
        Turtle lab = new Turtle(0,0,worldObj);
        
        //background photo
        Picture yoyo = new Picture("yoyo.png");
        worldObj.setPicture(yoyo);
        
        //red block
        mcc.lineOrBlock(lab, Color.RED, 50, 120, 0,120,120);
        
        //blue blocks
        mcc.lineOrBlock(lab, Color.BLUE, 80, 300, 100, 300, 200);
        mcc.lineOrBlock(lab, Color.BLUE, 20, 200, 400, 200,500);
        
        //yellow block
        mcc.lineOrBlock(lab, Color.YELLOW, 100, 500, 300, 500, 300);
        mcc.lineOrBlock(lab, Color.YELLOW, 40, 220, 100, 220, 150);
        
        //horizontal lines
        mcc.lineOrBlock(lab, Color.BLACK, 2, 0,60,640,60);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 0,80,640,80);
        mcc.lineOrBlock(lab, Color.BLACK, 3, 0,145,640,145);
        mcc.lineOrBlock(lab, Color.BLACK, 2, 0,170,640,170);
        mcc.lineOrBlock(lab, Color.BLACK, 3, 0,240,640,240);
        mcc.lineOrBlock(lab, Color.BLACK, 2, 0,250,640,250);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 0,350,640,350);
        mcc.lineOrBlock(lab, Color.BLACK, 3, 0,390,640,390);
        
        //vertical lines
        mcc.lineOrBlock(lab, Color.BLACK, 2, 95, 0, 95, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 145, 0, 145, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 2, 190, 0, 190, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 3, 200, 0, 200, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 210, 0, 210, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 2, 240, 0, 240, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 260, 0, 260, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 3, 340, 0, 340, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 2, 450, 0, 450, 480);
        mcc.lineOrBlock(lab, Color.BLACK, 1, 550, 0, 550, 480);
        
        //print the world size
        System.out.println(worldObj);
    }
}//end of MondrianObjectOrientedClass
