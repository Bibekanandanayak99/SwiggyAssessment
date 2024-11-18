package com.magicalarena;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiceTest
{
    @Test
    public void testRoll() {
        int roll = Dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }
}
