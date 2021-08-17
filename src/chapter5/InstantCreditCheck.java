package chapter5;

import java.util.Scanner;

/*
5B
Auto approve loan if credit score is 700 or better. And they earn 25,000 or more
 */
public class InstantCreditCheck {
    static int requiredCreditScore = 700;
    static int requiredSalary = 25000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Check
        boolean qualified = isUserQualified(getSalary(), getCreditScore());
        notify(qualified);
        scanner.close();
    }


    private static void notify(boolean isQualified){
        if(isQualified) {
            System.out.println("You have been approved");
        }
        else {
            System.out.println("You have been denied");
        }
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        return creditScore >= requiredCreditScore || salary >= requiredSalary;
    }

    public static double getSalary() {
        System.out.println("Please enter your Salary");
        return scanner.nextDouble();
    }
    public static int getCreditScore() {
        System.out.println("Please enter your Credit Score");
        return scanner.nextInt();
    }

}
