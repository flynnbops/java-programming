package chapter3;


import java.util.Scanner;

/**
 * 3C - Nested Ifs
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args){

        // Knowns
        int requiredYearsEmployed = 2;
        int requiredSalary = 30000;
        int yearsEmployed,salary;

        Scanner scanner = new Scanner(System.in);

        // Unknowns
        System.out.println("What is your salary?");
        salary = scanner.nextInt();

        System.out.println("How many full years have you worked in your current job?");
        yearsEmployed = scanner.nextInt();

        // Decision
        if (salary >= requiredSalary){
            if(yearsEmployed>=requiredYearsEmployed)
                System.out.println("You are eligible for a loan");
            else{
                System.out.println("You are not eligible for a loan");
                System.out.println("You have not been employed long enough");
            }
        }
        else{
            System.out.println("You are not eligible for a loan");
            System.out.println("Your salary is not high enough");
        }

    }
}
