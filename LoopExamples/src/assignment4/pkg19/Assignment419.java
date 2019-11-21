/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4.pkg19;

/**
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
public class Assignment419 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{

    for (int line=0;line<8;line++){//for all the lines
        for (int space=8-line;space>0;space--)
            {
                System.out.print("    ");//print the appropriate spaces
            }
            int i=1;//start with 1
        for(int p2 = 0;p2<line;p2++)//do multiplication for the number of lines
            {
                if (i < 10){
                    System.out.print(i+"   ");//print the number with 3 space
                }
                else if (i > 9 && i < 99){
                    System.out.print(i+"  ");//print the number with 2 space
                }
                else if (i > 99){
                    System.out.print(i+" ");//print the number with 1 space
                }
                i *= 2;//multiply by 2
             }
        while(i>0)//while its greater than 0
            {
                if (i<10){
                    System.out.print(i+"   ");//print the number with 3 spaces
                }
                else if (i > 9 && i < 99){
                    System.out.print(i+"  ");//print the number with 2 spaces
                }
                else if (i > 99){
                    System.out.print(i+" ");//print the number with 1 space
                }
                i/=2;//divide by 2
             }
        System.out.println();//new line
        }
}

}
