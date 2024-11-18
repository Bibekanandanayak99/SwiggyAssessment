package com.magicalarena;

public class App 
{
    public static void main( String[] args )
    {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Match match = new Match(playerA, playerB);
        match.start();

    }
}
