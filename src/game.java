import java.io.*;
import java.util.*;

public class game {

    Deck cardDeck = new Deck();                                                 //initialize cardDeck
    int len = cardDeck.decklist.size();                             //remaining # of cards in the deck
    LinkedList<Player> allPlayers = new LinkedList<Player>();

    public game(int people) {
        for (int i = 0; i < people; i++) {
            allPlayers.add(new Player(people));
        }
    }
}
     //   System.out.println("checking total players "+allPlayers.size());

   // public void printcard(Card cc) {
     //   System.out.print(cc.getShape()+" "+cc.getNumber());
   // }

   // public Card getrandcard() {                                                  //gets a random card from the pile
     //   Random rand = new Random();
       // int item = rand.nextInt(len);
       // len--;
       // return cardDeck.decklist.remove(item);

