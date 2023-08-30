package chapter13;

public class ExceptionDivides {
  public static void divide(){
    int c = 30/0;
  }

  public static void main(String[] args){
    try{
      divide();
    }catch (ArithmeticException e){
      System.out.println("Cannot divide by zero");
      e.printStackTrace();
    }finally {
      System.out.println("Division is fun.");
    }

  }
}
