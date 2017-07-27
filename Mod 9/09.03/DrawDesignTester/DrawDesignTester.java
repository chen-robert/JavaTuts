
/**
 * Draws with graphics then copies the graphics to form a nice and neat pattern
 *
 * @author Brendon Ho
 * @version 7/25/17
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;


//public class
public class DrawDesignTester{
    public static void main(String[] args){
        Picture pattern = new Picture(200, 200);
        Picture pattern2 = new Picture(400, 400);
        Picture pattern3 = new Picture(800, 800);
        
        
        DrawDesign dd = new DrawDesign(pattern, pattern2, pattern3);
        
        pattern = dd.designPattern();
        pattern2 = dd.twobytwo();
        pattern3 = dd.fourbyfour();

        pattern.show();
        pattern2.show();
        pattern3.show();
    }//end of method
}//end of class
