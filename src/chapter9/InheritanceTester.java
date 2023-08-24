package chapter9;

import java.awt.event.MouseEvent;

public class InheritanceTester {

  public static void main(String[] args) {
    Mother mum= new Mother();
    mum.setName("Trassa");

    System.out.println(mum.getName() + " is a " + mum.getGender());
  }
}
