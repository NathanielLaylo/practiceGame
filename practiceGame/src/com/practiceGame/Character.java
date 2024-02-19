package com.practiceGame;
import com.practiceGame.Monster;
class Character {
    final int MAX_HEALTH  = 100;
    int currentHealth = MAX_HEALTH;
    final int MAX_EXP = 100;
    int currentExp = 0;
    int attackPower = 1;
    int defencePower = 1;
    int goldCoins = 1;
    String name = "";

    public void fightMonster(Monster monster){
        while (currentHealth > 0 && monster.currentHealth > 0){
            System.out.println(monster.currentHealth);
            monster.currentHealth = monster.currentHealth - (attackPower - monster.defencePower);
            currentHealth = currentHealth - (monster.attackPower- defencePower);
            if (monster.currentHealth <= 0){
                currentExp = currentExp + monster.rewardExp;
                goldCoins = goldCoins + monster.rewardCoins;
                System.out.println("Monster Dead!");
            } else if (currentHealth <= 0){
                System.out.println("You Died!");
            }
        }
    }
}
