/**
 * This program encodes a message then decodes a message in an image.
 * 
 * �FLVS 2008
 * 08.04 - Assignment
 * @author Brendon Ho
 * @version 7/21/17
 */
import java.awt.*;
class HideMessage
{
    //encode
    public void encodeMessage(Picture stegoObject, int [] binaryArray)
    {
        //the initializers
        Pixel pixelTarget = new Pixel(stegoObject,0,0);
        Pixel [] pixelArray = stegoObject.getPixels();
        Color pixelColor = null;
        int redValue = 0;
        
        //for-loop for ecoding
        for(int x = 0; x < binaryArray.length; x++)
        {
            redValue = binaryArray[x];
            pixelTarget = pixelArray[x];
            pixelTarget.setRed(redValue);
        }
        pixelTarget = pixelArray[binaryArray.length];
        System.out.println(redValue);
        pixelTarget.setRed(255);
        
        //write and explore
        stegoObject.write("SecretMessage.bmp");
        
        stegoObject.explore();
        
    }//end of method
    
    //decode
    public void decode(Picture pic, int [] binary){
        //initialize
        Pixel pixelTarget = new Pixel(pic, 0, 0);
        Pixel pixel = null;
        
        Color pixelColor = null;
        int redValue = 0;
        
         
        String binaryInStringFormat = "";
        
        
        //for loop to decode
        for(int n = 0; n < pic.getWidth() && redValue < 255; n++){
            pixel = pic.getPixel(n, 0);
            pixelColor = pixel.getColor();
            redValue = pixelColor.getRed();
            
            binaryInStringFormat += redValue;
        }
        
        //print to system
        System.out.println(binaryInStringFormat);
        
        String eachEight = "";
        
        //for loop to convert from binary to char
        for(int n = 0; n < binaryInStringFormat.length(); n += 8){
            eachEight = (binaryInStringFormat.substring(n, n+8));
            
            int first = Character.getNumericValue(eachEight.charAt(0)) * 128;
            int second = Character.getNumericValue(eachEight.charAt(1)) * 64;
            int third = Character.getNumericValue(eachEight.charAt(2)) * 32;
            int fourth = Character.getNumericValue(eachEight.charAt(3)) * 16;
            int fifth = Character.getNumericValue(eachEight.charAt(4)) * 8;
            int sixth = Character.getNumericValue(eachEight.charAt(5)) * 4;
            int seventh = Character.getNumericValue(eachEight.charAt(6)) * 2;
            int last = Character.getNumericValue(eachEight.charAt(7)) * 1;
            
            int decode = first + second + third + fourth + fifth + sixth + seventh + last;
            System.out.println((char)decode);
            
            
            
        }//end of loop
        
    }//end of method
    
}//end of class

public class HidenMessege
{ 
    public static void main(String[] args)
    {
        //the code
        int[] bitArray = {0,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,1,1,0,0,1,0,0,1,1,1,1,0,0,1};
        //int[] bitArray = {0,1,0,0,1,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,0,1};
        
        //initialize
        Picture stegoObject = new Picture("earth.bmp");
        HideMessage stego = new HideMessage();
        stego.encodeMessage(stegoObject, bitArray);
        stego.decode(stegoObject, bitArray);
        
        
    }//end of method
}//end of class
