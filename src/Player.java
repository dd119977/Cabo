import java.io.*;
import java.util.*;

public class Player {
    LinkedList<Card> pile = new LinkedList<Card>();
    private int sum;

    public Player() {
        this.pile = pile;
        this.sum = 0;
    }

    public Card draw(Deck chosen) {
        if (chosen.decklist.empty() == false) {
            return chosen.decklist.pop();
        }
        else {
            System.out.println("The chosen pile is currently empty. Please choose another option.\n");
            return null;
        }
    }

    public void discard(Card c, int position, Deck openChosen) {
        if (position > 3) {
            openChosen.decklist.push(c);
        }
        else {
            openChosen.decklist.push(pile.get(position));
            pile.set(position, null);
        }
    }

    public void replace(int position, Card toReplace) {
        pile.set(position,toReplace);
        getSum();
    }

    public void getSum() {
        sum = 0;
        if (pile.isEmpty()==false) {
            for (int i = 0; i < pile.size(); i++) {
                if (pile.get(i) != null) {
                    sum += pile.get(i).getNumber();
                }
            }
        }
        System.out.print("Sum : "+sum+"\n");
    }

    public void addtoSum(Card c) {
        if (c != null) {
            sum+=c.getNumber();
        }
    }

    public void potentialSum(int toAdd, int toRemove) {
        System.out.print("Potential Sum : "+(sum+toAdd-toRemove+"\n"));
    }

}
