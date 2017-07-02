
/**
 * To process, calculate and present data for two different cars.
 *
 * @author (Brendon Ho)
 * @version (6/28/17)
 */
public class VehicleComparison
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //Data for the Civic
        String Model = "Honda Civic";
        double FuelPrice = 2.04;
        int MonthlyMiles = 1123;
        double MPG = 12.0;
        double MonthlyGallons = MonthlyMiles / MPG;
        double Cost = MonthlyGallons * FuelPrice;
        //Data for the tesla
        String ModelTwo = "Tesla";
        double FuelPriceTwo = 2.05;
        int MonthlyMilesTwo = 975;
        double MPGTwo = 17;
        double MonthlyGallonsTwo = MonthlyMilesTwo / MPGTwo;
        double CostTwo = MonthlyGallonsTwo * FuelPrice;
        //The cost difference
        double diff = Cost - CostTwo;
        //Stuff going into the console
        System.out.println("Model" + " " + "MPG" + " " + "Monthly-Miles" + " " + "Monthly-Gallons" + " " + "Cost");
        System.out.println("========================================");
        System.out.println(Model + " " + MPG + " " + MonthlyMiles + " " + MonthlyGallons + " " + Cost);
        System.out.println(ModelTwo + " " + MPGTwo + " " + MonthlyMilesTwo + " " + MonthlyGallonsTwo + " " + CostTwo);
        System.out.println("");
        System.out.println("Cost Difference: $ " + diff);
    }//end of main method
}//end of Class
