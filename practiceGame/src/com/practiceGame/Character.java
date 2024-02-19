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
    int goldCoins = 1;
    int statPoints = 0;
    String playerName = "";

    //earn exp by defeating monster
    public void earnExp(Monster monster){
        currentExp = currentExp + monster.rewardExp;
        System.out.println("Your current exp: " + currentExp + "/" + MAX_EXP);
        if(currentExp >= MAX_EXP){
            characterLevel++;
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
        }
    }
    public void increaseDefence(){
        if (statPoints > 0){
            defencePower++;
            System.out.println("Current defence power: " + defencePower);
        }
    }

    public void playerInfo(){
        System.out.println(" Name: " + playerName +
                "\n Level: " + characterLevel +
                "\n Your current exp: " + currentExp + "/" + MAX_EXP +
                "\n Your current gold: " + goldCoins +
                "\n Stats:: Attack Power: " + attackPower + " Defence Power: " + defencePower +
                "\n Stat Points: " + statPoints);
    }

    //fight monster take object as an argument
    public void fightMonster(Monster monster){
        int monsterHealth = monster.health;
        System.out.println(playerName + " VS " + monster.monsterName);
        while (currentHealth > 0 && monsterHealth > 0){
            monsterHealth = monsterHealth - (attackPower - monster.defencePower);
            currentHealth = currentHealth - (monster.attackPower- defencePower);
            if (monsterHealth <= 0){
                earnExp(monster);
                earnCoins(monster);
                System.out.println("Monster Dead!\nYou earned " + monster.rewardExp + " Exp " +
                        "and " + monster.rewardCoins + " Coin(s)!");
            } else if (currentHealth <= 0){
                System.out.println("You Died!");
            }
        }
    }
}
