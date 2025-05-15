package com.romiro.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {
    private final List<Match> matches = new ArrayList<>();

    public void startGame(String homeTeam, String awayTeam) {
        matches.add(new Match(homeTeam, awayTeam));
    }
}