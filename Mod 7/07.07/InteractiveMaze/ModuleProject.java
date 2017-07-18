
/**
 * An interactive version of the maze I created in module 07.01.
 *
 * @author Brendon Ho
 * @version 7/16/17
 */
import java.awt.*;
import java.util.Scanner;

public class ModuleProject {

    public static void main(String[] args){
        
        //Scanner initiation
        Scanner in = new Scanner(System.in);
        
        //World initiation
        World worldObj = new World();
        Picture pictureObj = new Picture("Maze_Background.png");
        worldObj.setPicture(pictureObj);
        
        //Turtle attributes
        Turtle myrtle = new Turtle(91,139,worldObj);
        myrtle.setHeight(12);                                       //set myrtle's height at 12 pixels
        myrtle.setWidth(12);                                        //set myrtle's width at 12 pixels
        myrtle.setHeading(90);                                      //set myrtle's heading to due East (90 degrees)
        myrtle.show();                                              //show the Turtle object
        
        //interactive program
        System.out.println("How far do you want to move up? (145)");
        int up1 = in.nextInt();
        myrtle.forward(up1);
        myrtle.turnRight(); 

        System.out.println("How far do you want to move up? (50)");
        int up2 = in.nextInt();
        myrtle.forward(up2);
        myrtle.turnLeft();

        System.out.println("How far do you want to move up? (265)");
        int up3 = in.nextInt();
        myrtle.forward(up3);

        System.out.println("How much would you like to turn? (152)");
        int angle1 = in.nextInt();
        myrtle.turn(angle1);

        System.out.println("How far do you want to move up? (163)");
        int up4 = in.nextInt();
        myrtle.forward(up4);

        System.out.println("How much would you like to turn? (-62)");
        int angle2 = in.nextInt();
        myrtle.turn(angle2);

        System.out.println("How far do you want to move up? (105)");
        int up5 = in.nextInt();
        myrtle.forward(up5);

        System.out.println("Which way do you want to turn (right)");
        String dir1 = in.nextLine();
        System.out.println(dir1);
        myrtle.turnRight();

        System.out.println("How far do you want to move up? (200)");
        int up6 = in.nextInt();
        myrtle.forward(up6);

        System.out.println("Your name:");
        String name = in.nextLine();
        System.out.println(name + ", you have finished the maze. Congrats!!");
    }//end of method

}//end of class