package oct29_2024_hw;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Collection<Player> players = new ArrayList<>(2);
        System.out.println(players.isEmpty());
        System.out.println(players);

        game.addANewPlayer();
        game.addANewPlayer();
        game.addANewPlayer();
        game.addANewPlayer();
        game.addANewPlayer();
        game.addANewPlayer();
        
        game.addANewPlayer();
    }
}
