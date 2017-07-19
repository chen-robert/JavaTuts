
/**
 * The purpose of this program is to create a graph from a survey that I had given to people
 *
 * @author (Andrew Xia)
 * @version (07/18/2017)
 */
import java.awt.*;

//start of tester class
class Survey
{//start of class
    
    //for creation of the bars on the graph
    public static void barGraph(Turtle turt, Color color, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {//start of user-defined method 1
        //turtle set up
        turt.hide();
        turt.penUp();
        turt.setPenWidth(1);
        turt.setPenColor(color);
        
        //turtle drawing
        turt.moveTo(x1, y1);
        turt.penDown();
        turt.moveTo(x2, y2);
        turt.moveTo(x3, y3);
        turt.moveTo(x4, y4);
        
        
    }//end of user-defined method 1
    
    //convert string into chrome data
    public int convertStringToInt1(String stringOfDigits)
    {//start of user-defined method 2
        int number = 0;                                         //declare and initialize the number variable
        int total = 0;                                          //declare and initialize the total variable
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 7; n < stringOfDigits.length() ; n++)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n-7, n-5);       //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer
            total = number;                                     //accumulate the total
        }//end of loop
        
        return total;                                           //return the total calculated
        
    }//end of user-defined method 2
    
    //convert string into internet explorer data
    public int convertStringToInt2(String stringOfDigits)
    {//start of user-defined method 3
        int number = 0;                                         //declare and initialize the number variable
        int total = 0;                                          //declare and initialize the total variable
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 7; n < stringOfDigits.length() ; n++)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n-4, n-3);       //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer
            total = number;                                     //accumulate the total
        }//end of loop
        
        return total;                                           //return the total calculated
        
    }//end of user-defined method 3
    
    //convert string into safari data
    public int convertStringToInt3(String stringOfDigits)
    {//start of user-defined method 4
        int number = 0;                                         //declare and initialize the number variable
        int total = 0;                                          //declare and initialize the total variable
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 7; n < stringOfDigits.length() ; n++)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n-2, n-1);       //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer
            total = number;                                     //accumulate the total
        }//end of loop
        
        return total;                                           //return the total calculated
        
    }//end of user-defined method 4
    
    //convert string into firefox data
    public int convertStringToInt4(String stringOfDigits)
    {//start of user-defined method 5
        int number = 0;                                         //declare and initialize the number variable
        int total = 0;                                          //declare and initialize the total variable
        String subData = "";                                    //declare and initialize the subData variable
        
        for(int n = 7; n < stringOfDigits.length() ; n++)       //traverse the length of the loop by increments of 2
        {//start of loop
            subData = stringOfDigits.substring(n, n+1);         //pick out the substrings of 2 digit numbers
            number = Integer.parseInt(subData);                 //parse a string to an integer
            total = number;                                     //accumulate the total
        }//end of loop
        
        return total;                                           //return the total calculated
        
    }//end of user-defined method 5
}//end of class

//start of public class
public class SurveyTester
{//start of class
    public static void main(String[] args)
    {//start of main method
        //set up the world and environment
        World worldObj = new World();
        Picture graph = new Picture("Graph.png");
        worldObj.setPicture(graph);
        Turtle barMaker = new Turtle(0, 0, worldObj);
        
        Survey survey = new Survey();//object of type survey
        
        //bars for the graph
        survey.barGraph(barMaker, Color.GREEN, 230, 413, 230, 156, 250, 156, 250, 413);
        survey.barGraph(barMaker, Color.ORANGE, 274, 413, 274, 357, 294, 357, 294, 413);
        survey.barGraph(barMaker, Color.BLUE, 322, 413, 322, 300, 342, 300, 342, 413);
        survey.barGraph(barMaker, Color.PINK, 386, 413, 386, 300, 406, 300, 406, 413);
        
        //assign the values to a string
        String data = "05010202";
        
        //convert strings to numbers
        int chromeValue = survey.convertStringToInt1(data);
        int ieValue = survey.convertStringToInt2(data);
        int safariValue = survey.convertStringToInt3(data);
        int firefoxValue = survey.convertStringToInt4(data);
        
        //print information to screen
        System.out.println(worldObj);
        System.out.println("# of people who chose Chrome: " + chromeValue);
        System.out.println("# of people who chose Internet Explorer: " + ieValue);
        System.out.println("# of people who chose Safari: " + safariValue);
        System.out.println("# of people who chose Firefox: " + firefoxValue);
        
        
    }//end of main method
}//end of class
