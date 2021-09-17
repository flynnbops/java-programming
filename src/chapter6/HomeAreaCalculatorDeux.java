package chapter6;

import java.util.Scanner;

/*
    Static methods are ones that can be called without instantiating its class. They do not have knowledge of state within the class.

    For a static method to be able to call a non-static method, it must do so by
    using an object of the type in which the non-static method belongs.
 */

public class HomeAreaCalculatorDeux {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        HomeAreaCalculatorDeux calculator = new HomeAreaCalculatorDeux();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Area of both rooms: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Please the the length of the room: ");
        double length = scanner.nextDouble();

        System.out.println("Please the the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return (room1.calculateArea() + room2.calculateArea());
    }
}
