package chapter3;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ChangeForDollarGame {

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int pennyValue=1;
        int nickelValue=5;
        int dimeValue=10;
        int quarterValue=25;
        int dollarValue=100;
        int pennies, nickels, dimes, quarters, total;

        // Get input
        System.out.println("The aim of the game is to make 1 US Dollar...");
        System.out.println("How many pennies?");
        pennies = scanner.nextInt();
        System.out.println("How many nickels?");
        nickels = scanner.nextInt();
        System.out.println("How many dimes?");
        dimes = scanner.nextInt();
        System.out.println("How many quarters?");
        quarters = scanner.nextInt();
        scanner.close();

        total = (pennies*pennyValue) + (dimes*dimeValue) + (nickels*nickelValue) + (quarters*quarterValue);

        if(total == dollarValue){
            System.out.println("You win! You made a dollar exactly!");
        }
        else if (total > dollarValue){
            System.out.println("Unlucky you went over a dollar");
            System.out.println("You are " + (total - dollarValue)+ " cent over a dollar.");
        }
        else{
            System.out.println("Unlucky you are under a dollar");
            System.out.println("You are " + (dollarValue - total)+ " cent under a dollar.");
        }
    }
}
