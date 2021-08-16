package chapter4;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class addNumbers {
    /*
    4B
    Do While Loop: Condition controlled loop. Condition tested after entering the loop.
    Good to use if the loop may or may not execute.

    Enter 2 numbers and sum them.
    Followed by prompt to enter another
    */
    public static void main(String[] args){
        boolean again;
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum;

        do{
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();

            sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Do you want to do another calculation? true or false");
            again =  scanner.nextBoolean();
        } while(again);

        scanner.close();
    }
}
