import java.util.*;
import java.io.*;

public class play {

    public static void main(String[] args) {
        System.out.println("Welcome to the game.\n");
        System.out.println("Enter the number of players: ");

        Scanner in = new Scanner(System.in);

        int totalPlayers = in.nextInt();

        game demo = new game(totalPlayers);
       // demo.createBoard();
    }
}
