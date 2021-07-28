package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        // Scanner and variables
        Scanner scanner = new Scanner(System.in);
        String adjective, season, madlib;
        int coffee;

        // Adjective
        System.out.println("Please provide an adjective");
        adjective = scanner.next();

        // Season
        System.out.println("Please provide a season");
        season = scanner.next();

        // Coffees (whole number)
        System.out.println("Please provide and amount of coffee");
        coffee = scanner.nextInt();

        // Generate madlib
        madlib = "On a " + adjective + " " + season + " day, I drink at least " + coffee + " cups of coffee.";

        // return result
        System.out.println(madlib);
    }
}
