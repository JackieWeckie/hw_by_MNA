package oct29_2024_hw;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Player player1 = Player.addNewPlayer();
        Player player2 = Player.addNewPlayer();
        Player player3 = Player.addNewPlayer();
        Player.info();

        Player player4 = Player.addNewPlayer();
        Player player5 = Player.addNewPlayer();
        Player player6 = Player.addNewPlayer();
        Player.info();

        makeTired(player2, player3);
        Player.info();
        makeTired(player6, player1);
        Player.info();

        Player player7 = Player.addNewPlayer();
        Player player8 = Player.addNewPlayer();
        Player player9 = Player.addNewPlayer();
        Player.info();
    }

    static void makeTired(Player... players) {
        for (Player player : players) {
            if (player == null) {
                continue;
            }
            if (!player.isTired()) {
                player.run();
            }
        }
    }
}
