package assignment5.pkg31;
//import scanner for input function
import java.util.Scanner;
/**
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
public class Assignment531 {
    public static void main(String[] args) {
        //assign scanner to "input"
        Scanner input = new Scanner(System.in);
        //declare card as long variable
        long card;
        //promt user to input card number and get the number
        System.out.println("Enter a credit card number as a long integer:");
        card = input.nextLong();
        //test the validity of the card number and output results
        if (isValid(card) == true){
            System.out.println(card + " is valid.");
        }
        else{
            System.out.println(card + " is invalid.");
        }
    }
    public static boolean isValid(long number){
        //find out if there are enough digits, if the odd and even sums are divisible by 10, and check the card prefix
        if ((getSize(number) > 12) && (getSize(number) < 17)){
            if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0){
                if ((getPrefix(number, 1) == 4) || (getPrefix(number, 1) == 5) || (getPrefix(number, 1) == 6) || (getPrefix(number, 2) == 37)){
                    return true;
                }
            }
        }
        //Anything else is invalid
        return false;
    }
    public static int sumOfDoubleEvenPlace(long number){
        //Calculate sum of even digits from right to left
        int evenSum = 0;
        for (int a = 0; a < 8; a++){
            number /= 10;
            evenSum += getDigit((int)(number % 10) * 2);            
            number /= 10;
        }
        return evenSum;
    }
    public static int getDigit(int number){
        //returns the modified digit
        return (int)((number % 10) + (number / 10));
    }
    public static int sumOfOddPlace(long number){
        //Calculate sum of odd digits from right to left
        int oddSum = 0;
        for (int a = 0; a < 8; a++){
            oddSum += getDigit((int)(number % 10));
            number /= 10;
            number /= 10;
        }
        return oddSum;
    }
    public static int getSize(long d){
        //return the length of card number
        return String.valueOf(d).length();
    }
    public static long getPrefix(long number, int k){
        //return selected number(k) of digits starting from left to right
        while (number > 10 * k) {
            number /= 10;
        }
        return number;        
    }
}
