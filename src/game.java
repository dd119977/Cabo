import java.io.*;
import java.util.*;

public class game {

    Deck cardDeck = new Deck();                                                 //initialize cardDeck
    int len = cardDeck.decklist.size();                             //remaining # of cards in the deck
    LinkedList<Player> allPlayers = new LinkedList<Player>();
    Stack<Card> openPile = new Stack<Card>();

    public game(int people) {
        this.openPile = openPile;
        for (int i = 0; i < people; i++) {
            this.allPlayers.add(new Player());
            createBoard(allPlayers.getLast());
        }
    }

    public void createBoard(Player p1) {                                                 //creates the first board
        for (int i = 0; i < 4; i++) {
            p1.pile.add(cardDeck.decklist.pop());
            p1.addtoSum(p1.pile.getLast());
        }
        printpile(p1);  // want to see the pile
    }

    public void printpile(Player p1) {                                //current pile
        if (p1.pile.isEmpty() == false) {
            System.out.print("Current Pile : \n");
            for (int i = 0; i < p1.pile.size(); i++) {
                p1.pile.get(i).printCard();
                if (i == 0 | i == 2) {
                    System.out.print(" | ");
                } else {
                    System.out.println();
                }
            }
            p1.getSum();
            System.out.println();
        }
    }
}
