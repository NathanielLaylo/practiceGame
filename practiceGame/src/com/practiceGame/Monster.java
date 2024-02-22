package com.practiceGame;

public class Monster {
    int health;
    int rewardExp;
    int attackPower;
    int defencePower;
    int rewardCoins;
    String monsterName;

    public Monster (String monsterName, int health, int attackPower, int defencePower, int rewardExp, int rewardCoins){
        this.monsterName = monsterName;
        this.health = health;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.rewardExp = rewardExp;
        this.rewardCoins = rewardCoins;
    }
}
