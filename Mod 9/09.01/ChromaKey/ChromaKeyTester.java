
/**
 * Make a GreenScreen and replace the background with something else
 *
 * @author Brendon Ho
 * @version 7/25/17
 */
import java.awt.*;

//chromakey class
class ChromaKey{
    //private variables
    private Picture sub = new Picture("sub.jpg");
    private Picture back = new Picture("bg.jpg");
    
    //ignore this
    //private Picture targetPicture = new Picture(sub.getWidth(), sub.getHeight());
    
    //initialize
    ChromaKey(Picture subject, Picture background){
        sub = subject;
        back = background;
    }
    
    //greenscreen method
    public void greenScreen(){
        //explore pix
        sub.explore();
        back.explore();
        
        //rbg intial
        int red = 0;
        int green = 0;
        int blue = 0;
        
        //nul colors
        Color color = null;
        Color color2 = null;
        
        //pixel intial
        Pixel pixel = new Pixel(sub, 0, 0);
        Pixel pixel2 = new Pixel(back, 0, 0);
        Pixel targPixel = null;
        
        //for loops
        for(int y = 0; y < sub.getHeight(); y++){
            for(int x = 0; x < sub.getWidth(); x++){
                pixel = sub.getPixel(x,y);
                color = pixel.getColor();
                
                pixel2 = back.getPixel(x,y);
                color2 = pixel2.getColor();
                
                red = color.getRed();
                green = color.getGreen();
                blue = color.getBlue();
                
                if (red >= 0 && red <= 85 && green >= 0 && green <= 75 && blue <= 100)
                {
                    color = new Color(red,green,blue);
                
                }else{
                    
                    color = pixel2.getColor();
                    //pixel.setColor(color2);
                }
                pixel.setColor(color);
            }//end of for loop
        }//end of for loop
        
        //write new
        sub.write("New.jpg");
        Picture brandnew = new Picture("New.jpg");
        brandnew.explore();
        
        
    }//end of method
}//end of class

//public class
public class ChromaKeyTester{
    public static void main(String[] args){
        
        //start up
        Picture sub = new Picture("sub.jpg");
        Picture back = new Picture("bg.jpg");
        ChromaKey ck = new ChromaKey(sub, back);
        
        //call method
        ck.greenScreen();
    }//end of method
}//end of class
