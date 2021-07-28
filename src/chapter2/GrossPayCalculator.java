package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        // Setup scanner and variables
        Scanner scanner = new Scanner(System.in);
        double hoursWorked, hourlyRate, grossPay;

        // Get hours worked
        System.out.println("Enter the numbers of hours worked");
        hoursWorked = scanner.nextDouble();

        // Get hourly rate
        System.out.println("Enter the hourly rate £");
        hourlyRate = scanner.nextDouble();

        scanner.close();

        // Calculate gross pay
        grossPay = hoursWorked*hourlyRate;

        // Return gross pay
        System.out.println("The Gross pay is: £" + grossPay);
    }
}
