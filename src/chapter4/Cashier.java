package chapter4;

import java.util.Scanner;

public class Cashier {
    /*
    4C
    For Loop: Count controlled loop. Runs X number of times. Condition tested before entering the loop.
    Good to use if the loop may or may not execute.
    Scan given number of items and total cost
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int quantity;

        System.out.println("How many items do you want to scan?");
        quantity =  scanner.nextInt();

        for(int i =0; i<quantity; i++){
          System.out.println("How much is the item?");
          double price = scanner.nextDouble();
          total = total + price;
        }

        scanner.close();
        System.out.println("Your total is:£" + total);
    }
}
