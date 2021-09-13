
/**
 * This class has a method for converting currency.
 *
 * @author Mr. King
 * @version 9/13/2021
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Print welcome message (1 line)
        System.out.println("This program converts currency.");

        // Prompt for input of USD (1 line)
        System.out.print("Enter a value in US Dollars: ");
        
        // Take input for USD (1 line)
        double usd = in.nextDouble();
        
        // Convert USD to DOGE by calling method and 
        // storing value in a variable (1 line)
        double doge = usdToDoge(usd);
        
        // Print the result (1 line)
        System.out.println(usd + " USD is equivalent to " + doge + " DOGE.");
    }
    
    /**
     * Converts USD to Dogecoin. Note: 1 USD = 3.8983 DOGE
     * 
     * @param  usd  the amount of US Dollars to be converted.
     * @return      the amount of Dogecoin converted from argument. 
     */
    public static double usdToDoge(double us)
    {
        double dogeCoin = us * 3.8983;
        return dogeCoin;
    }
}
