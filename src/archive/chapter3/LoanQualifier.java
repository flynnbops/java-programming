package archive.chapter3;

/*
Nested IFs:
To qualify for a loan, a person must make at least £30,000
And have been working at their current job for at least 2 years
 */


import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


        // 1. Get Salary
        System.out.println("Enter your salary.");
        Scanner scanner = new Scanner(System.in);
        double actualSalary = scanner.nextDouble();

        // 2. Get Years in current job
        System.out.println("Enter your how many years you have been in your current job.");
        double actualYearsEmployed = scanner.nextDouble();
        scanner.close();

        // Check salary is high enough
        if (actualSalary >= requiredSalary) {
            // Check they have worked in the current job long enough
            if (actualYearsEmployed >= requiredYearsEmployed) {
                System.out.println("Qualified for loan");
            } else {
                System.out.println("You have not Qualified for a loan");
                System.out.println("You have not worked in your current job "
                        + requiredYearsEmployed + " years");
            }
        }
        else{
            System.out.println("You have not Qualified for a loan");
            System.out.println("You do not earn £" + requiredSalary);
            }
        }
}
