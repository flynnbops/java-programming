package chapter5;

/*
5A
Simple method to take in name and return a message
 */

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there " + name + "!");
    }
}
