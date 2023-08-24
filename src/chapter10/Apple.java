package chapter10;

public class Apple extends Fruit{

  public Apple(){
    setCalories(10);
  }
  @Override
  public void makeJuice(){
    System.out.println("Making Apple juice");
  }

  public void removeCore(){
    System.out.println("Removing apple core");
  }


}
