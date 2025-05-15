package com.romiro.scoreboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    private Match match;

    @BeforeEach
    void setUp() {
        match = new Match("Mexico", "Canada");
    }

    @Test
    void testUpdateScore() {
        match.updateScore(2, 1);
        assertEquals(2, match.getHomeScore());
        assertEquals(1, match.getAwayScore());
    }

    @Test
    void testTotalScore() {
        match.updateScore(3, 2);
        assertEquals(5, match.getTotalScore());
    }

    @Test
    void testToString() {
        match.updateScore(1, 0);
        assertEquals("Mexico 1 - 0 Canada", match.toString());
    }
}
