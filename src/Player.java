import java.io.*;
import java.util.*;

public class Player extends game {
    LinkedList<Card> pile = new LinkedList<Card>();
    public void createBoard() {                                                 //creates the first board
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                pile.add(getrandcard());
                printcard(pile.getLast());
                if (j == 0) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
        printpile(pile);
    }

    public void printpile(LinkedList<Card> currentPile) {                                //current pile
        if (currentPile.isEmpty() == false) {
            System.out.print("Current Pile : ");
            for (int i = 0; i < currentPile.size(); i++) {
                printcard(currentPile.get(i));
                System.out.print(" ");
            }
        }
    }


}
