package com.magicalarena;

public class Player
{
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    public int rollAttackDice() {
        return Dice.roll();
    }

    public int rollDefenseDice() {
        return Dice.roll();
    }

    public int getAttack() {
        return attack;
    }

    public int getStrength() {
        return strength;
    }
}
