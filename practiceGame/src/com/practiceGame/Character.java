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
    int goldCoins = 100;
    int statPoints = 0;
    String playerName;
    Item weapon = new Item("", 0, 0, 0);
    Item armor = new Item("", 0, 0, 0);

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
            System.out.println("Character is now full health!\n" +
                    "Remaining gold coins : " + goldCoins);
        }
        else {
            System.out.println("Not enough gold to heal. 5 gold coins required to heal.");
        }
    }

    //fight monster take object as an argument
    public void fightMonster(Monster monster){
        if(currentHealth <= 0){
            System.out.println("Please Heal. Current health is too low to fight!");
        } else {
            int monsterHealth = monster.health;
            int monsterAttack = Math.max(monster.attackPower - defencePower + armor.getDefencePower(), 0);
            int playerAttack = Math.max(attackPower + weapon.getAttackPower() - monster.defencePower,0);
            System.out.println(playerName + " VS " + monster.monsterName);
            while (currentHealth > 0 && monsterHealth > 0) {
                monsterHealth = monsterHealth - playerAttack;
                currentHealth = currentHealth - monsterAttack;
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

    //setter to equip bought item from the shop
    public void equipWeapon(Item weapon){
        if(weapon == null){
            System.out.println("Input Invalid");
        } else if(goldCoins >= weapon.getPrice()){
            this.weapon = weapon;
            System.out.println("You bought and equipped the weapon!");
        } else {
            System.out.println("You cannot buy the item because of insufficient gold coins!");
        }

    }
    public void equipArmor(Item armor){
        if(armor == null){
            System.out.println("Input Invalid");
        } else if(goldCoins >= armor.getPrice()){
            this.armor = armor;
            System.out.println("You bought and equipped the armor!");
        } else {
            System.out.println("You cannot buy the item because of insufficient gold coins!");
        }
    }

}
