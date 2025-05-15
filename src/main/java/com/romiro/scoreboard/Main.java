package com.romiro.scoreboard;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();

        scoreboard.startGame("Mexico", "Canada");
        scoreboard.startGame("Spain", "Brazil");
        scoreboard.startGame("Germany", "France");

        scoreboard.updateScore("Mexico", "Canada", 0, 5);
        scoreboard.updateScore("Spain", "Brazil", 10, 2);
        scoreboard.updateScore("Germany", "France", 2, 2);

        System.out.println("Match Summary:");
        for (Match match : scoreboard.getSummary()) {
            System.out.println(match);
        }
    }
}
