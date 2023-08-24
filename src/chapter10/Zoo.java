package chapter10;

public class Zoo {

  public static void main(String[] args){
    Dog skip = new Dog();
    skip.makeSound();
    skip.fetch();
    feed(skip);

    Animal sasha = new Dog();
    sasha.makeSound();
    feed(sasha);

    sasha = new Cat();
    sasha.makeSound();
    //Cast sasha to a Cat for this method call.
    ((Cat) sasha).scratch();
    feed(sasha);
  }

  public static void feed(Animal animal){
    if (animal instanceof Dog){
      System.out.println("Dog food");
    }

    if (animal instanceof Cat){
      System.out.println("Cat food");
    }
  }
}
