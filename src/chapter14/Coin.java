package chapter14;

import java.util.Random;

public class Coin {
  private String side;
  private final String HEADS= "heads";

  private final String TAILS= "tails";

  public String getHeads() {
    return HEADS;
  }

  public String getTails() {
    return TAILS;
  }

  public String flip(){
    if(new Random().nextBoolean()){
      setSide(HEADS);
    }
    else{
      setSide(TAILS);
    }

    return getSide();
  }

  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }
}
