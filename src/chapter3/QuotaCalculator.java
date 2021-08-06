package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Knowns
        int quota = 10;

        // Unknowns
        int actualSales;

        System.out.println("How many sales did you make this week?");
        actualSales = scanner.nextInt();
        scanner.close();
        System.out.println("Thanks, you made " + actualSales + " sale(s) this week.");

        // Make decision
        if (actualSales>=quota) {
            System.out.println("Congratulations you hit your weekly quota.");
        }
        else{
            int requiredSales = quota - actualSales;
            System.out.println("Sorry, you have not hit your weekly quota.");
            System.out.println("You need " + requiredSales + " more sales.");
        }



    }
}
