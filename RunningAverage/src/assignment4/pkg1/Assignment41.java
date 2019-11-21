package assignment4.pkg1;

/**
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
import java.util.Scanner;
public class Assignment41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call to Scanner
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        int i = 1, pos = 0, neg = 0, total = 0, count = 0;
        double avg = 0.0;
        
        //Promt message
        System.out.println("Enter an interger, the input ends if it is 0: ");
            
        //Get first input from user
        i = input.nextInt();
        
        //Main loop
        while (i != 0){
            
            //Add 1 to count for average calculation
            count++;
            
            //Count the amount of positive and negative numbers entered
            if (i < 0){
                neg++;                
            }
            else if (i > 0){
                pos++;
            }

            //Calculate total
            total = total + i;

            
            //Promt message
            System.out.println("Enter an interger, the input ends if it is 0: ");
            
            //Get input from user
            i = input.nextInt();
            
        }
        
        //Calculate average using 1d* to return a floating point number
        avg = 1d* total / count;
        
        //Output messages with calculated statistics
        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);
        System.out.println("The total is " + total);
        System.out.println("The average is " + avg);
    }
}
