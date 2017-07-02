
/**
 * The purpose is to help me understand Scanner to write a program for movie tickets for the user.
 *
 * @author Brendon Ho
 * @version 7/2/17
 */
//import
import java.util.Scanner;

public class MovieTickets
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //Scanner and output so the user can feed information
        Scanner in = new Scanner(System.in);
        System.out.println("What Movie do you wanna see?");
        String movieInput = in.nextLine();
        System.out.println("What is you debit card? (#####-###-####)");
        String debInput = in.next();
        System.out.println("What is you PIN (####)?");
        String pinInput = in.next();
        System.out.println("How many tickets do you wanna buy?");
        //ints and doubles need type casting
        int tickInput = in.nextInt();
        System.out.println("What is the price of the tickets?");
        double priceInput = in.nextDouble();
        
        //calculating the total price
        double calc = tickInput * priceInput;
        
        //Strings for the output
        String line1 = "Your reciept: \nAccount: #####-###-"+debInput.substring(10,14);
        String line2 = "Movie: " + movieInput;
        String line3 = "Number of Tickets: " + tickInput;
        String line4 = "Ticket Price: $" + calc;
        String line5 = "$" + calc + " will be debited to you account.";
        String line6 = "Thank you and I hope you enjoy your movie";
        //Print the line1-6 strings onto the console
        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6);
    }
}
