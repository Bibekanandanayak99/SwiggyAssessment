package com.magicalarena;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest
{
    @Test
    public void testReduceHealth() {
        Player player = new Player("TestPlayer", 100, 10, 10);
        player.reduceHealth(20);
        assertEquals(80, player.getHealth());
    }
}
