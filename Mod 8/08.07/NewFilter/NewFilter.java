
/**
 * Make a new filter not listed in the others
 *
 * @author Brendon Ho
 * @version 7/23/17
 */

import java.awt.*;

class Filter{
    public void toMidnight(){
        Picture pictureObj = new Picture("washingtonmonument.jpg");
        pictureObj.explore();
        
        int red = 0; int green = 0; int blue = 0;
        
        Pixel pixel = new Pixel(pictureObj, 0, 0);
        
        Color color = null;
        
        for(int y=0; y<pictureObj.getHeight(); y++){
            for(int x=0; x<pictureObj.getWidth(); x++){
                pixel = pictureObj.getPixel(x,y);
                color = pixel.getColor();
                
                red = color.getRed();
                green = color.getGreen();
                blue = color.getBlue();
                
                if(red >= 190 && red <= 255){
                    red = red;
                    green = green;
                    blue = blue;
                }else if(red >= 5 && red <= 70 && green >= 0 && green <= 85){
                    color = new Color(red,green, blue);
                }else{
                    color = new Color(44,44,44);
                }
                
                pixel.setColor(color);
            }//end of loop
        }//end of loop
        
        pictureObj.write("NewWashington.jpg");
        Picture newWash = new Picture("NewWashington.jpg");
        newWash.explore();
        newWash.show();
    }
}

public class NewFilter
{
    public static void main(String[] args){
        Filter filter = new Filter();
        
        filter.toMidnight();
    }
}
