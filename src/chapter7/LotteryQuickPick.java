package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryQuickPick {
    private static int LENGTH= 6;
    private static int MAX_TICKET_NUMBER= 69;

    public static void main(String[] args){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0;i < LENGTH; i++){
            int randomNumber;

            // Check for Duplicate lottery numbers
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket,randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search of an array to find the provided value
     * @param array The array we want to search against
     * @param searchTerm The value we are searching for
     * @return True if found. False if not
     */
    public static boolean search(int[] array, int searchValue){

        // Enhanced loop. Iterate over array, assigning current element to "value"
        for(int value : array){
            if(value == searchValue){
                return true;
            }
        }

        // If we made it here we've got through the whole array without finding it
        return false;
    }

    public static void printTicket(int[] ticket){
       Arrays.sort(ticket);

        /* Basic For loop
        for(int i=0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
        */

        // Enhanced for loop
        for(int number : ticket){
            System.out.print(number + " | ");
        }
    }

    /**
     * Perform a binary search on the array to find a value. Created for demo purposes.
     * @param array The array we want to search against
     * @param searchValue The value we are searching for
     * @return True if found. False if not
     */
    public static boolean binarySearch(int[] array, int searchValue){

        // Sort the array so we can perform a binary search
        Arrays.sort(array);

        int index = Arrays.binarySearch(array,searchValue);

        // Search returns the array index if value is found.
        if(index >= 0){
            return true;
        }
        else return false;
    }
}
