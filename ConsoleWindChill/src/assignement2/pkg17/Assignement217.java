package assignement2.pkg17;

import java.util.Scanner;

/**
 *
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
public class Assignement217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double winds; //declare wind speed
        double windc; //declare wind chill
        double temp;  //declare temperature
        
        //Call to Scanner
        Scanner input = new Scanner(System.in);
        //get the Temperature        
        System.out.print("Enter the Temperature in Fahrenheit: "); 
        temp = input.nextDouble(); 
        //get the wind speed
        System.out.print("Enter the wind speed in mph: "); 
        winds= input.nextDouble(); 
        //calculate and output wind chill
        windc = (35.74+0.6215*temp-35.75*(Math.pow(winds, 0.16))+0.4275*temp*(Math.pow(winds, 0.16))); 
        System.out.println("The wind chill index is "+windc); 
    }
}
