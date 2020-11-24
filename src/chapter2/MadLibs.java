package chapter2;

import java.util.Scanner;

/*
Generates a madlib
Asking for; season, adjective and, number of coffees
To Produce a madlib in
"On a [ADJECTIVE] [SEASON] day, I drink a minimum of [CUPS] cups of coffee."
 */
public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String season,adjective;
        int cups;

        // 1. Explain format
        System.out.println("Welcome to the madlibs generator");
        System.out.println("You will be asked for; season, adjective and, number of coffees");

        // 2. take in season
        System.out.println("Please enter a season");
        season = scanner.next();

        // 3. take in adjective
        System.out.println("Please enter an adjective");
        adjective = scanner.next();

        // 4. Take in number
        System.out.println("Please enter the number of coffees");
        cups = scanner.nextInt();

        scanner.close();
        // 5. Build the madlib
        String madLib = String.format("On a %s %s day, I drink a minimum of %d cups of coffee.", adjective, season, cups);

        // 6. output result
        System.out.println(madLib);
    }
}
