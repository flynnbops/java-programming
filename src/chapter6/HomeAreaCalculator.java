package chapter6;
/*
    Creates two instances of the Rectangle class, to find the total area of two rooms.
 */
public class HomeAreaCalculator {

    public static void main(String[] args){

        // Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaRoom1 = room1.calculateArea();

        // Rectangle 2
        Rectangle room2 = new Rectangle(89,12);
        double areaRoom2 = room2.calculateArea();

        //
        double totalArea =  areaRoom1 + areaRoom2;
        System.out.println("Area of both rooms: " + totalArea);

    }
}
