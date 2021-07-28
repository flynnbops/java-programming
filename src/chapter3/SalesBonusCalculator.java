package chapter3;

import java.util.Scanner;

/**
 * Program to calculate if a sales bonus should be awarded
 */
public class SalesBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bonusAmount = 250;
        int requiredSales = 10;
        int actualSales;
        int salary =1000;

        System.out.println("How many sales were made this week?");
        actualSales = scanner.nextInt();
        scanner.close();

        if (actualSales >= requiredSales) {
            System.out.println("You have earned a bonus of: £" + bonusAmount);
            System.out.println("You will receive: £" + (bonusAmount+salary));
        }
        else {
            System.out.println("You have not earned a bonus.");
            System.out.println("You need to make at least "+requiredSales+" sales a week to qualify.");
        }
    }
}
