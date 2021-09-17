package chapter6;

public class Rectangle {
    /*
      Encapsulation says:
      Make your fields private and the methods to access them public
     */
    private double length, width;

    // Default constructor
    // Used to set initial values
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;  // Either approach works
        setWidth(width);  // But this uses existing code
    }

    public double calculatePerimeter(){
        return(length * 2) + (width * 2);
    }

    public double calculateArea(){
        return length * width ;
    }

    // Getters and setters
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
