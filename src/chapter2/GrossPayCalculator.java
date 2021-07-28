package chapter2;

import java.util.Scanner;

/**
 * Simple program to calculate Gross pay
 */
public class GrossPayCalculator {

    public static void main(String[] args){
        // Setup scanner and variables
        Scanner scanner = new Scanner(System.in);
        double hoursWorked, hourlyRate;

        // Get hours worked
        System.out.println("Enter the numbers of hours worked");
        hoursWorked = scanner.nextDouble();

        // Get hourly rate
        System.out.println("Enter the hourly rate £");
        hourlyRate = scanner.nextDouble();

        scanner.close();

        // Return gross pay
        System.out.println("The Gross pay is: £" + grossPay(hoursWorked, hourlyRate));
    }

    /**
     * Calculates gross pay.
     * @param hoursWorked How many hours worked
     * @param hourlyRate How much they get paid an hour
     * @return Gross pay
     */
    public static double grossPay(double hoursWorked,double hourlyRate){
        return hoursWorked*hourlyRate;
    }
}
