package oct29_2024_hw;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int MAX_AMOUNT_OF_PLAYERS = 6;

    private int count = 0;

    private List<Player> players = new ArrayList<>();

    public void addANewPlayer() {
        if (count < MAX_AMOUNT_OF_PLAYERS) {
            count++;
            Player newPlayer = new Player();
            players.add(new Player());
            System.out.println("You added a new player. Now there's " + count + " players.");
        } else {
            System.out.println("There's 6 players. The teams are full!");
        }
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
