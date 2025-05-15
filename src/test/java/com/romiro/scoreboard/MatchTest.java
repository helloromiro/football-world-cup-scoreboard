package com.romiro.scoreboard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void testUpdateScore() {
        Match match = new Match("Mexico", "Canada");
        match.updateScore(2, 1);
        assertEquals(2, match.getHomeScore());
        assertEquals(1, match.getAwayScore());
    }
}
