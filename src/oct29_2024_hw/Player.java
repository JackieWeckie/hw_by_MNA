package oct29_2024_hw;

import java.util.Random;

public class Player {
    final private int playerId;
    private int stamina;
    private boolean isTired = false;
    static final private int MAX_STAMINA = 10;
    static final private int MIN_STAMINA = 0;
    static final private int MAX_AMOUNT_OF_PLAYERS = 6;
    static int playerCount = 0;
    static int tiredPlayerCount = 0;

    public Player() {
        playerCount++;
        this.playerId = playerCount;
        Random rnd = new Random();
        this.stamina = rnd.nextInt(1, 10);
    }

    public static Player addNewPlayer() {
        if (playerCount - tiredPlayerCount < MAX_AMOUNT_OF_PLAYERS) {
            return new Player();
        } else {
            return null;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public boolean isTired() {
        return isTired;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void run() {
        if (!isTired) {
            this.stamina -= 1;
            if (getStamina() <= MIN_STAMINA) {
                this.isTired = true;
                this.stamina = MIN_STAMINA;
                tiredPlayerCount += 1;
            } else {
                System.out.println("Player " + getPlayerId() + " got tired");
            }
        }
    }

    public static void info() {
        if (playerCount - tiredPlayerCount >= MAX_AMOUNT_OF_PLAYERS) {
            System.out.println("There's no vacant cells to play!");
        } else {
            System.out.println("The team isn't filled. There's " + (MAX_AMOUNT_OF_PLAYERS - (playerCount
                    - tiredPlayerCount)) + " vacant cells.");
        }
    }
}