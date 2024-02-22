package com.practiceGame;

public class Item {
    int attackPower;
    int defencePower;
    String itemName;
    int price;

    //constructor
    public Item (String itemName, int attackPower, int defencePower, int price){
        this.itemName = itemName;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
    }

    //getter
    public String getItemName(){
        return itemName;
    }
    public int getAttackPower(){
        return attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }
    public int getPrice(){
        return price;
    }
}
