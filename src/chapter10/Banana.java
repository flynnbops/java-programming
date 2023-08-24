package chapter10;

public class Banana extends Fruit {
  public Banana(){
    setCalories(45);
  }

  @Override
  public void makeJuice(){
    System.out.println("Making a Banana Smoothie");
  }

  public void peel(){
    System.out.println("Peeling the Banana");
  }

}
