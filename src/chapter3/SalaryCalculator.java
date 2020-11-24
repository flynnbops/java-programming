package chapter3;

/*
All salespeople get $1000 week
Those that exceed 10 sales in the week get a $250 bonus
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Set known values, base salary
        int Salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get number of sales this week
        System.out.println("How many sales did the person get this week?");
        int sales = scanner.nextInt();
        scanner.close();

        // Check if bonus is applicable
        if (sales > quota){
            Salary = Salary + bonus;
        }

        System.out.println("The weekly salary is: $" + Salary);
    }
}
