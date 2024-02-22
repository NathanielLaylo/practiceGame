package com.practiceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class monsterManager {
    static List<Monster> area1_Monster = new ArrayList<>();
    static List<Monster> area2_Monster = new ArrayList<>();

    //create multiple monster and add on designated Monster list
    public static void createMonster(){
        area1_Monster.add(new Monster("Goblin", 50, 2, 0, 10, 2));
        area1_Monster.add(new Monster("Slime", 20, 1, 0, 5, 1));
        area1_Monster.add(new Monster("Wolf", 80, 2, 0, 20, 5));

        area2_Monster.add(new Monster("Hobgoblin", 100, 3, 3, 20, 10));
        area2_Monster.add(new Monster("Metal slime", 80, 3, 0, 10, 8));
        area2_Monster.add(new Monster("Wolf", 200, 5, 5, 30, 20));
    }

    //getter
    public static List<Monster> getArea1() {
        return area1_Monster;
    }

    public static List<Monster> getArea2() {
        return area2_Monster;
    }

    //generate random index and use on the list to return random monster
    public static <Monster> Monster getRandomMonster(List<Monster> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        return list.get(randomIndex);
    }

    //return random monster using getRandomMonster and providing specific Monster list
    public static Monster getMonster(int currentArea){
        switch (currentArea){
            case 1:
                return (getRandomMonster(area1_Monster));

            case 2:
                return (getRandomMonster(area2_Monster));
        }
        return null;
    }
}
