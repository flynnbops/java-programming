package chapter2;

import java.util.Scanner;

/**
 * Simple program to generate a MadLib based on users response to 3 prompts.
 */
public class MadLibs {

    public static void main(String[] args){

        // Scanner and variables
        Scanner scanner = new Scanner(System.in);
        String adjective, season;
        int coffee;

        // Adjective
        questionPrinter("n adjective");
        adjective = scanner.next();

        // Season
        questionPrinter(" season");
        season = scanner.next();

        // Coffees (whole number)
        questionPrinter("n amount of coffee");
        coffee = scanner.nextInt();

        // Finished with input
        scanner.close();

        // return result
        System.out.println(madLib(adjective,season,coffee));
    }

    /**
     * Takes in params to build the "Mad Lib" and return it as a String
     *
     * @param adjective To describe day
     * @param season To describe season
     * @param coffee Number of cups of coffee
     * @return Generated "Mad Lib"
     */
    // Return the "Mad Lib" string
    public static String madLib(String adjective, String season, int coffee){
        return "On a " + adjective + " " + season + " day, I drink at least " + coffee + " cups of coffee.";
    }

    /**
     * Helper method to handle asking for the types of input
     * @param option What you are asking for
     */
    // Convenience method to ask questions
    public static void questionPrinter(String option){
        System.out.println("Please provide a"+option);
    }
}
