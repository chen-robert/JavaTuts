
/**
 * The purpose of this program is to make an image and turn it into a kaleidoscope
 *
 * @author (Andrew Xia)
 * @version (07/27/2017)
 */
import java.awt.*;

public class KaleidoscopeImage
{
    //private variables
    private Picture canvas = null;
    private Picture canvas2 = null;
    private Picture pictureObj = null;
    private Graphics g = null;
    private Graphics g2 = null;
    
    
    KaleidoscopeImage(Picture Canvas, Picture image, Picture Canvas2)
    {
        canvas = Canvas;
        canvas2 = Canvas2;
        pictureObj = image;
        g = canvas.getGraphics();
        g2 = (Graphics2D)g;
    }
    
    
    public Picture firstPanel()
    {
        g2.drawImage(pictureObj.getImage(), 0, canvas.getHeight() / 2, null);
        
        Pixel bottomLeftPixel = null;
        Pixel topRightPixel = null;
        Color sourceColor1 = null;
        for(int ty = 0, by = canvas.getHeight(); ty < canvas.getHeight() / 2; ty++, by--)
        {
            for(int lx = 0, rx = canvas.getWidth(); lx < canvas.getWidth() / 2; lx++, rx--)
            {
                bottomLeftPixel = canvas.getPixel(lx, by - 1);
                sourceColor1 = bottomLeftPixel.getColor();
                topRightPixel = canvas.getPixel(rx - 1, ty);
                topRightPixel.setColor(sourceColor1);
            }
        }
        
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        Color sourceColor2 = null;
        Color targetColor = null;
        for(int y = 0; y < canvas.getHeight() / 2; y++)
        {
            for(int lx = 0, rx = canvas.getWidth(); lx < canvas.getWidth() / 2; lx++, rx--)
            {
                sourcePixel = canvas.getPixel(rx - 1,y);
                sourceColor2 = sourcePixel.getColor();
                targetPixel = canvas2.getPixel(lx,y);
                targetPixel.setColor(sourceColor2);
            }
        }
        
        return canvas2;
    }

    
    public Picture secondPanel()
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color sourceColor = null;
        
        for(int y = 0; y < canvas2.getHeight() / 2; y++)
        {
            for(int lx = 0, rx = canvas2.getWidth(); lx < canvas2.getWidth() / 2; lx++, rx--)
            {
                leftPixel = canvas2.getPixel(lx,y);
                sourceColor = leftPixel.getColor();
                rightPixel = canvas2.getPixel(rx - 1, y);
                rightPixel.setColor(sourceColor);
            }
        }
        
        return canvas2;
    }
    
    
    public Picture thirdPanel()
    {
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Color sourceColor = null;
        
        for(int lx = 0, rx = canvas2.getWidth(); lx < canvas2.getWidth() / 2; lx++, rx--)
        {
            for(int ty = 0, by = canvas2.getHeight(); ty < canvas2.getHeight() / 2; ty++, by--)
            {
                topPixel = canvas2.getPixel(rx - 1, ty);
                sourceColor = topPixel.getColor();
                bottomPixel = canvas2.getPixel(rx - 1, by - 1);
                bottomPixel.setColor(sourceColor);
            }
        }
        
        return canvas2;
    }
    
    
    public Picture fourthPanel()
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Color sourceColor = null;
        
        for(int lx = 0, rx = canvas2.getWidth(); lx < canvas2.getWidth() / 2; lx++, rx--)
        {
            for(int ty = 0, by = canvas2.getHeight(); ty < canvas2.getHeight() / 2; ty++, by--)
            {
                leftPixel = canvas2.getPixel(rx - 1, by - 1);
                sourceColor = leftPixel.getColor();
                rightPixel = canvas2.getPixel(lx, by - 1);
                rightPixel.setColor(sourceColor);
            }
        }
        
        return canvas2;
    }
}
