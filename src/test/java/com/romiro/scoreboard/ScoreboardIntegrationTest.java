package com.romiro.scoreboard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScoreboardIntegrationTest {

    @Test
    void testScoreboardFlow() {
        Scoreboard scoreboard = new Scoreboard();

        scoreboard.startGame("Argentina", "Australia");
        scoreboard.updateScore("Argentina", "Australia", 3, 1);

        scoreboard.startGame("Germany", "France");
        scoreboard.updateScore("Germany", "France", 2, 2);

        scoreboard.startGame("Spain", "Brazil");
        scoreboard.updateScore("Spain", "Brazil", 10, 2);

        List<Match> summary = scoreboard.getSummary();

        assertEquals(3, summary.size());

        Match topMatch = summary.get(0);
        assertEquals("Spain", topMatch.getHomeTeam());
        assertEquals("Brazil", topMatch.getAwayTeam());
        assertEquals(10, topMatch.getHomeScore());
        assertEquals(2, topMatch.getAwayScore());
    }

    @Test
    void testFinishGameRemovesMatch() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startGame("Mexico", "Canada");
        scoreboard.finishGame("Mexico", "Canada");
        assertTrue(scoreboard.getSummary().isEmpty());
    }
}
