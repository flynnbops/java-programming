package chapter5;

import java.util.Scanner;

/*
Exercise at end of 5B
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 */
public class PhoneBillCalculator {

    static double overageMinuteCost = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get plan fee
        double planFee = getPlanFee();

        // Get overage minutes
        double overageCost = calculateOverageFee(getOverageMinutes());

        // Calculate tax
        double tax = calculateTax(planFee + overageCost, taxRate);

        // Calculate total cost
        double total = planFee + overageCost + tax;

        // Return itemised bill
        showBill( planFee,overageCost, tax);

        scanner.close();
    }

    public static double getPlanFee(){
        System.out.println("Please enter your plan fee.");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes(){
        System.out.println("Please enter your overage minutes.");
        return scanner.nextInt();
    }

    public static double calculateOverageFee(int minutes){
        return minutes * overageMinuteCost;
    }

    public static double calculateTax(double amount, double taxRate){
        return Math.ceil(amount * taxRate);
    }

    public static void showBill(double fee, double overage, double tax){
        System.out.println("Phone bill statement");
        System.out.println("Plan: £" + String.format("%.2f", fee));
        System.out.println("Overage: £" + String.format("%.2f", overage));
        System.out.println("Tax: £" + String.format("%.2f", tax));
        System.out.println("Total: £" + String.format("%.2f", (fee + overage + tax)));
    }
}
