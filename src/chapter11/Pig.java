package chapter11;

public class Pig extends Animal{

  @Override
  public void makeSound() {
      System.out.println("Oink");
  }

  @Override
  public void eat(){
    System.out.println("Pig food today!");
  }
}
