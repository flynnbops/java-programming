package chapter4;

import java.util.Scanner;

public class AverageTestScore {
    /*
    4D
    Nested Loop: Count controlled loop. Runs X number of times. Condition tested before entering the loop.
    Good to use if the loop may or may not execute.
    Scan given number of items and total cost
    */
    public static void main(String[] args){
        // The known things
        int numberOfStudents = 2;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<numberOfStudents;i++){
            double total = 0;
            System.out.println("-- Student-- "+ (i+1));
            for(int j=0;j<numberOfTests;j++){
                System.out.println("Enter the score for Test#"+ (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total /numberOfTests;
            System.out.println("The average test score for student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
