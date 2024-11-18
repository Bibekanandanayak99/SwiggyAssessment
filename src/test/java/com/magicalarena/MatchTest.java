package com.magicalarena;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatchTest
{
    @Test
    public void testMatch() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Match match = new Match(playerA, playerB);

        match.start();

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
}
