
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
    private Picture sub;
    private Picture back;
    
    //ignore this
    //private Picture targetPicture = new Picture(sub.getWidth(), sub.getHeight());
    
    //Init
    public ChromaKey(Picture subject, Picture background){
        sub = subject;
        back = background;
    }
    
    //greenscreen method
    public void greenScreen(){
        //explore pix
        sub.explore();
        back.explore();
               
        //Unused?
        Pixel targPixel = null;
        
        //for loops
        for(int y = 0; y < sub.getHeight(); y++){
            for(int x = 0; x < sub.getWidth(); x++){
                Pixel pixel = sub.getPixel(x,y);
                Color color = pixel.getColor();
                
                //Get colors of the pixel
                int red, green, blue;
                red = color.getRed();
                green = color.getGreen();
                blue = color.getBlue();
                
                if (red >= 0 && red <= 85 && green >= 0 && green <= 75 && blue <= 100)
                {
                
                }else{
                    //Get second pixel color info
                    Pixel pixel2 = back.getPixel(x,y);
                    Color color2 = pixel2.getColor();
                    //Set the color to the second pixel's color
                    pixel.setColor(color2);
                }
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
