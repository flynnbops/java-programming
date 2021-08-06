package chapter3;

import java.util.Scanner;

/**
 * 3D
 * Based on the score provided assign a Letter grade
 */
public class TestResults {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double score;
        char grade;

        System.out.println("Please provide the test score.");
        score = scanner.nextDouble();
        scanner.close();

        if(score<60) {
            grade = 'F';
        }
        else if (score<70){
            grade = 'D';
        }
        else if (score<80){
            grade = 'C';
        }
        else if (score<90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("The test grade is: " +grade);
    }
}
