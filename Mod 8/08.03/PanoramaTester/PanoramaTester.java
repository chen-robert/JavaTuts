
/**
 * Make a stitched image of 5 mars pictures.
 *
 * @author Brendon Ho
 * @version 7/19/17
 */

import java.awt.*;     //graphics

//colors class
class TrueColors{
    
    //convert to negative
    public static void toNegative(){
        Picture pictureObj = new Picture("washingtonmonument.jpg");     //creates a new Picture object representing the file in the parameter list                 
        pictureObj.explore();                                           //explore the Picture object which is currently the unaltered original image
        int redValue = 0; int greenValue = 0; int blueValue = 0;        //declare and initialize the variables that hold the red, green, and blue values (0-255)
        
        Pixel targetPixel = new Pixel(pictureObj, 0,0);                //set the coordinate for the image origin
        Color pixelColor = null;                                        //declare a Color object and set its initial value to null (or nothing)          
        
        for(int y=0; y < pictureObj.getHeight(); y++)                   //outside nested loop to traverse the image from top to bottom
        {
            for(int x = 0; x < pictureObj.getWidth(); x++)              //inside nested loop to traverse the image from left to right
            {
                targetPixel = pictureObj.getPixel(x,y);                 //gets the x,y coordinate of the target pixel
                pixelColor = targetPixel.getColor();                    //gets the color of the target pixel
                
                redValue = pixelColor.getRed();                         //assign the red component (0-255) of the target pixel to the redValue variable 
                greenValue = pixelColor.getGreen();                     //assign the green component (0-255) of the target pixel to the greenValue variable
                blueValue = pixelColor.getBlue();                       //assign the blue component (0-255) of the target pixel to the blueValue variable

                pixelColor = new Color(Math.abs(255 - redValue), Math.abs(250 - greenValue), Math.abs(250 - blueValue));//assign the color of the pixel
                targetPixel.setColor(pixelColor);                       //sets the new color of the target pixel
            }//end of the inner for loop
        }//end of the outer for loop
        
        pictureObj.explore();                                           //explore the Picture object which is now the altered image
        pictureObj.write("NewWashingtonMonument.jpg");                  //write the altered Picture object to a new file
        pictureObj.show();  
    }
    
    //convert to grayscale
    public static void toGrayscale(){
        Picture pictureObj = new Picture("washingtonmonument.jpg");     //creates a new Picture object representing the file in the parameter list                 
        pictureObj.explore();                                           //explore the Picture object which is currently the unaltered original image
        int redValue = 0; int greenValue = 0; int blueValue = 0;        //declare and initialize the variables that hold the red, green, and blue values (0-255)
        
        Pixel targetPixel = new Pixel(pictureObj, 0,0);                //set the coordinate for the image origin
        Color pixelColor = null;                                        //declare a Color object and set its initial value to null (or nothing)          
        
        for(int y=0; y < pictureObj.getHeight(); y++)                   //outside nested loop to traverse the image from top to bottom
        {
            for(int x = 0; x < pictureObj.getWidth(); x++)              //inside nested loop to traverse the image from left to right
            {
                targetPixel = pictureObj.getPixel(x,y);                 //gets the x,y coordinate of the target pixel
                pixelColor = targetPixel.getColor();                    //gets the color of the target pixel
                
                redValue = pixelColor.getRed();                         //assign the red component (0-255) of the target pixel to the redValue variable 
                greenValue = redValue;                   //assign the green component (0-255) of the target pixel to the greenValue variable
                blueValue = greenValue;                      //assign the blue component (0-255) of the target pixel to the blueValue variable

                pixelColor = new Color(redValue, greenValue, blueValue);//assign the color of the pixel
                targetPixel.setColor(pixelColor);                       //sets the new color of the target pixel
            }//end of the inner for loop
        }//end of the outer for loop
        
        pictureObj.explore();                                           //explore the Picture object which is now the altered image
        pictureObj.write("NewWashingtonMonument.jpg");                  //write the altered Picture object to a new file
        pictureObj.show();  
    }
} 

//class for stitching
class Stitch{
    public static void stitch(){
        
    }
}

public class PanoramaTester
{
    public static void main(){
        
    }
}
