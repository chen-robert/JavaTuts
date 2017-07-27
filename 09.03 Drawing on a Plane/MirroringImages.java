
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
    {//start of user defined method 1
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
    }//end of user defined method 1
    
    //create the 1x1 panel
    public Picture drawPanel()
    {//start of user defined method 2
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
    }//end of user defined method 2
    
    //mirror the 1x1 panel into a 2x2
    public Picture mirrorImage1()
    {//start of user defined method 3
        //take the panel and put it in a 2x2 screen
        g2V2.drawImage(newCanvas1.getImage(), 0, 0, null);
        
        //create and initialize pixel and color objects
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color sourceColor1 = null;
        
        //for loop to mirror across vertical line
        for(int y = 0; y < newCanvas2.getHeight() / 2; y++)
        {//start of outer for loop
            for(int lx = 0, rx = newCanvas2.getWidth(); lx < newCanvas2.getWidth() / 2; lx++, rx--)
            {//start of inner for loop
                //take the pixels from the image and put them on the right side
                leftPixel = newCanvas2.getPixel(lx, y);
                sourceColor1 = leftPixel.getColor();
                rightPixel = newCanvas2.getPixel(rx - 1, y); 
                rightPixel.setColor(sourceColor1);
            }//end of inner for loop
        }//end of outer for loop
        
        //create and initialize pixel and color objects
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Color sourceColor2 = null;
        
        //for loop to mirror across horizontal line
        for(int x = 0; x < newCanvas2.getWidth(); x++)
        {//start of outer for loop
            for(int ty = 0, by = newCanvas2.getHeight(); ty < newCanvas2.getHeight() / 2; ty++, by--)
            {//start of inner for lop
                //take the pixels from the image and put them on the bottom side
                topPixel = newCanvas2.getPixel(x, ty);
                sourceColor2 = topPixel.getColor();
                bottomPixel = newCanvas2.getPixel(x, by - 1);
                bottomPixel.setColor(sourceColor2);
            }//end of inner for loop
        }//end of outer for loop
        return newCanvas2;
    }//end of user defined method 3
    
    //mirror the 2x2 panel into a 4x4
    public Picture mirrorImage2()
    {//start of user defined method 4
        //take the panel and put it in a 4x4 screen
        g2V3.drawImage(newCanvas2.getImage(), 0,0, null);
        
        //create and initialize pixel and color objects
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color sourceColor1 = null;
        
        //for loop to mirror image across vertical line
        for(int y = 0; y < newCanvas3.getHeight() / 2; y++)
        {//start of outer for loop
            for(int lx = 0, rx = newCanvas3.getWidth(); lx < newCanvas3.getWidth() / 2; lx++, rx--)
            {//start of inner for loop
                //take the pixels from the image and put them on the right side
                leftPixel = newCanvas3.getPixel(lx, y);
                sourceColor1 = leftPixel.getColor();
                rightPixel = newCanvas3.getPixel(rx - 1, y); 
                rightPixel.setColor(sourceColor1);
            }//end of inner for loop
        }//end of outer for loop
        
        //create and initialize pixel and color objects
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Color sourceColor2 = null;
        
        //for loop to mirror image across horizontal line
        for(int x = 0; x < newCanvas3.getWidth(); x++)
        {//start of outer for loop
            for(int ty = 0, by = newCanvas3.getHeight(); ty < newCanvas3.getHeight() / 2; ty++, by--)
            {//start of inner for loop
                //take the pixels from the image and put them on the bottom side
                topPixel = newCanvas3.getPixel(x, ty);
                sourceColor2 = topPixel.getColor();
                bottomPixel = newCanvas3.getPixel(x, by - 1);
                bottomPixel.setColor(sourceColor2);
            }//end of inner for loop
        }//end of outer for loop
        
        return newCanvas3;
    }//end of user defined method 4
}//end of class

