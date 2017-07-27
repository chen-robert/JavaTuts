
/**
 * Draws with graphics then copies the graphics to form a nice and neat pattern
 *
 * @author Brendon Ho
 * @version 7/25/17
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class DrawDesign{
    //pictures
    private Picture pic1 = null;
    private Picture pic2 = null;
    private Picture pic3 = null;
    
    //graphics
    private Graphics graphic = null;
    private Graphics graphic2 = null;
    private Graphics graphic3 = null;
    
    //graphics 2d
    private Graphics2D graphic2d = null;
    private Graphics2D graphic2d2 = null;
    private Graphics2D graphic2d3 = null;
        
    //constructor for MirroringImages objects
    DrawDesign(Picture one, Picture two, Picture three){
        pic1 = one;
        pic2 = two;
        pic3 = three;
        
        //set color
        Color black = new Color(38,50,56);
        
        pic1.setAllPixelsToAColor(black);
        pic2.setAllPixelsToAColor(black);
        pic3.setAllPixelsToAColor(black);
        
        graphic = pic1.getGraphics();
        graphic2 = pic2.getGraphics();
        graphic3 = pic3.getGraphics();
        
        graphic2d = (Graphics2D) graphic;
        graphic2d2 = (Graphics2D) graphic2;
        graphic2d3 = (Graphics2D) graphic3;
    }
        
    //create the 1x1 panel
    public Picture designPattern(){
        Color teal = new Color(0,150,136); 
        Color coolGreen = new Color(0,230,118);
        Color white = new Color(255,255,255);
        
        graphic2d.setColor(teal);
        graphic2d.fillRect(0,0,400,50);
        
        
        graphic2d.setColor(coolGreen);
        graphic2d.fillOval(25,100,150,50);
        
        graphic2d.setColor(white);
        graphic2d.drawLine(10,20,25,20);
        graphic2d.drawLine(10,25,25,25);
        graphic2d.drawLine(10,30,25,30);
            
        return pic1;
    }
        
    public Picture twobytwo(){
        graphic2d2.drawImage(pic1.getImage(), 0, 0, null);
            
        Pixel left = null;
        Pixel right = null;
        Pixel up = null;
        Pixel down = null;
        
        Color color = null;
        Color color2 = null;
        
        
        for(int y = 0; y < pic2.getHeight() / 2; y++){
            for(int leftx = 0, rightx = pic2.getWidth(); leftx < pic2.getWidth()/2; leftx++, rightx--){
                left = pic2.getPixel(leftx, y);
                
                color = left.getColor();
                right = pic2.getPixel(rightx - 1, y);
                right.setColor(color);
            }
        }
        for(int x = 0; x < pic2.getWidth(); x++){
            for(int topy = 0, downy = pic2.getHeight(); topy < pic2.getWidth()/2; topy++, downy--){
                up = pic2.getPixel(x, topy);
                color2 = up.getColor();
                down = pic2.getPixel(x, downy - 1);
                down.setColor(color2);
            }
        }
        
        
        return pic2;
    }
        
    public Picture fourbyfour(){
        graphic2d3.drawImage(pic2.getImage(), 0,0, null);
        Pixel left = null;
        Pixel right = null;
        Pixel up = null;
        Pixel down = null;
        
        Color color = null;
        Color color2 = null;
        
        
        for(int y = 0; y < pic3.getHeight() / 2; y++){
            for(int leftx = 0, rightx = pic3.getWidth(); leftx < pic3.getWidth()/2; leftx++, rightx--){
                left = pic2.getPixel(leftx, y);
                
                color = left.getColor();
                right = pic3.getPixel(rightx - 1, y);
                right.setColor(color);
            }
        }
        for(int x = 0; x < pic3.getWidth(); x++){
            for(int topy = 0, downy = pic3.getHeight(); topy < pic3.getHeight()/2; topy++, downy--){
                up = pic3.getPixel(x, topy);
                color2 = up.getColor();
                down = pic3.getPixel(x, downy - 1);
                down.setColor(color2);
            }
        }
        return pic3;
    }
}//end of class
