package chapter2;

import java.util.Scanner;

/*
Calculates gross pay
Asking for; number of hours, hourly rate
 */
public class GrossPayCalculator {
    public static void main(String[] args){

        // 1. Get number of hours worked
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Get hourly rate
        System.out.println("Enter your hourly rate in £");
        double pay = scanner.nextDouble();

        // 3. Multiply 1 by 2
        double grossPay = hours * pay;

        // 4. Display the result
        scanner.close();
        System.out.println("Your gross pay is calculated as: £" + grossPay);
    }
}
