
/**
 * This program will replace specific gray scale ranges.
 *
 * @author Brendon Ho
 * @version 7/23/17
 */

import java.awt.*;

//changes class
class Changes {
    
    //grayscale method
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
        
    }//end of method
    
    //replace method
    public void replace(){
        Picture newPicture = new Picture("NewWashingtonMonument.jpg");
        
        newPicture.explore();
        
        int red = 0;
        int green = 0;
        int blue = 0;
        
        Pixel targetPixel = new Pixel(newPicture, 0,0);
        
        Color color = null;
        
        for(int y = 0; y < newPicture.getHeight(); y++){
            for(int x = 0; x < newPicture.getWidth(); x++){
                targetPixel = newPicture.getPixel(x,y);                 //gets the x,y coordinate of the target pixel
                color = targetPixel.getColor();                    //gets the color of the target pixel
                
                red = color.getRed();                         //assign the red component (0-255) of the target pixel to the redValue variable 
                green = red;                   //assign the green component (0-255) of the target pixel to the greenValue variable
                blue = green;                      //assign the blue component (0-255) of the target pixel to the blueValue variable
                
                if(red >= 0 && red <= 20){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 21 && red <= 40){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 41 && red <= 60){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 61 && red <= 80){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 81 && red <= 100){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 101 && red <= 120){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 121 && red <= 140){
                    color = new Color(red + 100, green + 100, blue + 100);
                }else if(red >= 141 && red <=160){
                    color = new Color(red + 50, green + 50, blue + 50);
                }else{
                    red = color.getRed();
                    green = red;
                    blue = red;
                }
                targetPixel.setColor(color);
            }//end of loop
        }//end of loop
        
        //show
        newPicture.show();
        newPicture.write("NewNImproved.jpg");
        newPicture.explore();
    }//end of method
}//end of class

//public class
public class GrayScaleChanger{
    public static void main(String[] args){
        //call class
        Changes changes = new Changes();
    
        changes.toGrayscale();
        changes.replace();
    }//end of method
}//end of class
