package assignment.pkg6.pkg23;

/**
 * @author Daniel Baumann
 * ID:112870711
 * Sect Number: 10
 */
public class Assignment623 {

    public static void main(String[] args) {
        //declare boolean variable for lockers
        Boolean[] L = new Boolean[100];
        //set each locker to false or closed
        for (int i = 0; i < 100; i++){
            L[i] = false;
        }
        //loop for students that are opening or closing lockers
        for (int S = 1; S < 101; S++){
            for (int i = S; i < 101; i += S){
                //conditional statement to determine whether lockers should be opened or closed
                if (L[i - 1] == true){
                    L[i - 1] = false;                       
                }
                else {
                      L[i - 1] = true;
                }
            }
        }
        //Show the state of each locker after all students are done
        for (int i = 0; i < 100; i++){
            //conditional statement which determines open or closed state of locker (true = open, false = closed)
            if (L[i] == true){
                System.out.println("Locker number " + (i + 1) + " is open.");
            }
            else{
                System.out.println("Locker number " + (i + 1) + " is closed.");
            }
        }

    }
}