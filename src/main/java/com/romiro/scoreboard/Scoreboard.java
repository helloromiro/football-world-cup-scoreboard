package com.romiro.scoreboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Scoreboard {
    private List<Match> matches;

    public Scoreboard() {
        this.matches = new ArrayList<>();
    }

    public void startGame(String homeTeam, String awayTeam) {
        matches.add(new Match(homeTeam, awayTeam));
    }

    public void finishGame(String homeTeam, String awayTeam) {
        matches.removeIf(match -> match.getHomeTeam().equals(homeTeam) && match.getAwayTeam().equals(awayTeam));
    }

    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        for (Match match : matches) {
            if (match.getHomeTeam().equals(homeTeam) && match.getAwayTeam().equals(awayTeam)) {
                match.updateScore(homeScore, awayScore);
                break;
            }
        }
    }

    public List<Match> getSummary() {
        matches.sort(Comparator.comparingInt(Match::getTotalScore).reversed().thenComparing((match1, match2) ->
                match2.toString().compareTo(match1.toString())));
        return matches;
    }

    public List<Match> getMatches() {
        return matches;
    }
}