
/**
 * A bar graph of 10 people and their favorite programming language.
 *
 * @author Brendon Ho
 * @version 7/10/17
 */
import java.awt.*;

//tester class
class Survey{
    
    //bar method
    public static void bar(Turtle myrtle, int x1, int x2, int y1, int y2, Color color){
        //myrtle properties
        myrtle.hide();
        myrtle.penUp();
        myrtle.setPenWidth(10);
        myrtle.setPenColor(color);
        myrtle.moveTo(x1,y1);
        myrtle.penDown();
        myrtle.moveTo(x2,y2);
    }//end o fmethod
    
    //conversion method
    public int convertStringToInt(String stringOfDigits)
    {
        int number = 0;                                                 //declare and initialize the number variable    
        int total = 0;                                                  //declare and initialize the total variable
        String subData = "";                                            //declare and initialize the subData variable
          
        for(int n = 0; n < stringOfDigits.length() ; n+=2)              //traverse the length of the loop by increments of 2
        {
            subData = stringOfDigits.substring(n, n+2);                 //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                         //parse a string to an integer
            total+=number;                                              //accumulate the total
        }//end of loop
        
        return total;                                                   //return the total calculated
        
    }//end of method
}//end of class

//Public Survey class
public class SurveyTester
{
    public static void main(String[] args){
        //get the world environment set up
        World worldObj = new World();
        Picture pix = new Picture("Graph.jpg");
        worldObj.setPicture(pix);
        Turtle b = new Turtle(0,0, worldObj);
        
        //get Survey set up
        Survey surv= new Survey();
        
        //bars
        surv.bar(b, 105, 105, 370, 285, Color.ORANGE);
        surv.bar(b, 205, 205, 370, 190, Color.BLACK);
        surv.bar(b, 305, 305, 370, 360, Color.BLUE);
        
        //strings and numbers for the convert method
        String swiftPpl = "111";
        String javaPpl = "111111";
        String pythonPpl = "1";
        
        System.out.println("# of people who chose Swift: " + surv.convertStringToInt(swiftPpl));
        System.out.println("# of people who chose Java: " + surv.convertStringToInt(javaPpl));
        System.out.println("# of people who chose Python: " + surv.convertStringToInt(pythonPpl));
        
        //Print into system the world
        System.out.println(worldObj);
        
    }//end if method
}//end of class
