package chapter11;

public class Farm {
  public static void main(String[] args){

    Duck donald = new Duck();
    Pig peppa = new Pig();
    Animal ann = new Pig();

    donald.eat();
    donald.makeSound();

    peppa.eat();
    peppa.makeSound();

    ann.makeSound();

  }
}
