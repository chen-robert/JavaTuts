
/**
 * The purpose of this program is to create a graph from a survey comparing programming languages
 *
 * @author Brendon Ho
 * @version 7/21/17
 */
import java.awt.*;

//start of tester class
class Survey
{//start of class
    
    //for creation of the bars on the graph
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
    
    //convert string into chrome data
    public int convertStringToInt(String stringOfDigits)
    {//start of user-defined method 2
        int number = 0;                                         //declare and initialize the number variable
        int total = 0;                                          //declare and initialize the total variable
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 0; n < stringOfDigits.length() ; n+=2)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n, n+2);       //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer
            total += number;                                     //accumulate the total
        }//end of loop
        
        return total;                                           //return the total calculated
        
    }//end of user-defined method 2
}//end of class

//start of public class
public class SurveyTester
{//start of class
    public static void main(String[] args)
    {//start of main method
        //set up the world and environment
        World worldObj = new World();
        Picture graph = new Picture("Graph.jpg");
        worldObj.setPicture(graph);
        Turtle b = new Turtle(0, 0, worldObj);
        
        Survey surv = new Survey();//object of type survey
        
        //assign the values to a string
        String swiftPpl = "03";
        String javaPpl = "06";
        String pythonPpl = "01";
        
        //convert strings to numbers
        int convertSwift = surv.convertStringToInt(swiftPpl);
        int convertJava = surv.convertStringToInt(javaPpl);
        int convertPython = surv.convertStringToInt(pythonPpl);
        
        
        //bars for the graph
        surv.bar(b, 105, 105, 370, (370 - (convertSwift * 30)), Color.ORANGE);
        surv.bar(b, 205, 205, 370, (370 - (convertJava * 30)), Color.BLACK);
        surv.bar(b, 305, 305, 370, (370 - (convertPython * 30)), Color.BLUE);
        
        
        //print information to screen
        System.out.println(worldObj);
        System.out.println("# of people who chose Swift: " + convertSwift);
        System.out.println("# of people who chose Java: " + convertJava);
        System.out.println("# of people who chose Python: " + convertPython);
        
        
    }//end of main method
}//end of class
