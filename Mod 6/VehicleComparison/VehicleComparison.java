
/**
 * Write a description of class ProcessingNumbers here.
 *
 * @author (Brendon Ho)
 * @version (6/28/17)
 */
public class VehicleComparison
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        String Model = "Honda Civic";
        Double FuelPrice = 2.04;
        int MonthlyMiles = 1123;
        int MonthlyGallons = 92;
        int MPG = MonthlyMiles/MonthlyGallons;
        Double Cost = MPG * FuelPrice;
        
        System.out.println(Model + " " + MPG + " " + MonthlyMiles + " " + MonthlyGallons + " " + Cost);
    }//end of main method
}//end of VehicleComparison
