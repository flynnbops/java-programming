package chapter4;

/* Exercise at end of 4D
    The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */

import java.util.Random;

public class RollDiceGame {

    public static void main(String[] args){
        int maxDiceRolls = 5;
        int totalSpaces = 20;
        int currentSpace = 0;
        int die;
        Random random = new Random();

        // Dice rolls : For loop
        for(int i=1;i<=maxDiceRolls; i++){
            System.out.println("Turn #" + i);
            // Roll die
            die = random.nextInt(6) + 1;
            System.out.println("You rolled a " + die);

            // Update score
            currentSpace = currentSpace + die;
            System.out.println("Your are currently on space: " + currentSpace);

            // Check for victory conditions
            if(currentSpace == totalSpaces) {
                System.out.println("You win!");
                break;
            }
            else if(currentSpace > totalSpaces){
                System.out.println("You've gone over " + totalSpaces + " spaces! You lose");
                break;
                }
            else{
                System.out.println("You've not reached " + totalSpaces + " yet.");
            }

            // Check they are out of dice rolls. Can get to 20 on the last roll.
            if( i == maxDiceRolls) {
                System.out.println("You've ran out of dice roles. Better luck next time!");
            }
        }
    }
}
