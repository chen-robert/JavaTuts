
/**
 * Write a description of class PanoramaTester here.
 *
 * @author Brendon Ho
 * @version 7/17/17
 */

import java.awt.*;     //graphics package

//Color alter class
class TrueColors{
    //convert to negative
    public static Picture toNegative(Picture pictureObj){
        //creates a new Picture object representing the file in the parameter list                 
                                                
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

        return pictureObj;
    }//end of method
}//end of class

//stitch images class
class Panorama{
    public static void panstitchog(){
        TrueColors sure = new TrueColors();
        
        //ALl the mars pix
        Picture sourcePicture = new Picture("Mars1.jpg");
        Picture sourcePicture2 = new Picture("Mars2.jpg");
        Picture sourcePicture3 = new Picture("Mars3.jpg");
        Picture sourcePicture4 = new Picture("Mars4.jpg");
        Picture sourcePicture5 = new Picture("Mars5.jpg");
        
        //set the length
        Picture targetPicture = new Picture(sourcePicture.getWidth() + sourcePicture2.getWidth() + sourcePicture3.getWidth() + sourcePicture4.getWidth() + sourcePicture5.getWidth(),sourcePicture.getHeight());
        
        for(int y = 0; y < sourcePicture.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop
        for(int y = 0; y < sourcePicture2.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture2.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture2.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture2.getWidth(),y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop          
        for(int y = 0; y < sourcePicture3.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture3.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture3.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture3.getWidth()*2,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
        for(int y = 0; y < sourcePicture4.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture4.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture4.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture4.getWidth()*3,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
        for(int y = 0; y < sourcePicture5.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture5.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture5.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture3.getWidth()*4,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
        
        //show and write
        targetPicture.show();
        targetPicture.write("OG.jpg");
        
    }//end of method
    public static void panstitch(){
        TrueColors sure = new TrueColors();
        
        //ALl the mars pix
        Picture sourcePicture = new Picture("Mars1.jpg");
        Picture sourcePicture2 = new Picture("Mars2.jpg");
        Picture sourcePicture3 = new Picture("Mars3.jpg");
        Picture sourcePicture4 = new Picture("Mars4.jpg");
        Picture sourcePicture5 = new Picture("Mars5.jpg");
       
        
        //set the length
        Picture targetPicture = new Picture(sourcePicture.getWidth() + sourcePicture2.getWidth() + sourcePicture3.getWidth() + sourcePicture4.getWidth() + sourcePicture5.getWidth(),sourcePicture.getHeight());
        
        //series of for loops
        for(int y = 0; y < sourcePicture.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop
        for(int y = 0; y < sourcePicture2.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture2.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture2.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture2.getWidth(),y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop          
        for(int y = 0; y < sourcePicture3.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture3.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture3.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture3.getWidth()*2,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
        for(int y = 0; y < sourcePicture4.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture4.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture4.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture4.getWidth()*3,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
        for(int y = 0; y < sourcePicture5.getHeight();y++)
        { 
            for(int x = 0; x < sourcePicture5.getWidth();x++)
            { 
                Pixel sourcePixel, targetPixel= null; 
                Color sourceColor, targetColor = null; 
                
                //first Picture
                sourcePixel = sourcePicture5.getPixel(x,y); 
                sourceColor = sourcePixel.getColor(); 
                targetPixel = targetPicture.getPixel(x + sourcePicture3.getWidth()*4,y); 
                targetPixel.setColor(sourceColor); 
                
                
            }//end of for loop
        } //end of for loop   
      
        //show and write
        Picture targ2 = sure.toNegative(targetPicture);
        targ2.show();
        targ2.write("NewFile.jpg");
    }//end of method
}//end of class

//public class
public class PanoramaTester
{
    public static void main(String[] args){
        //initiate the classes
        TrueColors sure = new TrueColors();
        Panorama lilo = new Panorama();
        
        //call the methods
        lilo.panstitch();
        lilo.panstitchog();
    }//end of method
}//end of class
