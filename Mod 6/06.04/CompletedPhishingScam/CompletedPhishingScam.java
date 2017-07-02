
/**
 * Working with strings and methods. This program completes the phishing scam letter
 *
 * @author Brendon Ho
 * @version 7/1/17
 */
public class CompletedPhishingScam
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        String inst = "Rob Enterprise";
        
        String recname = "Branjo Cho";
        
        String sendname = "Prap Shnap";
        
        String date = "6/1/17";
        
        double amount = 356.23;
        
        String site = "www.robenterprise.com";
        
        String line0 = inst;
        
        String line1 = "To: "+ recname;
        
        String line2 = "From: " + sendname;        
        
        String line3 = "Date: " + date;

        String line4 = "Dear Mr. " + recname.substring(7,10);

        String line5 = "On " + date.substring(0,3) + " we noticed a suspicious withdrawal of $" + amount + " \nfrom your checking account.";

        String line6 = "If this information is not correct, someone \nunknown to you may have access to your account!";
        
        String line7 = "For your safety, please visit " + site + " to \nverify your personal information.";
        
        String line8 = recname.substring(0,6) + ", once you have done this, our fraud \ndepartment will work to resolve this discrepancy.";  
        
        String line9 = "Thank you,";
        
        String line10 = sendname;

        

        System.out.println(line0);
        System.out.println();
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();
        System.out.println(line4);
        System.out.println();
        System.out.println(line5);
        System.out.println();
        System.out.println(line6.toUpperCase());
        System.out.println();
        System.out.println(line7);
        System.out.println();
        System.out.println(line8);
        System.out.println();
        System.out.println(line9);

        System.out.println(line10);
    }
}
