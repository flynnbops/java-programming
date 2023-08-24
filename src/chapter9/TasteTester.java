package chapter9;

public class TasteTester {
  public static void main(String[] args){

    Cake cake = new Cake();
    WeddingCake weddingCake = new WeddingCake();
    BirthdayCake birthdayCake = new BirthdayCake();

    System.out.println("Parent cake flavour: " + cake.getFlavour());
    System.out.println("Parent cake price: " + cake.getPrice());

    System.out.println("Wedding cake flavour: " + weddingCake.getFlavour());
    System.out.println("Wedding cake price: " + weddingCake.getPrice());
    System.out.println("Wedding cake tiers: " + weddingCake.getTiers());

    System.out.println("Birthday cake flavour: " + birthdayCake.getFlavour());
    System.out.println("Birthday cake price: " + birthdayCake.getPrice());
    System.out.println("Birthday cake candles: " + birthdayCake.getCandles());
  }
}
