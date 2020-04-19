import java.io.*;
import java.util.*;

public class game {

    Deck cardDeck = new Deck();                                                 //initialize cardDeck
    int len = cardDeck.decklist.size();  //remaining # of cards in the deck

    public game() {
    }

    public void printcard(Card cc) {
        System.out.print(cc.getShape()+" "+cc.getNumber());
    }

    public Card getrandcard() {                                                  //gets a random card from the pile
        Random rand = new Random();
        int item = rand.nextInt(len);
        len--;
        return cardDeck.decklist.remove(item);
    }


}
