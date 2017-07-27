
/**
 * The purpose of this grogram is to create an image and then mirror it creating M.C. Escher art
 *
 * @author (Andrew Xia)
 * @version (07/26/2017)
 */
import java.awt.*;

public class MirroringImages
{//start of class
    //private variables
    private Picture newCanvas1 = null;
    private Picture newCanvas2 = null;
    private Picture newCanvas3 = null;
    private Graphics gV1 = null;
    private Graphics gV2 = null;
    private Graphics gV3 = null;
    private Graphics2D g2V1 = null;
    private Graphics2D g2V2 = null;
    private Graphics2D g2V3 = null;
    
    //constructor for MirroringImages objects
    MirroringImages(Picture canvas, Picture canvas2, Picture canvas3)
    {
        newCanvas1 = canvas;
        newCanvas2 = canvas2;
        newCanvas3 = canvas3;
        newCanvas1.setAllPixelsToAColor(Color.WHITE);
        newCanvas2.setAllPixelsToAColor(Color.WHITE);
        newCanvas3.setAllPixelsToAColor(Color.WHITE);
        gV1 = newCanvas1.getGraphics();
        g2V1 = (Graphics2D)gV1;
        gV2 = newCanvas2.getGraphics();
        g2V2 = (Graphics2D)gV2;
        gV3 = newCanvas3.getGraphics();
        g2V3 = (Graphics2D)gV3;
    }
    
    //create the 1x1 panel
    public Picture drawPanel()
    {
       g2V1.setColor(Color.pink);
       g2V1.fillRect(40, 190, 40, 10);
       g2V1.setColor(Color.BLUE);
       g2V1.drawOval(180, 100, 40, 75);
       g2V1.setColor(Color.GREEN);
       g2V1.drawLine(160, 0, 160, 30);
       g2V1.drawLine(159, 0, 159, 30);
       g2V1.drawLine(161, 0, 161, 30);
       g2V1.drawLine(160, 30, 200, 30);
       g2V1.drawLine(160, 29, 200, 29);
       g2V1.drawLine(160, 31, 200, 31);
       g2V1.setColor(Color.YELLOW);
       g2V1.drawLine(0, 50, 50, 100);
       g2V1.drawLine(0, 49, 50, 99);
       g2V1.drawLine(0,48, 50, 98);
       g2V1.drawLine(50, 100, 100, 50);
       g2V1.drawLine(50, 99, 100, 49);
       g2V1.drawLine(50, 98, 100, 48);
       g2V1.setColor(Color.orange);
       g2V1.drawLine(90, 0, 90, 145);
       g2V1.drawLine(89, 0, 89, 145);
       g2V1.drawLine(88, 0, 88, 145);
       g2V1.drawLine(90, 145, 30, 145);
       g2V1.drawLine(90, 146, 30, 146);
       g2V1.drawLine(90, 147, 30, 147);
        
       return newCanvas1;
    }
    
    public Picture mirrorImage1()
    {
        g2V2.drawImage(newCanvas1.getImage(), 0, 0, null);
        
        
        return newCanvas2;
    }
    
    public Picture mirrorImage2()
    {
        g2V3.drawImage(newCanvas2.getImage(), 0,0, null);
        
        
        return newCanvas3;
    }
}//end of class

