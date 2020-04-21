import java.io.*;
import java.util.*;

public class Deck {
	Stack<Card> decklist = new Stack<Card>();
	String[] suits = {"Spade", "Heart", "Club", "Diamond"};

	public Deck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				this.decklist.push(new Card(this.suits[i],j));
			}
		}
		Collections.shuffle(decklist);
	}
}
