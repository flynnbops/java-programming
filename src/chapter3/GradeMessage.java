package chapter3;

import java.util.Scanner;

/**
 * 3E Switch statement
 * Get letter grade and print a message
 */
public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade, message;

        System.out.println("Please provide the test score.");
        grade = scanner.next();
        scanner.close();

        switch (grade){
            case "A":
                message = "Great job";
                break;
            case "B":
                message = "Good work";
                break;
            case "C":
                message = "Keep going!";
                break;
            case "D":
                message = "Keep working hard.";
                break;
            case "F":
                message = "Time to study.";
                break;
            default:
                message = "Error invalid grade";
                break;
        }
        System.out.println(message);
    }
}
