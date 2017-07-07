//import Scanner
import java.util.Scanner;
/**
 * This is my final module project in MadLib form.
 *
 * @author (Brendon Ho)
 * @version (7/6/17)
 */

/**
 * Psudocode:
 * This project goes as the following. Make an input statement.
 * (All the users input should be stored in a variable so they can be used later)
 * Make the first prompt a noun ask for the users input.
 * Make the next prompt a verb and ask for users input.
 * Make the next prompt an adjective and ask for users input.
 * Make the next prompt a noun and ask for users input.
 * Make the next prompt a verb and ask for users input.
 * Make the next prompt an adverb and ask for users input.
 * Make the next prompt a verb and ask for users input.
 * Make a story but some space for the variables. Make sure to space appropriately.
 */
public class MadLib
{
    public static void main(String[] args){
        //Scanner initialized
        Scanner in = new Scanner(System.in);
        
        //First Prompt
        System.out.println("Noun");
        String noun1 = in.nextLine();
        
        //Second Prompt
        System.out.println("Verb");
        String verb1 = in.nextLine();
        
        //Third Prompt
        System.out.println("Adjective");
        String adj1 = in.nextLine();
        
        //Fourth Prompt
        System.out.println("Noun");
        String noun2 = in.nextLine();
        
        //Fifth Prompt
        System.out.println("Verb");
        String verb2 = in.nextLine();
        
        //Sixth Prompt
        System.out.println("Adverb");
        String adv1 = in.nextLine();
        
        //Seventh Prompt
        System.out.println("Verb");
        String verb3 = in.nextLine();
        
        
        
        //Final Text
        System.out.println("A " + noun1 + " " + verb1 + " up a very " + adj1 + " mountain.");
        System.out.println("But as " + noun1 + " was going up, " + noun1 + " saw a " + noun2);
        System.out.println(noun1 + " got scared of " + noun2 + " and " + verb2 + " " + noun2);
        System.out.println(noun1 + " " + adv1 + " ran down the " + adj1 + " mountain and " + verb3);
    }//end of method main
}//end of class MadLib
