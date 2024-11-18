package com.magicalarena;

public class Match
{
    private Player playerA;
    private Player playerB;

    public Match(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            performAttack(attacker, defender);
            if (defender.getHealth() == 0) {
                System.out.println(defender.getName() + " has died. " + attacker.getName() + " wins!");
                break;
            }
            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    private void performAttack(Player attacker, Player defender) {
        int attackRoll = attacker.rollAttackDice();
        int defenseRoll = defender.rollDefenseDice();

        int attackDamage = attackRoll * attacker.getAttack();
        int defense = defenseRoll * defender.getStrength();
        int damage = Math.max(0, attackDamage - defense);

        defender.reduceHealth(damage);

        System.out.println(attacker.getName() + " attacks with roll " + attackRoll + " causing " + attackDamage +
                " damage. " + defender.getName() + " defends with roll " + defenseRoll + " blocking " + defense +
                " damage. " + defender.getName() + " health is now " + defender.getHealth());
    }
}
