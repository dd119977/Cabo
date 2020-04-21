import java.util.*;
import java.io.*;

public class play {

    public static void main(String[] args) {
        System.out.println("Welcome to the game.\n");
        System.out.println("Enter the number of players: ");

        Scanner in = new Scanner(System.in);

        int totalPlayers = in.nextInt();

        game demo = new game(totalPlayers);

        int turn = 1;
        int chosenValue = 0;
        do {
            for (int i = 0; i < totalPlayers; i++) {
                nextDraw(turn, i);
                chosenValue = in.nextInt();
                switch (chosenValue) {
                    case (1):
                        if (demo.openPile.empty() == true) {
                            do {
                                System.out.println("Please Choose Again! The open draw pile is currently empty!\n");
                                chosenValue = in.nextInt();
                          //      System.out.println("valueeeeeee of chosne "+chosenValue);
                            } while (chosenValue == 1);
                        } else {
                            demo.openPile.pop().printCard();
                        }
                    case (2):
                        if (demo.allPlayers.get(i).draw(demo.cardDeck) == null) {
                            System.out.println("Since the deck is empty, there are no more turns. ");
                            chosenValue = 3;
                        } else {
                            demo.allPlayers.get(i).draw(demo.cardDeck).printCard();
                        }
                    case (3):
                        System.out.println("This is the finale!\n");
                        break;
                }
                if (chosenValue == 3) {
                    break;
                }
            }
            turn++;
        } while (chosenValue != 3);
       // demo.createBoard();
    }

    public static void nextDraw(int turn, int player) {
        System.out.println("It's turn #"+turn+" for you, Player-"+player+1+"!!! What would you like to do next?\nSelect one of the following options.");
        System.out.println("1. Draw from the open pile.");
        System.out.println("2. Draw from the closed pile.");
        System.out.println("3. Call CABO!");
    }

    public static void nextPlacement() {

    }

}
