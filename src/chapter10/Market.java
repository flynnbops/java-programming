package chapter10;

public class Market {

  public static void main(String[] args){

    Apple green = new Apple();
    Banana ban = new Banana();
    Fruit fru = new Fruit();

    // Fruit
    System.out.println("Calories: " + fru.getCalories());
    fru.makeJuice();

    // Apple
    green.removeCore();
    green.makeJuice();
    System.out.println("Calories: " + green.getCalories());

    // Banana
    ban.peel();
    ban.makeJuice();
    System.out.println("Calories: " + ban.getCalories());



  }
}
