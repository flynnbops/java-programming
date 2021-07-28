package archive.chapter3;

/*
All salespeople get $1000 week
Those that exceed 10 sales in the week get a $250 bonus
Those that are short, are informed how many sales they fall short
Using an else-if statement
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Set known value, quota
        int quota = 10;

        // Get number of sales this week
        System.out.println("How many sales did the person get this week?");
        int sales = scanner.nextInt();
        scanner.close();

        // Check if bonus is applicable
        if (sales >= quota){
            System.out.println("You have achieved enough sales this week for your bonus!");
        }
        else{
            int sales_outstanding = quota - sales;
            System.out.println("You have not achieved enough sales this week for your bonus!");
            System.out.println("You are short by " + sales_outstanding + " sales.");
        }
    }
}
