
/**
 * A new graph with more data I created in module 07.01 in line plot form.
 *
 * @author Brendon Ho
 * @version 7/16/17
 */
import java.awt.*;

//start of tester class
class Survey
{//start of class
    
    //for creation of the bars on the graph
    public static void plot(Turtle myrtle, int x1, int y1){
        //myrtle properties
        
        myrtle.moveTo(x1,y1);

    }//end o fmethod
    
    //convert string into chrome data
    public int place(String stringOfDigits)
    {//start of user-defined method 2
       
        int number = 0;                                         //declare and initialize the number variable
                   
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 0; n < stringOfDigits.length() ; n+=2)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n, n+2);       //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer   
            
            //accumulate the total
        }//end of loop
        
        return number * 10;                                           //return the total calculated
        
    }//end of user-defined method 2
}//end of class


public class ModuleProject {
    public static void main(String[] args){
        World worldObj = new World();
        Picture graph = new Picture("Graph.jpg");
        worldObj.setPicture(graph);
        Turtle b = new Turtle(90, 400, worldObj);
        
        Survey surv = new Survey();//object of type survey
        
        //assign the values to a string
        String literal = "30";
        
        int convertSwift = surv.place(literal);
        
        System.out.println(convertSwift);
        
        surv.plot(b, 130, convertSwift);
        surv.plot(b, 205, convertSwift - 30);
        surv.plot(b, 280, convertSwift + 20);
        surv.plot(b, 355, convertSwift - 150);
        surv.plot(b, 430, convertSwift + 50);
        
        
    }//end of method
}//end of class