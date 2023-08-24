package chapter10;

public class Fruit {

  private int calories;

  public Fruit(){
    setCalories(0);
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public void makeJuice(){
    System.out.println("Making Juice");
  }

}
