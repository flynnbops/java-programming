package chapter4;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class GrossPayInputValidation {

    /*
    4A
    While Loop: Condition controlled loop. Condition tested before entering the loop.
    Good to use if the loop may or may not execute.

    Calculate pay but do not allow overtime
    Rate is £15 an hour
     */
    public static void main(String[] args){
        // Knows
         int rate = 15;
         int maxHours = 40;

         // Get the unknowns
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week");
        double hoursWorked =  scanner.nextDouble();

        // Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid hours worked must be less than 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        //Return value
        double gross = rate * hoursWorked;
        System.out.println("The gross pay is:£" + gross);
        scanner.close();
    }
}
