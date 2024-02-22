package com.practiceGame;

import java.util.ArrayList;
import java.util.List;

public class ItemShop {
    static List<Item> weaponShop = new ArrayList<>();
    static List<Item> armorShop = new ArrayList<>();

    public static void createItem(){
        weaponShop.add(new Item("Wooden Sword", 1, 0, 5));
        weaponShop.add(new Item("Iron Sword", 2, 0, 10));
        weaponShop.add(new Item("Bronze Sword", 3, 0, 15));

        armorShop.add(new Item("Wooden Shield", 0, 1, 5));
        armorShop.add(new Item("Iron Shield", 0, 2, 10));
        armorShop.add(new Item("Bronze Shield", 0, 3, 15));
    }


    public static void showShopItems(){
        System.out.println("--Weapons--");
        for (Item item : weaponShop){
            System.out.println(item.getItemName() + ": Attack Power: " + item.getAttackPower() +
                    " Defence Power: " + item.getDefencePower() + " Price: " + item.getPrice());
        }
        System.out.println("\n--Armors--");
        for (Item item : armorShop){
            System.out.println(item.getItemName() + ": Attack Power: " + item.getAttackPower() +
                    " Defence Power: " + item.getDefencePower() + " Price: " + item.getPrice());
        }
    }
    public static Item itemFinder(List<Item> itemShop, String itemName){
        for (Item item : itemShop){
            if(itemName.equals(item.getItemName().toLowerCase())){
                return item;
            }
        }
        return null;
    }

    public static Item getItem(String itemChoice, String shopChoice){
        switch (shopChoice){
            case "weapon":
                return itemFinder(weaponShop, itemChoice);
            case "armor":
                return itemFinder(armorShop, itemChoice);
            default:
                System.out.println("Input invalid");
                break;
        }
        return null;
    }
}
