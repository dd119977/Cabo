import java.io.*;
import java.util.*;

public class Deck {
	LinkedList<Card> decklist = new LinkedList<Card>();
	String[] suits = {"Spade", "Heart", "Club", "Diamond"};

	public Deck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				this.decklist.add(new Card(this.suits[i],j));
			}
		}
	}
}
