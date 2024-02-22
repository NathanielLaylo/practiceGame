package com.practiceGame;
import com.practiceGame.Monster;
class Character {
    int characterLevel = 1;
    final int MAX_HEALTH  = 100;
    int currentHealth = MAX_HEALTH;
    final int MAX_EXP = 100;
    int currentExp = 0;
    int attackPower = 1;
    int defencePower = 1;
    int goldCoins = 10;
    int statPoints = 0;
    String playerName = "";

    //earn exp by defeating monster
    public void earnExp(Monster monster){
        currentExp = currentExp + monster.rewardExp;
        System.out.println("Your current exp: " + currentExp + "/" + MAX_EXP);
        if(currentExp >= MAX_EXP){
            characterLevel++;
            currentExp = 0;
            statPoints = statPoints + 2;
            System.out.println("You leveled UP!!");
        }
    }

    //earn coins by defeating monster
    public  void earnCoins(Monster monster){
        goldCoins = goldCoins + monster.rewardCoins;
        System.out.println("Your current gold: " + goldCoins);
    }

    //increase stats using stat points
    public void increaseAttack(){
        if (statPoints > 0){
            attackPower++;
            System.out.println("Current attack power: " + attackPower);
        } else {
            System.out.println("Stat points not enough\n");
        }
    }
    public void increaseDefence(){
        if (statPoints > 0){
            defencePower++;
            System.out.println("Current defence power: " + defencePower);
        } else {
            System.out.println("Stat points not enough\n");
        }
    }

    //print player info
    public void playerInfo(){
        System.out.println(" Name: " + playerName +
                "\n Level: " + characterLevel +
                "\n Your current Exp: " + currentExp + "/" + MAX_EXP +
                "\n Your current Gold: " + goldCoins +
                "\n Your current Health: " + currentHealth + "/" + MAX_HEALTH +
                "\n Stats:: Attack Power: " + attackPower + " Defence Power: " + defencePower +
                "\n Stat Points: " + statPoints + "\n\n");
    }

    //player heal
    public void playerHeal(){
        if (goldCoins >= 5){
            goldCoins = goldCoins - 5;
            currentHealth = MAX_HEALTH;
            System.out.println("Character is now full health!\n");
        }
        else {
            System.out.println("Not enough gold to heal");
        }
    }

    //fight monster take object as an argument
    public void fightMonster(Monster monster){
        if(currentHealth <= 0){
            System.out.println("Please Heal. Current health is too low to fight!");
        } else {
            int monsterHealth = monster.health;
            System.out.println(playerName + " VS " + monster.monsterName);
            while (currentHealth > 0 && monsterHealth > 0) {
                monsterHealth = monsterHealth - (attackPower - monster.defencePower);
                currentHealth = currentHealth - (monster.attackPower - defencePower);
                if (currentHealth <= 0) {
                    System.out.println("You Died!");
                } else if (monsterHealth <= 0) {
                    earnExp(monster);
                    earnCoins(monster);
                    System.out.println("Monster Dead!\nYou earned " + monster.rewardExp + " Exp " +
                            "and " + monster.rewardCoins + " Coin(s)!\n" +
                            "Remaining health: " + currentHealth + "/" + MAX_HEALTH);
                }
            }
        }
    }
}
