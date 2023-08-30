package chapter14;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class CoinTossGame {

  private static String askForGuess(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please choose a side. heads or tails");
    String playerGuess = scanner.next();
    scanner.close();
    return playerGuess;
  }

  private void determineWinner(Coin coin, Player player1, Player player2){
    String winner = player2.getName();

    if (coin.getSide().equals(player1.getGuess())){
      winner = player1.getName();
    }
    System.out.println(winner + " wins the game");
  }

  private static String setPlayer2Guess(String guess, Coin coin){
    if (guess.equals(coin.getHeads())){
      return coin.getTails();
    }else {
      return coin.getHeads();
    }
  }

  public static void main(String[] args){
    CoinTossGame game = new CoinTossGame();
    Coin coin = new Coin();
    Player player1 = new Player("Alpharius");
    Player player2 = new Player("Omegon");

    player1.setGuess(askForGuess());
    player2.setGuess(setPlayer2Guess(player1.getGuess(), coin));
    System.out.println(player1.getName() + " has chosen: " + player1.getGuess());
    System.out.println(player2.getName() + " is therefore: " + player2.getGuess());

    coin.flip();
    System.out.println("The coin landed on: " + coin.getSide());

    game.determineWinner(coin, player1, player2);
  }
}
