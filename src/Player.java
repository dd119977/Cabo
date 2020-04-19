import java.io.*;
import java.util.*;

public class Player extends game {
    LinkedList<Card> pile = new LinkedList<Card>();

    public Player(int people) {
        super(people);
        createBoard();
    }

    public void createBoard() {                                                 //creates the first board
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                pile.add(cardDeck.decklist.remove());
                if (j == 0) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
        printpile();
    }

    public void printpile() {                                //current pile
        if (pile.isEmpty() == false) {
            System.out.print("Current Pile : ");
            for (int i = 0; i < pile.size(); i++) {
                pile.get(i).printCard();
                System.out.print(" ");
            }
        }
    }


}
